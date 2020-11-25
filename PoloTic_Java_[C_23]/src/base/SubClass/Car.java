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

/**
 * @author FacuFalcone - CaidevOficial
 *
 */
public class Car extends Vehicle {

    /**
     * Builds the entity with default params.
     */
    public Car() {
	   super();
    }

    /**
     * Builds the entity with 1 param.
     * @param color
     */
    public Car(String color) {
	   super(color);
    }

    /**
     * Builds the entity with 2 params.
     * @param color
     * @param brand
     */
    public Car(String color, String brand) {
	   super(color, brand);
    }

    /**
     * Builds the entity with 3 params.
     * @param color
     * @param brand
     * @param model
     */
    public Car(String color, String brand, String model) {
	   super(color, brand, model);
    }

    /**
     * Builds the entity with 4 params.
     * @param color
     * @param brand
     * @param model
     * @param patent
     */
    public Car(String color, String brand, String model, String patent) {
	   super(color, brand, model, patent);
    }

    /**
     * Builds the entity with 5 params.
     * @param color
     * @param brand
     * @param model
     * @param patent
     * @param doorsQuantty
     */
    public Car(String color, String brand, String model, String patent, int doorsQuantty) {
	   super(color, brand, model, patent, doorsQuantty);
    }

    @Override
    public String getColor() {
	   return super.getColor();
    }

    @Override
    public String getBrand() {
	   return super.getBrand();
    }

    @Override
    public String getModel() {
	   return super.getModel();
    }

    @Override
    public String getPatent() {
	   return super.getPatent();
    }

    @Override
    public int getDoorsQuantty() {
	   return super.getDoorsQuantty();
    }

    @Override
    public void setColor(String color) {
	   super.setColor(color);
    }

    @Override
    public void setBrand(String brand) {
	   super.setBrand(brand);
    }

    @Override
    public void setModel(String model) {
	   super.setModel(model);
    }

    @Override
    public void setPatent(String patent) {
	   super.setPatent(patent);
    }

    
    @Override
    public void setDoorsQuantty(int doorsQuantty) {
	   super.setDoorsQuantty(doorsQuantty);
    }
    
    /**
     * Shows the data of the entity.
     */
    public void ShowData() {
	   String patent = getPatent();
	   String brand = getBrand();
	   String model = getModel();
	   
	   System.out.printf("Patent: %s.\nBrand: %s.\nModel: %s.\n",patent, brand, model);
	   System.out.println("__________________");
    }
}
