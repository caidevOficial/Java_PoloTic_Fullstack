package vector;

import java.util.Scanner;

public class vector {

	public static void vectorNumero() {
		int numeros[] = new int [3];
		@SuppressWarnings("resource")
		Scanner ingreso = new Scanner(System.in);
		
		System.out.println("---- Carga de datos ----");
		
		for(int i = 0;i<numeros.length;i++) {
			System.out.println("Ingrese el "+(i+1)+"° numero: ");
			numeros[i] = ingreso.nextInt();
		}
		
		System.out.println("---- Muestra de datos ----");
		
		for(int i = 0;i<numeros.length;i++) {
			System.out.println("el valor del indice " + i + 
					" es: " + numeros[i]);
		}
	}
	
	public static void vectorString() {
		String nombres[] = new String [3];
		@SuppressWarnings("resource")
		Scanner ingreso = new Scanner(System.in);
		int indice = 0;
		
		System.out.println("---- Carga de datos ----");
		
		for(int i = 0;i<nombres.length;i++) {
			System.out.println("Ingrese el "+(i+1)+"° nombre: ");
			nombres[i] = ingreso.next();
		}
		
		System.out.println("---- Busqueda de datos ----");
		System.out.println("ingrese el nombre a buscar: ");
		Scanner busqueda = new Scanner(System.in);
		String NombreBuscar = busqueda.next();
		
		for(int i = 0;i<nombres.length;i++) {
			if(nombres[i].equals(NombreBuscar)) {
				System.out.println("Encontre el nombre, esta en el indice [" + i + 
						"] y el nombre es: " + nombres[i]);
				indice = i;
				break;
				
			}
			System.out.println("Estoy en la posicion: " + indice);
			
		}
	}
	
	public static void main(String[] args) {
		//vectorNumero();
		vectorString();
	}
}

