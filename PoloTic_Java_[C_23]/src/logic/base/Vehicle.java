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

package logic.base;

import logic.base.Abstract.IVehicle;
import logic.base.Interface.Common;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class Vehicle extends IVehicle implements Common{

	/**
	 * Builds the entity with default params.
	 */
	public Vehicle() {
		this.color = "";
		this.brand = "";
		this.model = "";
		this.patent = "";
		this.seatingQuantty = 0;
		this.chassisNumber = "";
		this.motor = "";
	}
	
	/**
	 * Builds the entity with 1 param
	 * @param color Color of the entity.
	 */
	public Vehicle(String color) {
		this.color = color;
	}

    /**
	 * Builds the entity with 2 params.
	 * @param color Color of the entity.
	 * @param brand Brand of the entity.
	 */
	public Vehicle(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}

    /**
     * Builds the entity with 3 params.
	 * @param color Color of the entity.
	 * @param brand Brand of the entity.
	 * @param brand Model of the entity.
	 */
	public Vehicle(String color, String brand, String model) {
		this.color = color;
		this.brand = brand;
		this.model = model;
	}
	
	/**
	 * Builds the entity with 4 params.
	 * @param color Color of the entity.
	 * @param brand Brand of the entity.
	 * @param brand Model of the entity.
	 * @param patent Patent of the entity.
	 */
	public Vehicle(String color, String brand, String model, String patent) {
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.patent = patent;
	}
	
	/**
	 * Builds the entity with 5 params.
	 * @param color Color of the entity.
	 * @param brand Brand of the entity.
	 * @param brand Model of the entity.
	 * @param patent Patent of the entity.
	 * @param doorsQuantty
	 */
	public Vehicle(String color, String brand, String model, String patent, int seatingQuantty) {
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.patent = patent;
		this.seatingQuantty = seatingQuantty;
	}
	
	/**
     * Builds the entity with 6 params.
     * @param color Color of the entity.
     * @param brand Brand of the entity.
     * @param brand Model of the entity.
     * @param patent Patent of the entity.
     * @param chassisNumber Chassis number of the entity.
     * @param doorsQuantty
     */
    public Vehicle(String color, String brand, String model, String patent, String chassisNumber, int seatingQuantty) {
	   this.color = color;
	   this.brand = brand;
	   this.model = model;
	   this.patent = patent;
	   this.chassisNumber = chassisNumber;
	   this.seatingQuantty = seatingQuantty;
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
    public Vehicle(String color, String brand, String model, String patent, String chassisNumber, String motor, int seatingQuantty) {
	   this.color = color;
	   this.brand = brand;
	   this.model = model;
	   this.patent = patent;
	   this.chassisNumber = chassisNumber;
	   this.motor = motor;
	   this.seatingQuantty = seatingQuantty;
    }
	
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
     * @return the chassisNumber
     */
    public String getChassisNumber() {
        return chassisNumber;
    }
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * @return the doorsQuantty
	 */
	public int getSeatingQuantty() {
		return seatingQuantty;
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	
	/**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }
	
	/**
	 * @return the patent
	 */
	public String getPatent() {
		return patent;
	}
	
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
     * @param chassisNumber the chassisNumber to set
     */
    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }
	
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

    /**
	 * @param doorsQuantty the doorsQuantty to set
	 */
	public void setSeatingQuantty(int seatingQuantty) {
		this.seatingQuantty = seatingQuantty;
	}

    /**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
	 * @param patent the patent to set
	 */
	public void setPatent(String patent) {
		this.patent = patent;
	}

    @Override
    public void Greetings() {
	   
    }
}
