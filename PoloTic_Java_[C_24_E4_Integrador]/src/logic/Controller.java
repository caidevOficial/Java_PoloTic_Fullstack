/*
 * Copyright (C) 2020 FacuFalcone - CaidevOficial
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package logic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Vector;

import logic.entities.Course;
import logic.entities.Professor;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class Controller {

    // Attributes
    static Vector<Course> allCourses = new Vector<Course>();
    static LinkedList<Professor> allProfessors = new LinkedList<Professor>();

    // Methods
    
    /**
     * Pases the string into a valid Date.
     * @param fecha string to be parse.
     * @return the string parsed into a date.
     */
    public static Date ParseFecha(String fecha) {
	   SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
	   Date fechaDate = null;
	   try {
		  fechaDate = formato.parse(fecha);
	   } catch (Exception e) {
		  System.out.println(e);
	   }
	   return fechaDate;
    }

    /**
     * Obtains a new id.
     * @param thisVector Vector for search the id.
     * @return the id to use.
     */
    private static int SearchNewID(Vector<Course> thisVector) {
	   int nextID = 1;
	   if (!thisVector.isEmpty()) {
		  for (Course course : thisVector) {
			 if (nextID == course.getCourse_id()) {
				nextID++;
			 } else if (nextID < course.getCourse_id()) {
				nextID = course.getCourse_id();
			 }
		  }
	   }

	   return nextID;
    }

    /**
     * Adds a course into the Vector.
     * @param qtty quantity of hours of the course.
     * @param name name of the course.
     * @param certif bollean if has certification or not.
     */
    public static void addCourseLL(String qtty, String name, boolean certif) {
	   int idCourse = SearchNewID(allCourses);
	   int hours = Integer.parseInt(qtty);

	   allCourses.add(new Course(idCourse, name, hours, certif));
    }

    /**
     * @return the allCourses
     */
    public static Vector<Course> getAllCourses() {
	   return allCourses;
    }

    /**
     * @return the allProfessors
     */
    public static LinkedList<Professor> getAllProfessors() {
	   return allProfessors;
    }

    /**
     * Adds a professor into the LL.
     * @param dni dni of the professor.
     * @param name name of the professor.
     * @param surname surname of the professor.
     * @param birthdate birthdate of the professor.
     * @param speciality speciality of the professor.
     * @param aCourseindex course assigned of the professor.
     * @return true if ok.
     */
    public static boolean addProfessorLL(String dni, String name, String surname, String birthdate, String speciality, int aCourseindex) {

	   try {
		  System.out.println("Entro al try");
		  Course thisCourse = allCourses.get(aCourseindex);
		  System.out.println("Cargo el curso segun el indice pasado");
		  allProfessors.add(new Professor(dni, name, surname, ParseFecha(birthdate), speciality, thisCourse));
		  System.out.println("Cargo el profesor");
		  return true;

	   } catch (Exception e) {
		  System.out.println("No se encontro el curso\n");
		  System.out.println(e);
	   }
	   return false;
    }

    /**
     * Returns the info of all courses in the Vector.
     * @return info of the courses.
     */
    public String PrintCourses() {
	   String message = "";
	   for (Course course : allCourses) {
		  message += course.toString();
	   }
	   return message;
    }

    /**
     * Returns the info of all professors in the LL.
     * @return info of all professors.
     */
    public String PrintProfessors() {
	   String message = "";
	   for (Professor profe : allProfessors) {
		  message += profe.toString();
	   }
	   return message;
    }
}
