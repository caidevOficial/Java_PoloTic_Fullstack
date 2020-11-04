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
public class Cliente {
	
	// Attributes.
	protected String dni;
	protected String nombre;
	protected String apellido;
	protected String telefono;
	
	/**
	 * Builds the entity with default values.
	 */
	public Cliente() {
		this.nombre = "";
		this.apellido = "";
		this.dni = "";
		this.telefono = "";
	}
	
	/**
	 * Builds the entity with 1 param.
	 * @param dni
	 */
	public Cliente(String dni) {
		this();
		if(dni!=null) {
			this.dni = dni;
		}
	}
	
	/**
	 * Builds the entity with 2 params.
	 * @param dni
	 * @param nombre
	 */
	public Cliente(String dni, String nombre) {
		this(dni);
		if(nombre!=null) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Builds the entity with 3 params.
	 * @param dni
	 * @param nombre
	 * @param apellido
	 */
	public Cliente(String dni, String nombre, String apellido) {
		this(dni, nombre);
		if(apellido!=null) {
			this.apellido = apellido;
		}
	}
	
	/**
	 * Builds the entity with 4 params.
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param telefono
	 */
	public Cliente(String dni, String nombre, String apellido, String telefono) {
		this(dni, nombre, apellido);
		if(telefono!=null) {
			this.telefono = telefono;			
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
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
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
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void guardarCliente() {
		
	}
	
	/**
	 * Take the name of the entity and returns it.
	 * @return The name of the entity.
	 */
	public String mostrarNombreCliente() {
		String nombre = "";
		nombre = getNombre();
		return nombre;
	}
}
