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
import javax.persistence.ManyToOne;

/**
 * @author FacuFalcone - CaidevOficial
 */
@Entity
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    @Basic
    String name;
    String kind;
    String race;
    int age;
    //@ManyToOne
    Competitor owner;

    public Pet() {
    }

    public Pet(int id, String name, String kind, String race, int age, Competitor owner) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.race = race;
        this.age = age;
        this.owner = owner;
    }

    public Competitor getOwner() {
        return owner;
    }

    public void setOwner(Competitor owner) {
        this.owner = owner;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
