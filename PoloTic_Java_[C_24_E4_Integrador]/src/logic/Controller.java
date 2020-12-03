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

import java.util.Date;
import java.util.LinkedList;

import logic.entities.Course;
import logic.entities.Professor;

/**
 * @author FacuFalcone - CaidevOficial
 *
 */
public class Controller {
    static LinkedList<Course> allCourses = new LinkedList<Course>();
    static LinkedList<Professor> allProfessors = new LinkedList<Professor>();
    
    public static void addCourseLL(String id, String qtty, String name, boolean certif) {
	   int idCourse = Integer.parseInt(id);
	   int hours = Integer.parseInt(qtty);
	   
	   allCourses.add(new Course(idCourse, name, hours, certif));
    }
    
    public static void addProfessorLL(String dni, String name, String surname, Date birthdate, String speciality, Course aCourse) {
	   allProfessors.add(new Professor(dni, name, surname, birthdate, speciality, aCourse));
    }
    
    public String PrintCourses() {
	   String message = "";
	   for (Course course : allCourses) {
		  message += course.toString();
	   }
	   return message;
    }
    
}
