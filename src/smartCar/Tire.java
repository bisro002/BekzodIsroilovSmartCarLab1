/**
 * 
 */
package smartCar;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author bekis
 *
 */
public class Tire extends Car implements SelfCheckCapable {
	private double tirePressure = 34;
	private String make = "Continental";
	
	public double checkAir;
	
	
	public boolean selfCheck() {
		return true;
	}
	public String getComponentName() {
		String name = null;
		return name;
	}
	public boolean runSelfCheck() {
		return true;
	}
}
