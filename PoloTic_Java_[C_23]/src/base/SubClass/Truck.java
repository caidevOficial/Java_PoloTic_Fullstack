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

package base.SubClass;

import base.Vehicle;
import base.Interface.Common;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class Truck extends Vehicle implements Common{

    // Atributes
    boolean hasCoupled;
    int axisQuantty;
    
    /**
     * Builds the entity with default params.
     */
    public Truck() {
	   super();
	   this.axisQuantty = 0;
	   this.hasCoupled = false;
    }

    /**
     * Builds the entity with 1 param.
     * @param color Color of the entity.
     */
    public Truck(String color) {
	   super(color);
    }

    /**
     * Builds the entity with 2 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     */
    public Truck(String color, String brand) {
	   super(color, brand);
    }

    /**
     * Builds the entity with 3 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     */
    public Truck(String color, String brand, String model) {
	   super(color, brand, model);
    }

    /**
     * Builds the entity with 4 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     */
    public Truck(String color, String brand, String model, String patent) {
	   super(color, brand, model, patent);
    }

    /**
     * Builds the entity with 5 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     */
    public Truck(String color, String brand, String model, String patent, int seatingQuantty) {
	   super(color, brand, model, patent, seatingQuantty);
    }

    /**
     * Builds the entity with 6 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     */
    public Truck(String color, String brand, String model, String patent, String chassisNumber, int seatingQuantty) {
	   super(color, brand, model, patent, chassisNumber, seatingQuantty);
    }

    /**
     * Builds the entity with 5 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param motor Motor model of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     */
    public Truck(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty) {
	   super(color, brand, model, patent, chassisNumber, motor, seatingQuantty);
    }
    
    /**
     * Builds the entity with 8 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param motor Motor model of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     * @param axisQuantty Quantity of axis of the entity.
     */
    public Truck(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty, int axisQuantty) {
	   super(color, brand, model, patent, chassisNumber, motor, seatingQuantty);
	   this.axisQuantty = axisQuantty;
    }
    
    /**
     * Builds the entity with 9 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param motor Motor model of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     * @param axisQuantty Quantity of axis of the entity.
     * @param hasCoupled Possibility of coupled of the entity.
     */
    public Truck(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty, int axisQuantty, boolean hasCoupled) {
	   this(color, brand, model, patent, chassisNumber, motor, seatingQuantty, axisQuantty);
	   this.hasCoupled = hasCoupled;
    }

    /**
     * @return the axisQuantty
     */
    public int getAxisQuantty() {
        return axisQuantty;
    }

    @Override
    public String getBrand() {
	   return super.getBrand();
    }

    @Override
    public String getChassisNumber() {
	   return super.getChassisNumber();
    }

    @Override
    public String getColor() {
	   return super.getColor();
    }

    @Override
    public String getModel() {
	   return super.getModel();
    }

    @Override
    public String getMotor() {
	   return super.getMotor();
    }

    @Override
    public String getPatent() {
	   return super.getPatent();
    }

    @Override
    public int getSeatingQuantty() {
	   return super.getSeatingQuantty();
    }

    /**
     * @return the hasCoupled
     */
    public boolean isHasCoupled() {
        return hasCoupled;
    }

    /**
     * @param axisQuantty the axisQuantty to set
     */
    public void setAxisQuantty(int axisQuantty) {
        this.axisQuantty = axisQuantty;
    }

    @Override
    public void setBrand(String brand) {
	   super.setBrand(brand);
    }

    @Override
    public void setChassisNumber(String chassisNumber) {
	   super.setChassisNumber(chassisNumber);
    }

    @Override
    public void setColor(String color) {
	   super.setColor(color);
    }

    /**
     * @param hasCoupled the hasCoupled to set
     */
    public void setHasCoupled(boolean hasCoupled) {
        this.hasCoupled = hasCoupled;
    }

    @Override
    public void setModel(String model) {
	   super.setModel(model);
    }

    @Override
    public void setMotor(String motor) {
	   super.setMotor(motor);
    }

    @Override
    public void setPatent(String patent) {
	   super.setPatent(patent);
    }

    @Override
    public void setSeatingQuantty(int seatingQuantty) {
	   super.setSeatingQuantty(seatingQuantty);
    }

    @Override
    public void Greetings() {
	   int axisQtty = getAxisQuantty();
	   System.out.println("Hi, i`m a Truck and my axis quantity is: " + axisQtty);
    }
}
