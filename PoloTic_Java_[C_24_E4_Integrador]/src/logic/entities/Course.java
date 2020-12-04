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

package logic.entities;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class Course {

    // Attributes
    int course_id;
    String course_name;
    int qttyHoursPerWeek;
    boolean hasCertification;

    /**
     * Builds the entity empty.
     */
    public Course() {
    }

    /**
     * Builds the entity with 1 param.
     * @param course_id Id of the entity.
     */
    public Course(int course_id) {
	   this.course_id = course_id;
    }

    /**
     * Builds the entity with 2 params.
     * @param course_id Id of the entity.
     * @param course_name name of the entity.
     */
    public Course(int course_id, String course_name) {
	   this.course_id = course_id;
	   this.course_name = course_name;
    }

    /**
     * Builds the entity with 3 params.
     * @param course_id Id of the entity.
     * @param course_name name of the entity.
     * @param qttyHoursPerWeek hours of the entity.
     */
    public Course(int course_id, String course_name, int qttyHoursPerWeek) {
	   this.course_id = course_id;
	   this.course_name = course_name;
	   this.qttyHoursPerWeek = qttyHoursPerWeek;
    }

    /**
     * Builds the entity with 4 params.
     * @param course_id Id of the entity.
     * @param course_name name of the entity.
     * @param qttyHoursPerWeek hours of the entity.
     * @param hasCertification boolean to know if the entity has certification or not.
     */
    public Course(int course_id, String course_name, int qttyHoursPerWeek, boolean hasCertification) {
	   this.course_id = course_id;
	   this.course_name = course_name;
	   this.qttyHoursPerWeek = qttyHoursPerWeek;
	   this.hasCertification = hasCertification;
    }

    /**
     * @return the course_id
     */
    public int getCourse_id() {
	   return course_id;
    }

    /**
     * @return the course_name
     */
    public String getCourse_name() {
	   return course_name;
    }

    /**
     * @return the qttyHoursPerWeek
     */
    public int getQttyHoursPerWeek() {
	   return qttyHoursPerWeek;
    }

    /**
     * @return the hasCertification
     */
    public boolean isHasCertification() {
	   return hasCertification;
    }

    /**
     * @param course_id the course_id to set
     */
    public void setCourse_id(int course_id) {
	   this.course_id = course_id;
    }

    /**
     * @param course_name the course_name to set
     */
    public void setCourse_name(String course_name) {
	   if (course_name != null) {
		  this.course_name = course_name;
	   }
    }

    /**
     * @param qttyHoursPerWeek the qttyHoursPerWeek to set
     */
    public void setQttyHoursPerWeek(int qttyHoursPerWeek) {
	   if (qttyHoursPerWeek >= 0) {
		  this.qttyHoursPerWeek = qttyHoursPerWeek;
	   }
    }

    /**
     * @param hasCertification the hasCertification to set
     */
    public void setHasCertification(boolean hasCertification) {
	   this.hasCertification = hasCertification;
    }

    @Override
    public String toString() {
	   int id = getCourse_id();
	   String name = getCourse_name();
	   int hours = getQttyHoursPerWeek();
	   boolean certif = isHasCertification();
	   String message = "ID: " + id + " | Name: " + name + " | Hours: " + hours + " | Certif: " + certif + "\n";
	   return message;
    }

    
}
