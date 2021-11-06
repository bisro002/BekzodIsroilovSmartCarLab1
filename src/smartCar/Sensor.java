/**
 * 
 */
package smartCar;

/**
 * @author bekis
 *
 */
public abstract class Sensor extends CentralComputer {
	private double sensitivity;
	private double range;
	
	public abstract double checkRange();
	
}
