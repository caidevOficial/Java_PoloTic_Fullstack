/**
 * 
 */
package logic.abstractClass;

import logic.subClass.Driver;

/**
 * @author FacuFalcone - CaidevOficial
 *
 */
public abstract class Uber {

    int id, passengers;
    String license;
    Driver thisDriver;
    /**
     * 
     */
    public Uber() {
    }
    /**
     * @param id
     * @param passengers
     * @param license
     * @param thisDriver
     */
    public Uber(int id, int passengers, String license, Driver thisDriver) {
	   this.id = id;
	   this.passengers = passengers;
	   this.license = license;
	   this.thisDriver = thisDriver;
    }
    
    
}
