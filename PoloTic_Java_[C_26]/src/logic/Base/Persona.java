/**
 * 
 */
package logic.Base;

/**
 * @author FacuFalcone - CaidevOficial
 *
 */
public class Persona {

    String nombre;
    int edad;
    int id;

    /**
     * 
     */
    public Persona() {
    }

    /**
     * @param nombre
     */
    public Persona(String nombre) {
	   this.nombre = nombre;
    }

    /**
     * @param nombre
     * @param edad
     */
    public Persona(String nombre, int edad) {
	   this.nombre = nombre;
	   this.edad = edad;
    }

    /**
     * @param nombre
     * @param edad
     * @param id
     */
    public Persona(String nombre, int edad, int id) {
	   this.nombre = nombre;
	   this.edad = edad;
	   this.id = id;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
	   return edad;
    }

    /**
     * @return the id
     */
    public int getId() {
	   return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
	   return nombre;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
	   this.edad = edad;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
	   this.id = id;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
	   this.nombre = nombre;
    }
}
