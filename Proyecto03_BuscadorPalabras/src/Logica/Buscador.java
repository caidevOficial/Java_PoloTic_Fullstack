/**
 * 
 */
package Logica;

import GUI.Front;

/**
 * @author caidev
 *
 */
public class Buscador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 //se instancia el objeto.
        Front ventana = new Front();
        ventana.setVisible(true); // la hago visible
        //para que aparezca en el medio, se pone relative null
        // ya que no toma nada como referencia para tener uan locacion.
        ventana.setLocationRelativeTo(null);

	}

}
