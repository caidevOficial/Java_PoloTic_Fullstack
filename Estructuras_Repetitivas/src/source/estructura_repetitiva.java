package source;

import java.util.Scanner;

public class estructura_repetitiva {
	
	// Loop mediante Centinel
	public static void centinela() {
		boolean bandera = true;
		while(bandera) {
			System.out.println("El valor de la variable es " + bandera);
			System.out.println("Ingrese un numero por teclado: ");
			
			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
			int tecla = teclado.nextInt();
			if(tecla==1) {
				bandera=false;
				System.out.println("Gracias, vuelvas prontos");
				
			}
		}
		System.out.println("Salimos del while xq la bandera es " + bandera);
	}
	
	// Loop mediante counter
	public static void contador() {
		int contador = 0;
		while(contador < 10) {
			System.out.println("Estoy en la vuelta n° " + contador);
			contador++;
		}
	}
	
	/* TAREA */
	
	/*
	 * 1 - Realizar un programa que muestre en pantalla los 
	 * numeros del 1 al 35 (uno abajo del otro)
	 * */
	public static void contarHasta35() {
		int contador = 1;
		while(contador<36) {
			System.out.println("El contador vale: " + contador);
			contador++;
		}
	}
	
	/*
	 * 2 - Realizar un prtograma que dado por teclado un limite
	 * numerico, muestr en pantalla todos los numeros hasta ese limite
	 * empezando por el 1.*/
	public static void contarHastaLimite() {
		int contador = 1;
		System.out.println("Ingrese un numero por teclado: ");
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int limite = teclado.nextInt();
		while(contador<=limite) {
			System.out.println("Contador: " + contador);
			contador++;
		}
	}
	
	/*
	 * 3 - Realizar un ptograma que muestre por pantalla los numeros
	 * del 200 al 250 saltando de 2 en 2.*/
	public static void contar200hasta250() {
		int contador = 200;
		while(contador<=250) {
			System.out.println("El contador vale: " + contador);
			contador = contador+2;
		}
	}
	
	/*
	 * 4 - Realizar un programa que lleve a cabo la cuenta regresiva 
	 * para el año nuevo. Empieza en 10 y termina en 1*/
	public static void decrementoAnhoNuevo() {
		int regresivo = 10;
		while(regresivo>(-1)) {
			System.out.println("Cuenta: " + regresivo);
			regresivo--;
		}
	}
	
	/*
	 * 5 - Realizar un programa que muestre en pantalla palabras ingresadas
	 * por teclado hasta que se ingrese la palabra salir*/
	public static void palabrasHastaSalir() {
		String palabras = "nada";
		while(!palabras.equals("salir")) {
			System.out.println("Ingrese una palabra por teclado: ");
			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
			palabras = teclado.next();
			System.out.println("Palabra: " + palabras);
		}
		System.out.println("Fin del bucle.");
	}
	
	public static void main(String[] args) {
		//contador();
		//centinela();
		
		//contarHasta35(); // Tarea 1
		//contarHastaLimite(); // Tarea 2
		//contar200hasta250(); // Tarea 3
		//decrementoAnhoNuevo(); // Tarea 4
		//palabrasHastaSalir(); // Tarea 5
	}

}
