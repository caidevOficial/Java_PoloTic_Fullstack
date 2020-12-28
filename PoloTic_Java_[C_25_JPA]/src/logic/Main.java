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
import java.util.List;
import logic.classes.Student;
import persistence.PersistenceController;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class Main {
    
    public static void main(String[] args){
        // instance the PC
        PersistenceController PC = new PersistenceController();

        // create entity
        //Student stud1 = new Student("55444222", "Facu", "Kun", new Date("02/25/1990"));
        Student stud2 = new Student("22333444", "Agostina", "Viso", new Date("04/08/1994"));
        
        // Create the entity into the db
        //PC.createStudent(stud1);
        PC.createStudent(stud2);
        
        // Edit values of the entity and modify them in the db.
        //stud1.setName("Facu");
        //stud1.setSurname("Falcone");
        //stud1.setDni("11222333");
        //PC.modifyStudent(stud1);
        
        // Delete from the db the entity
        //PC.deleteStudent("35055008");

        // Shows all the entities from the db
        List<Student> allStudents = PC.showStudents();
        System.out.println("\nLista de estudiantes:");
        System.out.println("   DNI     APELLIDO   NOMBRE");
        for (Student allStudent : allStudents) {
            System.out.printf("%10s %-10s %-10s\n",allStudent.getDni(),allStudent.getSurname(), allStudent.getName());
        }
        
        // Shows an specific entity from the db
        Student myStud = PC.showSpecificEntity("35055007");
        System.out.printf("%10s %-10s %-10s\n",myStud.getDni(),myStud.getSurname(), myStud.getName());
    }
}
