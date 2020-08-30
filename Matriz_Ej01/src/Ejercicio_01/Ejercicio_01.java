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
 * Type			: Matriz_Ejercicio_1.
 * SO			: [Linux]
 * Version		: Beta 1.0.0 [Beta v1.0.0]
 * ============================================================================
 */

package Ejercicio_01;

/**
 * @author Facu_Falcone
 */
public class Ejercicio_01 {

	// carga la matriz de tamanho 'row x column' y la inicializa con el numero 'numero'
    public static void loadMatrix(int[][] matrix, int row, int column, int numero) {
        for(int rows = 0;rows<row;rows++) {
            for(int columns = 0;columns<column;columns++) {
                matrix[rows][columns] = numero;
            }
        }
    }

    // Imprime la matriz con sus valores
    public static void showMatrix(int[][] matrix, int row, int column) {
        for(int rows = 0;rows<row;rows++) {
            for(int columns = 0;columns<column;columns++) {
                System.out.print("[" + matrix[rows][columns] + "]");
            }
            System.out.println("\n");
        }
    }

    public static void MatrizEjercicio01() {
        int rows = 4;
        int columns = 5;
        int numberToCharge = 5;
        int matrix[][] = new int[rows][columns];
        loadMatrix(matrix, rows, columns, numberToCharge);
        showMatrix(matrix, rows, columns);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        MatrizEjercicio01();
    }   
}
