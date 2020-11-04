package source;

import java.util.Scanner;

public class Estructuras_selectivas {
	
	
	/*
	 * Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos
	 * de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
	 * a) Los repositores cobran $15.890 + un bono de 10%.
	 * b) Los cajeros cobran $25.630,89 fijos.
	 * c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11%
	 * de jubilación.Se necesita un programa que, dependiendo el tipo de empleado del que se 
	 * trate,calcule y muestre en pantalla el correspondiente sueldo.*/
	public static void despensa() {
		int tipoEmpleado = 0;
		int contador = 0;
		int respuesta = 1;
		
		double sueldo = 0;
		double descuento;
		
		while(respuesta==1) {
			System.out.println("Ingresa el tipo del " + (contador+1) + "° empleado: ");
			System.out.println("[1] Repositor.\n" + "[2] Cajero.\n" + "[3] Supervisor.\n");
			@SuppressWarnings("resource")
			Scanner tipo = new Scanner(System.in);
			tipoEmpleado = tipo.nextInt();
			
			switch(tipoEmpleado) {
				case 1: // Repositor
					descuento = 1.1;
					sueldo = 15890 * descuento;
					break;
				case 2: // Cajero
					descuento = 1;
					sueldo = 25630.89 * descuento;
					break;
				case 3: // Supervisor
					descuento = 0.89;
					sueldo = 35560.20 * descuento;
					break;
				default:
					System.out.println("[ERROR] No es una opcion valida.\n");
					break;
			}
			
			System.out.println("Empleado n°: " + (contador+1));
			System.out.println("Tipo: " + tipoEmpleado);
			System.out.println("Sueldo: " + sueldo);
			
			contador++;
			System.out.println("\nDesea agregar otro empleado? \n[0] NO.\n" + "[1] SI.\n");
			@SuppressWarnings("resource")
			Scanner answer = new Scanner(System.in);
			respuesta = answer.nextInt();
			
			
		}
	}
	
	public static void main(String[] args) {
		despensa();
	}
}
