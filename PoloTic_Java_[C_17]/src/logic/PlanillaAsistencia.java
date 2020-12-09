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

import java.util.Date;

/**
 * @author facu
 *
 */
public class PlanillaAsistencia {

	// Attributes.
	int idAsistencia;
	int cantPresentes;
	int cantAusentes;
	int numClases;
	Date fecha;
	
	/**
	 * Builds the entity with default values.
	 */
	public PlanillaAsistencia() {
		this.idAsistencia = 0;
		this.cantPresentes = 0;
		this.cantAusentes = 0;
		this.numClases = 0;
		this.fecha = null;
	}
	
	/**
	 * Builds the entity with 1 param.
	 * @param idAsistencia the id of the attendance.
	 */
	public PlanillaAsistencia(int idAsistencia){
		this();
		if (idAsistencia>0) {
			this.idAsistencia = idAsistencia;
		}
	}
	
	/**
	 * Builds the entity with 2 params.
	 * @param idAsistencia the id of the attendance.
	 * @param presentes quantity of present people.
	 */
	public PlanillaAsistencia(int idAsistencia, int presentes) {
		this(idAsistencia);
		if(presentes>=0) {
			this.cantPresentes = presentes;
		}
	}
	
	/**
	 * Builds the entity with 3 params.
	 * @param idAsistencia the id of the attendance.
	 * @param presentes quantity of present people.
	 * @param ausentes quantity of absent people.
	 */
	public PlanillaAsistencia(int idAsistencia, int presentes, int ausentes) {
		this(idAsistencia, presentes);
		if(ausentes>=0) {
			this.cantAusentes = ausentes;
		}
	}
	
	/**
	 * Builds the entity with 4 params.
	 * @param idAsistencia the id of the attendance.
	 * @param presentes quantity of present people.
	 * @param ausentes quantity of absent people.
	 * @param numClase number of the class.
	 */
	public PlanillaAsistencia(int idAsistencia, int presentes, int ausentes, int numClase) {
		this(idAsistencia, presentes, ausentes);
		if(numClase>=0) {
			this.numClases = numClase;
		}
	}
	
	/**
	 * Builds the entity with 5 params.
	 * @param idAsistencia the id of the attendance.
	 * @param presentes quantity of present people.
	 * @param ausentes quantity of absent people.
	 * @param numClase number of the class.
	 * @param fecha date of the class.
	 */
	public PlanillaAsistencia(int idAsistencia, int presentes, int ausentes, int numClase, Date fecha) {
		this(idAsistencia, presentes, ausentes, numClase);
		if(fecha!=null) {
			this.fecha = fecha;
		}
	}

	/**
	 * @return the idAsistencia
	 */
	public int getIdAsistencia() {
		return idAsistencia;
	}

	/**
	 * @return the cantPresentes
	 */
	public int getCantPresentes() {
		return cantPresentes;
	}

	/**
	 * @return the cantAusentes
	 */
	public int getCantAusentes() {
		return cantAusentes;
	}

	/**
	 * @return the numClases
	 */
	public int getNumClases() {
		return numClases;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param idAsistencia the idAsistencia to set
	 */
	public void setIdAsistencia(int idAsistencia) {
		this.idAsistencia = idAsistencia;
	}

	/**
	 * @param cantPresentes the cantPresentes to set
	 */
	public void setCantPresentes(int cantPresentes) {
		this.cantPresentes = cantPresentes;
	}

	/**
	 * @param cantAusentes the cantAusentes to set
	 */
	public void setCantAusentes(int cantAusentes) {
		this.cantAusentes = cantAusentes;
	}

	/**
	 * @param numClases the numClases to set
	 */
	public void setNumClases(int numClases) {
		this.numClases = numClases;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
		
}
