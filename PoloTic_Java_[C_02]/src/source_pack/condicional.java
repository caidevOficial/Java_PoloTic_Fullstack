package source_pack;

import java.util.Scanner;

public class condicional {
	
	public static void ejercicio() {
		int num = 8;
		
		String nombreDia;
		switch(num) {
		case 1:
			nombreDia = "Lunes";
			break;
		case 2:
			nombreDia = "Martes";
			break;
		case 3:
			nombreDia = "Miercoles";
			break;
		case 4:
			nombreDia = "Jueves";
			break;
		case 5:
			nombreDia = "Viernes";
			break;
		case 6:
			nombreDia = "Sabado";
			break;
		case 7:
			nombreDia = "Domingo";
			break;
		default:
			nombreDia = "Incorrecto";
			break;
		}
		System.out.println("El dia de la semana seleccionado es "+nombreDia);
	}
	
	/*
	 * A - Un chico de primaria necesita realizar un algoritmo para dar valores a tres 
	 * números. Decidió llamar a las variables num1, num2 y num3 y colocarles los
	 * valores 5, 3 y 7. Sin embargo, no sabe de qué tipos de datos deberían ser
	 * sus tres variables ni tampoco como asignar dichos valores. Realizar un
	 * programa que declare las variables y les asigne los valores que el chico
	 * necesita para cumplir con su tarea.*/
	public static void tresNumeros() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int contador = 0;
		while(contador<3) {
		System.out.println("Ingresa el " + (contador+1) + "° numero: ");
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		switch(contador) {
		case 0:
			num1 = teclado.nextInt();
			break;
		case 1:
			num2 = teclado.nextInt();
			break;
		case 2:
			num3 = teclado.nextInt();
			break;
		}
		
		contador++;
		}
		System.out.println(
		"num1 vale: " + num1 + 
		" | num2 vale: " + num2 + 
		" | num3 vale: " + num3);
	}
	
	/*
	 * B - Una estudiante está dando sus primeros pasos en la programación y quiere
	 * realizar un programa que permita calcular cualquier porcentaje de un número.
	 * Para ello necesita que el usuario ingrese por teclado el número a calcular
	 * el porcentaje (por ejemplo 2500) y también el porcentaje que se desea
	 * calcular (por ejemplo si quiere calcular 10% debería ingresar 0,10). 
	 * A partir de estos valores, necesita que el algoritmo calcule el porcentaje
	 * (multiplicar el primer número por el valor del porcentaje), lo guarde en
	 * una variable y se muestre por pantalla. ¿Podrías ayudarla a realizar elprograma?*/
	public static void porcentaje() {
		float numero;
		float porcentaje;
		float resultado;
		
		System.out.println("Ingresa el numero para calcular porcentaje: ");
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		numero = teclado.nextFloat();
		
		System.out.println("Ingresa el porcenjate a calcular: ");
		@SuppressWarnings("resource")
		Scanner teclado2 = new Scanner(System.in);
		porcentaje = teclado2.nextFloat();
		
		// Calculo porcentaje.
		resultado = (float)(numero*porcentaje) / 100;
		System.out.println("El " + porcentaje + "% de " + numero + " es " + resultado);
	}
	
	/*
	 * C - Un comerciante realiza 5 ventas por día. Necesita de un programa que le
	 * permita ingresar por teclado los montos de las 5 ventas y luego sumar el
	 * total de todas ellas para mostrar por pantalla el resultado. ¿Podrías
	 * ayudarlo a realizar el programa?*/
	public static void totalVentas() {
		float totalVentas = 0;
		int contador = 0;
		
		while(contador<5) {
			System.out.println("Ingresa el monto de la " + (contador+1) + "° Venta: ");
			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
			totalVentas += totalVentas = teclado.nextFloat();
			contador++;
		}
		System.out.println("El total de las 5 ventas es de: $" + totalVentas);
	}
	
	/* D - Realizar un programa que calcule el IVA de un producto. Para esto, el
	 * usuario debe poder ingresar por teclado el valor del producto y el programa
	 * debe informarle por pantalla qué monto equivale al IVA. Recordar que el IVA
	 * es igual al 21% (0,21).*/
	public static void calcularIVA() {
		float porcentajeIVA = (float)21/100;
		float ivaAdicional;
		float precioProducto;
		
		System.out.println("Ingresa el monto del producto: ");
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		precioProducto = teclado.nextFloat();
		ivaAdicional = (float)precioProducto*porcentajeIVA;
		
		System.out.println("El iva a pagar sobre un monto de $" + precioProducto + " es de: $" + ivaAdicional);
	}
	
	/*
	 * E - Realizar un programa que permita a un profesor calcular el promedio de un
	 * alumno. Para esto, el algoritmo debe permitir ingresar las 4 notas del
	 * mismo(por ejemplo, 8, 7, 9.50 y 10), luego calcular el promedio de las
	 * mismas y mostrar el resultado por pantalla. Se recuerda que el promedio es
	 * la suma de todas las notas dividido la cantidad, en el ejemplo sería:(8+7+9.50+10)/4.*/
	public static void calcularPromedio() {
		int contador = 0;
		float sumaNotas = 0;
		float promedio;
		
		while(contador<4) {
			System.out.println("Ingresa la " + (contador+1) + "° nota: ");
			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
			sumaNotas += sumaNotas = teclado.nextFloat();
			contador++;
		}
		promedio = (float)sumaNotas/contador;
		System.out.println("El promedio del alumno es : " + promedio);
	}
	
	/*
	 * F -  Realizar un programa que permita calcular el área de un triángulo. Se
	 * recuerda que la fórmula para calcular el área de un triángulo es: (base *altura) / 2. 
	 * Se debe permitir al usuario ingresar la base y la altura, mientras que el programa 
	 * debe calcular el área y mostrar el resultado por pantalla.*/
	public static void areaTriangulo() {
		float base = 0;
		float altura = 0;
		float area;
		
		System.out.println("Ingresa la medida de la Base: ");
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		base = teclado.nextFloat();
		
		System.out.println("Ingresa la medida de la Altura: ");
		@SuppressWarnings("resource")
		Scanner teclado2 = new Scanner(System.in);
		altura = teclado2.nextFloat();
		
		// Calculo Area.
		area = (float)(base*altura)/2;
		System.out.println("El area del triangulo es: " + area);
	}
	
	/*
	 * G - Realizar un programa que permita intercambiar el valor de dos variables.
	 * Por ejemplo, si la variable1 vale 5 y la variable2 vale 12, hacer que la
	 * variable1 valga 12 y la variable2 valga 5. Tener en cuenta que al asignar
	 * un valor a una variable se sobrescribe el valor anterior.*/
	public static void intercambiarValores() {
		int var1;
		int var2;
		int aux;
		
		System.out.println("Ingresa un valor para la variable 1: ");
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		var1 = teclado.nextInt();
		
		System.out.println("Ingresa un valor para la variable 2: ");
		@SuppressWarnings("resource")
		Scanner teclado2 = new Scanner(System.in);
		var2 = teclado2.nextInt();
		aux = var2;
		var2 = var1;
		var1 = aux;
		System.out.println("Ahora la variable 1 vale: " + var1 + " y la variable 2 vale: " + var2);
	}
	
	public static void main(String[] args) {
		//tresNumeros(); 		// Ejercicio A
		//porcentaje(); 		// Ejercicio B
		//totalVentas(); 		// Ejercicio C
		//calcularIVA(); 		// Ejercicio D
		//calcularPromedio();	// Ejercicio E
		//areaTriangulo();		// Ejercicio F
		//intercambiarValores();	// Ejercicio G
	}
}
