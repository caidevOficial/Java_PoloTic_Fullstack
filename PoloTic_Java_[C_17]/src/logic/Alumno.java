/*
 * Copyright (C) 2020 CaidevOficial
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

import java.util.Date;

/**
 * @author FacuFalcone
 *
 */
public class Alumno {

	//Attributes.
	String dni;
	String nombre;
	String apellido;
	String direccion;
	Date fechaNac;
	
	/**
	 * Builds the entity with default values.
	 */
	Alumno(){
		this.dni = "0";
		this.nombre = "";
		this.apellido = "";
		this.direccion = "";
		this.fechaNac = null;
	}
	
	/**
	 * Builds the entity with 1 param.
	 * @param dni dni to set.
	 */
	Alumno(String dni){
		this();
		if(dni!=null) {
			this.dni = dni;
		}
	}
	
	/**
	 * Builds the entity with 2 params.
	 * @param dni dni to set.
	 * @param nombre name to set.
	 */
	Alumno(String dni, String nombre){
		this(dni);
		if(nombre!=null) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Builds the entity with 3 params.
	 * @param dni dni to set.
	 * @param nombre name to set.
	 * @param apellido surname to set.
	 */
	Alumno(String dni, String nombre, String apellido){
		this(dni, nombre);
		if(apellido!=null) {
			this.apellido = apellido;
		}
	}
	
	/**
	 * Builds the entity with 4 params.
	 * @param dni dni to set.
	 * @param nombre name to set.
	 * @param apellido surname to set.
	 * @param direcciona ddress to set.
	 */
	Alumno(String dni, String nombre, String apellido, String direccion){
		this(dni, nombre, apellido);
		if(direccion!=null) {
			this.direccion = direccion;
		}
	}
	
	/**
	 * Builds the entity with 5 params.
	 * @param dni dni to set.
	 * @param nombre name to set.
	 * @param apellido surname to set.
	 * @param direccion address to set.
	 * @param fecha date to set.
	 */
	Alumno(String dni, String nombre, String apellido, String direccion, Date fecha){
		this(dni, nombre, apellido, direccion);
		if(fecha!=null) {
			this.fechaNac = fecha;
		}
	}
	
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @return the fechaNac
	 */
	public Date getFechaNac() {
		return fechaNac;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	/**
	 * Shows the name of the entity.
	 */
	public void mostrarNombre() {
		System.out.println("El nombre es: " + this.nombre);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
