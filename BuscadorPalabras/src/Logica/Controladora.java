/**
 * 
 */
package Logica;

/**
 * @author caidev
 *
 */
public class Controladora {
	String[] nombres = new String[5];
	
	public void CargarArray(String nombre) {
		for(int i = 0;i<nombres.length;i++) {
			if(nombres[i]==null) {
				nombres[i] = nombre;
				break;
			}
		}
	}
	
	public Boolean BuscaryMostrarNombre(String nombre) {
		for(int i = 0;i<nombres.length;i++) {
			if(nombres[i].equals(nombre)) {
				return true;
			}
		}
		return false;
	}
}
