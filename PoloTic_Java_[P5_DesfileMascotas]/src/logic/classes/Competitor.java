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

package logic.classes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author FacuFalcone - CaidevOficial
 */
@Entity
public class Competitor implements Serializable{
    // Attributes
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    
    @Basic
    String name;
    String surname;
    String city;
    int age;

    public Competitor() {
    }

    public Competitor(int id) {
        this.id = id;
    }

    public Competitor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Competitor(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Competitor(int id, String name, String surname, String city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public Competitor(int id, String name, String surname, String city, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
