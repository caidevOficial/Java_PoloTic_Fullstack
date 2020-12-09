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
package persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.classes.Student;
import persistence.exceptions.NonexistentEntityException;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class PersistenceController {
    
    // instance
    StudentJpaController studentJPA = new StudentJpaController();
    
    public void createStudent(Student stud){
        try {
            studentJPA.create(stud);
            System.out.println("ID " + stud.getDni() + " Creado con exito!");
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("EL ID "+stud.getDni()+" ya existe en la base de datos.");
        }
    }

    public void deleteStudent(String string) {
        try {
            studentJPA.destroy(string);
            System.out.println("ID "+ string +" Borrado con exito!");
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("El ID "+string+" no existe en la base de datos.");
        }
    }

    public void modifyStudent(Student stud1) {
        try {
            studentJPA.edit(stud1);
            System.out.printf("Alumno Modificado con exito!\n%s %s %s\n",stud1.getDni(), stud1.getName(), stud1.getSurname());
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al modificar ID " + stud1.getDni());
        }
    }

    public List<Student> showStudents() {
        List<Student> allStudents = studentJPA.findStudentEntities();
        return allStudents;
    }

    public Student showSpecificEntity(String id) {
        Student myStud = studentJPA.findStudent(id);
        return myStud;
    }
}
