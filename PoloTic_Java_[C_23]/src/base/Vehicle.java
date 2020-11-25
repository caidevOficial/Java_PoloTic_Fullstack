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

package base;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class Vehicle {

	// Atributes
	protected String color;
	protected String brand;
	protected String model;
	protected String patent;
	protected int doorsQuantty;
	
	/**
	 * Builds the entity with default params.
	 */
	public Vehicle() {
		this.color = "";
		this.brand = "";
		this.model = "";
		this.patent = "";
		this.doorsQuantty = 0;
	}
	
	/**
	 * Builds the entity with 1 param
	 * @param color
	 */
	public Vehicle(String color) {
		this.color = color;
	}
	
	/**
	 * Builds the entity with 2 params.
	 * @param color
	 * @param brand
	 */
	public Vehicle(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	
	/**
	 * @param color
	 * @param brand
	 * @param model
	 */
	public Vehicle(String color, String brand, String model) {
		this.color = color;
		this.brand = brand;
		this.model = model;
	}
	
	/**
	 * Builds the entity with 3 params.
	 * @param color
	 * @param brand
	 * @param model
	 * @param patent
	 */
	public Vehicle(String color, String brand, String model, String patent) {
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.patent = patent;
	}
	
	/**
	 * Builds the entity with 4 params.
	 * @param color
	 * @param brand
	 * @param model
	 * @param patent
	 * @param doorsQuantty
	 */
	public Vehicle(String color, String brand, String model, String patent, int doorsQuantty) {
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.patent = patent;
		this.doorsQuantty = doorsQuantty;
	}
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * @return the patent
	 */
	public String getPatent() {
		return patent;
	}
	
	/**
	 * @return the doorsQuantty
	 */
	public int getDoorsQuantty() {
		return doorsQuantty;
	}
	
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * @param patent the patent to set
	 */
	public void setPatent(String patent) {
		this.patent = patent;
	}
	
	/**
	 * @param doorsQuantty the doorsQuantty to set
	 */
	public void setDoorsQuantty(int doorsQuantty) {
		this.doorsQuantty = doorsQuantty;
	}
}
