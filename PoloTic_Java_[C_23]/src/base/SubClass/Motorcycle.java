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
public class Motorcycle extends Vehicle implements Common{

    // Atributes
    protected String handleMaterial;
    protected int displacement;
    
    /**
     * Builds the entity with default params.
     */
    public Motorcycle() {
	   super();
	   this.handleMaterial = "";
	   this.displacement = 0;
    }

    /**
     * Builds the entity with 1 param.
     * @param color Color of the entity.
     */
    public Motorcycle(String color) {
	   super(color);
    }

    /**
     * @param handleMaterial Material of the handle of the entity.
     * @param displacement Amount of displacement of the entity.
     */
    public Motorcycle(String handleMaterial, int displacement) {
	   super();
	   this.handleMaterial = handleMaterial;
	   this.displacement = displacement;
    }

    /**
     * Builds the entity with 2 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     */
    public Motorcycle(String color, String brand) {
	   super(color, brand);
    }

    /**
     * Builds the entity with 3 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param brand Model of the entity.
     */
    public Motorcycle(String color, String brand, String model) {
	   super(color, brand, model);
    }

    /**
     * Builds the entity with 4 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param brand Model of the entity.
     * @param patent Patent of the entity.
     */
    public Motorcycle(String color, String brand, String model, String patent) {
	   super(color, brand, model, patent);
    }

    /**
     * Builds the entity with 5 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param brand Model of the entity.
     * @param patent Patent of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     */
    public Motorcycle(String color, String brand, String model, String patent, int seatingQuantty) {
	   super(color, brand, model, patent, seatingQuantty);
    }

    /**
     * Builds the entity with 6 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param brand Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     */
    public Motorcycle(String color, String brand, String model, String patent, String chassisNumber, int seatingQuantty) {
	   super(color, brand, model, patent, chassisNumber, seatingQuantty);
    }

    /**
     * Builds the entity with 7 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param brand Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param motor Motor model of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     */
    public Motorcycle(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty) {
	   super(color, brand, model, patent, chassisNumber, motor, seatingQuantty);
    }
    
    /**
     * Builds the entity with 8 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param brand Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param motor Motor model of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     * @param handleMaterial Material of the handle of the entity.
     */
    public Motorcycle(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty, String handleMaterial) {
	   this(color, brand, model, patent, chassisNumber, motor, seatingQuantty);
	   this.handleMaterial = handleMaterial;
    }
    
    /**
     * Builds the entity with 9 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param brand Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param motor Motor model of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     * @param handleMaterial MAterial of the handle of the entity.
     * @param displacement Amount of displacement of the entity.
     */
    public Motorcycle(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty, String handleMaterial, int displacement) {
	   this(color, brand, model, patent, chassisNumber, motor, seatingQuantty, handleMaterial);
	   this.displacement = displacement;
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

    /**
     * @return the displacement
     */
    public int getDisplacement() {
        return displacement;
    }

    /**
     * @return the handleMaterial
     */
    public String getHandleMaterial() {
        return handleMaterial;
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
     * @param displacement the displacement to set
     */
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    
    /**
     * @param handleMaterial the handleMaterial to set
     */
    public void setHandleMaterial(String handleMaterial) {
        this.handleMaterial = handleMaterial;
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
    public int getSeatingQuantty() {
	   return super.getSeatingQuantty();
    }

    @Override
    public void setSeatingQuantty(int seatingQuantty) {
	   super.setSeatingQuantty(seatingQuantty);
    }

    @Override
    public void Greetings() {
	   int displacement = getDisplacement();
	   System.out.println("Hi, i`m a MotorCycle and my displacement is: " + displacement);
    }
}
