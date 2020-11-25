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

package logic.base.SubClass;

import logic.base.Vehicle;
import logic.base.Interface.*;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class Car extends Vehicle implements ICommon{

    // Atributes
    protected String seatingsMaterial;
    protected int horsePower;

    /**
     * Builds the entity with default params.
     */
    public Car() {
	   super();
	   this.seatingsMaterial = "";
	   this.horsePower = 0;
    }

    /**
     * Builds the entity with 1 param.
     * 
     * @param color Color of the entity.
     */
    public Car(String color) {
	   super(color);
    }

    /**
     * Builds the entity with 2 params.
     * 
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     */
    public Car(String color, String brand) {
	   super(color, brand);
    }

    /**
     * Builds the entity with 3 params.
     * 
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     */
    public Car(String color, String brand, String model) {
	   super(color, brand, model);
    }

    /**
     * Builds the entity with 4 params.
     * 
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     */
    public Car(String color, String brand, String model, String patent) {
	   super(color, brand, model, patent);
    }

    /**
     * Builds the entity with 5 params.
     * 
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     */
    public Car(String color, String brand, String model, String patent, int seatingQuantty) {
	   super(color, brand, model, patent, seatingQuantty);
    }

    /**
     * Builds the entity with 6 params.
     * 
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     */
    public Car(String color, String brand, String model, String patent, String chassisNumber, int seatingQuantty) {
	   super(color, brand, model, patent, chassisNumber, seatingQuantty);
    }

    /**
     * Builds the entity with 7 params.
     * 
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param motor Motor model of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     */
    public Car(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty) {
	   super(color, brand, model, patent, chassisNumber, motor, seatingQuantty);
    }
    
    /**
     * Builds the entity with 8 params.
     * 
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param motor Motor model of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     * @param seatingMAterial Type of material for the seatings of the entity.
     */
    public Car(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty, String seatingsMaterial) {
	   super(color, brand, model, patent, chassisNumber, motor, seatingQuantty);
	   this.seatingsMaterial = seatingsMaterial;
    }
    
    /**
     * Builds the entity with 9 params.
     * 
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param motor Motor model of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     * @param seatingMaterial Type of material for the seatings of the entity.
     * @param horsePower Number of horses of the motor of the entity.
     */
    public Car(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty, String seatingsMaterial, int horsePower) {
	   this(color, brand, model, patent, chassisNumber, motor, seatingQuantty, seatingsMaterial);
	   this.horsePower = horsePower;
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
     * @return the horsePower
     */
    public int getHorsePower() {
	   return horsePower;
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

    /**
     * @return the seatingsMaterial
     */
    public String getSeatingsMaterial() {
	   return seatingsMaterial;
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
     * @param horsePower the horsePower to set
     */
    public void setHorsePower(int horsePower) {
	   this.horsePower = horsePower;
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
	   // TODO Auto-generated method stub
	   return super.getSeatingQuantty();
    }

    @Override
    public void setSeatingQuantty(int seatingQuantty) {
	   // TODO Auto-generated method stub
	   super.setSeatingQuantty(seatingQuantty);
    }

    /**
     * @param seatingsMaterial the seatingsMaterial to set
     */
    public void setSeatingsMaterial(String seatingsMaterial) {
	   this.seatingsMaterial = seatingsMaterial;
    }

    /**
     * Shows a greeting.
     */
    @Override
    public void Greetings() {
	   String brand = getBrand();
	   System.out.println("Hi, i`m a car and my brand is: " + brand);
    }
}
