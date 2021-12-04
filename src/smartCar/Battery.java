/**
 * 
 */
package smartCar;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author bekis
 *
 */
public class Battery extends Car implements SelfCheckCapable {
	private double batteryLife;
	private double capacity;
	
	public static void batteryOn() {
		System.out.println("turn the battery on");
	}
	public static void batteryOff() {
		System.out.println("turn the battery off");
	}
	public static void charge() {
		System.out.println("battery is charging");
	}
	
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
