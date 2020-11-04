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
 * Type			: Matriz_Ejercicio_2.
 * SO			: [Linux]
 * Version		: Beta 1.0.0 [Beta v1.0.0]
 * ============================================================================
 */

package Ejercicio_01;

import java.util.Scanner;

/**
 * @author Facu_Falcone
 *
 */
public class Ejercicio_02 {

	// carga la matriz de tamanho 'row x column'
    @SuppressWarnings("resource")
    public static void loadMatrix(String[][] matrix, int row, int column) {
        int counter = 1;
        Scanner sign = new Scanner(System.in);
        for(int rows = 0;rows<row;rows++) {
            for(int columns = 0;columns<column;columns++) {
                System.out.print("Ingrese el " + counter +"° signo del zodiaco: ");
                matrix[rows][columns] = sign.next();
                counter++;
            }
        }
    }

    // Imprime la matriz con sus valores
    public static void showMatrix(String[][] matrix, int row, int column) {
        String patron = "[%-11s] ";
        for(int rows = 0;rows<row;rows++) {
            for(int columns = 0;columns<column;columns++) {
                String answer = String.format(patron, matrix[rows][columns]);
                System.out.print(answer);
            }
            System.out.println("\n");
        }
    }

    /*
     * Llevar a cabo un programa que permita cargar mediante 
     * teclado una matriz de3 x 3 (3 filas, 3 columnas) con signos zodiacales. 
     * Una vez cargada la misma,será necesario realizar un recorrido por 
     * la misma y mostrar los datoscargados por pantalla.*/
    public static void MatrizEjercicio02() {
        int rows = 3;
        int columns = 3;
        String matrix[][] = new String[rows][columns];
        loadMatrix(matrix, rows, columns);
        showMatrix(matrix, rows, columns);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
            MatrizEjercicio02();
    }  
}
