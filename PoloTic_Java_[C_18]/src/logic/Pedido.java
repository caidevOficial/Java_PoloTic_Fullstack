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
 * @author CaidevOficial
 *
 */
public class Pedido {

	// Attributes.
	protected int numeroPedido;
	protected Date fechaPedido;
	
	/**
	 * Builds the entity with default values.
	 */
	public Pedido() {
		this.numeroPedido = 0;
		this.fechaPedido = null;
	}
	
	/**
	 * Builds the entity with 1 param.
	 * @param numeroPedido
	 */
	public Pedido(int numeroPedido) {
		this();
		if(numeroPedido>0) {
			this.numeroPedido = numeroPedido;
		}
	}
	
	/**
	 * Builds the entity with 2 params.
	 * @param numeroPedido
	 * @param fechaPedido
	 */
	public Pedido(int numeroPedido, Date fechaPedido) {
		this(numeroPedido);
		if(fechaPedido!=null) {
			this.fechaPedido = fechaPedido;
		}
	}

	/**
	 * @return the numeroPedido
	 */
	public int getNumeroPedido() {
		return numeroPedido;
	}

	/**
	 * @return the fechaPedido
	 */
	public Date getFechaPedido() {
		return fechaPedido;
	}

	/**
	 * @param numeroPedido the numeroPedido to set
	 */
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	/**
	 * @param fechaPedido the fechaPedido to set
	 */
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
}
