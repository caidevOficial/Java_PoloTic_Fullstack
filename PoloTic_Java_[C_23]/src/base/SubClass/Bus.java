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
 *
 */
public class Bus extends Vehicle implements Common{
 

    boolean suitableDisabled;
    boolean haveCardLector;
    String busType;
    
    /**
     * Builds the entity with default params.
     */
    public Bus() {
	   super();
	   this.busType = "";
	   this.suitableDisabled = false;
	   this.haveCardLector = false;
    }

    /**
     * Builds the entity with 1 param.
     * @param color Color of the entity.
     */
    public Bus(String color) {
	   super(color);
    }

    /**
     * Builds the entity with 2 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     */
    public Bus(String color, String brand) {
	   super(color, brand);
    }

    /**
     * Builds the entity with 3 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     */
    public Bus(String color, String brand, String model) {
	   super(color, brand, model);
    }

    /**
     * Builds the entity with 4 parqams.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     */
    public Bus(String color, String brand, String model, String patent) {
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
    public Bus(String color, String brand, String model, String patent, int seatingQuantty) {
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
    public Bus(String color, String brand, String model, String patent, String chassisNumber, int seatingQuantty) {
	   super(color, brand, model, patent, chassisNumber, seatingQuantty);
    }

    /**
     * Builds the entity with 7 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param motor Motor model of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     */
    public Bus(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty) {
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
     * @param busType Type of bus of the entity.
     */
    public Bus(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty, String busType) {
	   super(color, brand, model, patent, chassisNumber, motor, seatingQuantty);
	   this.busType = busType;
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
     * @param busType Type of bus of the entity.
     * @param suitableDisabled boolean to dennote if it's suitable for disabled people.
     */
    public Bus(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty, String busType, boolean suitableDisabled) {
	   this(color, brand, model, patent, chassisNumber, motor, seatingQuantty, busType);
	   this.suitableDisabled = suitableDisabled;
    }
    
    /**
     * Builds the entity with 10 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param model Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param motor Motor model of the entity.
     * @param seatingQuantty Quantity of seating of the entity.
     * @param busType Type of bus of the entity.
     * @param suitableDisabled boolean to dennote if it's suitable for disabled people.
     * @param haveCardLector Boolean to dennote if the entity has card Lector or not.
     */
    public Bus(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty, String busType, boolean suitableDisabled, boolean haveCardLector) {
	   this(color, brand, model, patent, chassisNumber, motor, seatingQuantty, busType, suitableDisabled);
	   this.haveCardLector = haveCardLector;
    }

    @Override
    public String getBrand() {
	   // TODO Auto-generated method stub
	   return super.getBrand();
    }

    /**
     * @return the busType
     */
    public String getBusType() {
        return busType;
    }

    @Override
    public String getChassisNumber() {
	   // TODO Auto-generated method stub
	   return super.getChassisNumber();
    }

    @Override
    public String getColor() {
	   // TODO Auto-generated method stub
	   return super.getColor();
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

    @Override
    public String getModel() {
	   // TODO Auto-generated method stub
	   return super.getModel();
    }

    @Override
    public String getMotor() {
	   // TODO Auto-generated method stub
	   return super.getMotor();
    }

    @Override
    public String getPatent() {
	   // TODO Auto-generated method stub
	   return super.getPatent();
    }

    /**
     * @return the haveCardLector
     */
    public boolean isHaveCardLector() {
        return haveCardLector;
    }

    /**
     * @return the suitableDisabled
     */
    public boolean isSuitableDisabled() {
        return suitableDisabled;
    }

    @Override
    public void setBrand(String brand) {
	   // TODO Auto-generated method stub
	   super.setBrand(brand);
    }

    /**
     * @param busType the busType to set
     */
    public void setBusType(String busType) {
        this.busType = busType;
    }

    @Override
    public void setChassisNumber(String chassisNumber) {
	   // TODO Auto-generated method stub
	   super.setChassisNumber(chassisNumber);
    }

    @Override
    public void setColor(String color) {
	   // TODO Auto-generated method stub
	   super.setColor(color);
    }

    
    /**
     * @param haveCardLector the haveCardLector to set
     */
    public void setHaveCardLector(boolean haveCardLector) {
        this.haveCardLector = haveCardLector;
    }

    @Override
    public void setModel(String model) {
	   // TODO Auto-generated method stub
	   super.setModel(model);
    }

    @Override
    public void setMotor(String motor) {
	   // TODO Auto-generated method stub
	   super.setMotor(motor);
    }

    @Override
    public void setPatent(String patent) {
	   // TODO Auto-generated method stub
	   super.setPatent(patent);
    }

    /**
     * @param suitableDisabled the suitableDisabled to set
     */
    public void setSuitableDisabled(boolean suitableDisabled) {
        this.suitableDisabled = suitableDisabled;
    }
    
    @Override
    public void Greetings() {
	   int seatingQuantity = getSeatingQuantty();
	   System.out.println("Hi, i`m a Bus and my seatings are: " + seatingQuantity);
    }

}
