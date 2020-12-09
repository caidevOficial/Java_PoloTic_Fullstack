/*
 * ============================================================================
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 * ============================================================================
 * Author		: FacuFalcone.
 * Type			: Vector_Ejercicio_E.
 * SO			: [Linux]
 * Version		: Beta 1.0.0 [Beta v1.0.0]
 * ============================================================================
 */

package Ejercicio_E;
import java.util.Scanner;

/**
 * @author Facu_Falcone
 */
public class Ejercicio_E {

	public static int indexLimiteMinMax(double array[],char sign) {
		double minimo = (500);
		double maximo = (-500);
        int index = 0;

        switch(sign) {
        case '>': // Numero Maximo
            for(int i = 0;i<array.length;i++) {
                if(i==0 || maximo<array[i]) {
                    maximo = array[i];
                    index = i;
                }
            }
            break;
        case '<': // Numero Menor
            for(int i = 0;i<array.length;i++) {
                if(i==0 || minimo>array[i]) {
                    minimo = array[i];
                    index = i;
                }
            }
            break;
        }
        return index;
    }

    /*
     * En tres vectores diferentes se guardan los datos de
     * temperaturas maximas y minimas de 5 ciudades de Misiones.
     * En el primer vector se guardan los nombres de las ciudades.
     * En el segundo vector se guardan las temperaturas minimas.
     * En el tercer vector se guardan las temperaturas maximas.
     * Se necesita un programa que permita la carga de las cuidades
     * y sus temperaturas, ademas, debera poder informar por pantalla
     * cual fue la ciudad con la temperatura mas baja y cual con la 
     * temperatura mas alta (y sus grados.)
     * */
    @SuppressWarnings({ "resource", "unused" })
    public static void VectorEjercicioE() {
        int minimo; // Almacena indice de temperatura minima
        int maximo; // Almacena indice de temperatura maxima
        int sizeArray = 5;

        double tempMaxima[] = new double[sizeArray];
        double tempMinima[] = new double[sizeArray];
        String ciudades[] = new String[sizeArray];
        String patron = "Ciudad: [%-10s] Min: [%-5.2f째] - Max: [%-5.2f째]\n";
        String nombreCiudad;

        Scanner keyboard = new Scanner(System.in);

        for(int i = 0;i<sizeArray;i++) {

            System.out.println("Ingrese nombre de la " + (i+1) +"째 ciudad: ");
            ciudades[i] = keyboard.next();

            System.out.println("Ingrese temp Minima de " + ciudades[i] + ": ");
            tempMinima[i] = keyboard.nextFloat();

            System.out.println("Ingrese temp Maxima de " + ciudades[i] + ": ");
            tempMaxima[i] = keyboard.nextFloat();
            System.out.println("_____________________________________________\n");
        }

        // Copio los indices del maximo y minimo
        minimo = indexLimiteMinMax(tempMinima,'<');
        maximo = indexLimiteMinMax(tempMaxima,'>');

        System.out.println("Ciudad con temperatura maxima.");
        String respuesta2 = String.format(patron, ciudades[maximo],tempMinima[maximo],tempMaxima[maximo]);
        System.out.print(respuesta2);

        System.out.println("Ciudad con temperatura minima.");
        String respuesta1 = String.format(patron, ciudades[minimo],tempMinima[minimo],tempMaxima[minimo]);
        System.out.print(respuesta1);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
    	VectorEjercicioE();
    }
}
