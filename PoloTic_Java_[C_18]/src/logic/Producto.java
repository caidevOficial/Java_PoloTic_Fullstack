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

package logic;

/**
 * @author CaidevOficial
 *
 */
public class Producto {

    // Attributes.
    protected int codigo;
    protected int cantidad;
    protected String talle;
    protected String color;
    protected String marca;
    protected String material;
    protected String tipo;

    /**
     * Builds the entity with default values.
     */
    public Producto() {
	this.cantidad = 0;
	this.codigo = 0;
	this.color = "";
	this.marca = "";
	this.material = "";
	this.talle = "";
	this.tipo = "";
    }

    /**
     * Builds the entity with 1 param.
     * @param codigo the code of the entity.
     */
    public Producto(int codigo) {
	this();
	if (codigo >= 0) {
	    this.codigo = codigo;
	}
    }

    /**
     * Builds the entity with 2 params.
     * @param codigo the code of the entity.
     * @param talle the size of the entity.
     */
    public Producto(int codigo, String talle) {
	this(codigo);
	if (talle != null) {
	    this.talle = talle;
	}
    }

    /**
     * Builds the entity with 3 params.
     * @param codigo the code of the entity.
     * @param talle the size of the entity.
     * @param color the color of the entity.
     */
    public Producto(int codigo, String talle, String color) {
	this(codigo, talle);
	if (talle != null) {
	    this.color = color;
	}
    }

    /**
     * Builds the entity with 4 params.
     * @param codigo the code of the entity.
     * @param talle the size of the entity.
     * @param color the color of the entity.
     * @param marca the brand of the entity.
     */
    public Producto(int codigo, String talle, String color, String marca) {
	this(codigo, talle, color);
	if (marca != null) {
	    this.marca = marca;
	}
    }

    /**
     * Builds the entity with 5 params.
     * @param codigo the code of the entity.
     * @param talle the size of the entity.
     * @param color the color of the entity.
     * @param marca the brand of the entity.
     * @param material the material of the entity.
     */
    public Producto(int codigo, String talle, String color, String marca, String material) {
	this(codigo, talle, color, marca);
	if (material != null) {
	    this.material = material;
	}
    }

    /**
     * Builds the entity with 6 params.
     * @param codigo the code of the entity.
     * @param talle the size of the entity.
     * @param color the color of the entity.
     * @param marca the brand of the entity.
     * @param material the material of the entity.
     * @param tipo the type of the entity.
     */
    public Producto(int codigo, String talle, String color, String marca, String material, String tipo) {
	this(codigo, talle, color, marca, material);
	if (tipo != null) {
	    this.tipo = tipo;
	}
    }

    /**
     * Builds the entity with 7 params.
     * @param codigo the code of the entity.
     * @param talle the size of the entity.
     * @param color the color of the entity.
     * @param marca the brand of the entity.
     * @param material the material of the entity.
     * @param tipo the type of the entity.
     * @param cantidad the quantity of the entity.
     */
    public Producto(int codigo, String talle, String color, String marca, String material, String tipo, int cantidad) {
	this(codigo, talle, color, marca, material, tipo);
	if (cantidad >= 0) {
	    this.cantidad = cantidad;
	}
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
	return codigo;
    }

    /**
     * @return the talle
     */
    public String getTalle() {
	return talle;
    }

    /**
     * @return the color
     */
    public String getColor() {
	return color;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
	return marca;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
	return material;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
	return tipo;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
	return cantidad;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
	this.codigo = codigo;
    }

    /**
     * @param talle the talle to set
     */
    public void setTalle(String talle) {
	this.talle = talle;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
	this.color = color;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
	this.marca = marca;
    }

    /**
     * @param material the material to set.
     */
    public void setMaterial(String material) {
	this.material = material;
    }

    /**
     * @param tipo the tipo to set.
     */
    public void setTipo(String tipo) {
	this.tipo = tipo;
    }

    /**
     * @param cantidad the cantidad to set.
     */
    public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
    }
}
