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
	 * A - Realizar un programa que muestre en pantalla los 
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
	 * B - Realizar un prtograma que dado por teclado un limite
	 * numerico, muestre en pantalla todos los numeros hasta ese limite
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
	 * C - Realizar un programa que muestre por pantalla los numeros
	 * del 200 al 250 saltando de 2 en 2.*/
	public static void contar200hasta250() {
		int contador = 200;
		while(contador<=250) {
			System.out.println("El contador vale: " + contador);
			contador = contador+2;
		}
	}
	
	/*
	 * D - Realizar un programa que lleve a cabo la cuenta regresiva 
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
	
	/*
	 * Un gerente de una empresa prestadora de servicios de internet necesita un
	 * algoritmo que permita realizar el cálculo del monto a pagar de la factura
	 * de consumo de internet de 5 clientes de una empresa. Para ello, el algoritmo
	 * debe solicitar por teclado dos datos: Dni del cliente y tipo de servicio.
	 * Los tipos de servicio son 3:
	 * 1. Internet 30 megas (cuyo valor es de $750 – 10% de descuento)
	 * 2. Internet 50 megas (Cuyo valor es de $930 – 5% de descuento)
	 * 3. Internet 100 megas (Cuyo valor fijo es de $1200)
	 * El algoritmo debe poder calcular el monto a pagar (dependiendo del tipo de
	 * servicio con el que cuente el cliente) e informar por pantalla el dni del
	 * mismo junto con el monto a pagar y el número de servicio con el que cuenta.*/
	public static void internet() {
		int contadorClientes = 0;
		String dni;
		int servicio;
		double valorServicio = 0;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		while(contadorClientes<5) {
			
			System.out.println("["+(contadorClientes+1) + "° Cliente] Ingrese Dni sin puntos: ");
			dni = teclado.next();
			System.out.println("Ingrese numero de velocidad de servicio: 30megas | 50megas | 100megas ");
			servicio = teclado.nextInt();
			
			switch(servicio) {
			case 30: /* 30 MEGAS */
				valorServicio = (float)750*90/100;
				break;
			case 50: /* 50 MEGAS */
				valorServicio = (float)930*95/100;
				break;
			case 100: /* 100 MEGAS */
				valorServicio = 1200;
				break;
			default:
				System.out.println("[ERROR] Velocidad icorrecta.");
				break;
			}
						
			contadorClientes++;
			
			System.out.println("El cliente DNI: "+dni);
			System.out.println("Internet "+servicio+" Megas a $"+Math.round(valorServicio));
			System.out.println("____________________________");
		}
		System.out.println("Fin de la carga.");
	}
	
	public static void main(String[] args) {
		//contador();
		//centinela();
		
		//contarHasta35(); // Ejercicio A
		//contarHastaLimite(); // Ejercicio B
		//contar200hasta250(); // Ejercicio C
		//decrementoAnhoNuevo(); // Ejercicio D
		//palabrasHastaSalir(); // Tarea 5
		internet(); // Ejercicio E
	}

}
