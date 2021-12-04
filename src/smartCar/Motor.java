/**
 * 
 */
package smartCar;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author bekis
 *
 */
public class Motor extends Car implements SelfCheckCapable {
	private int voltage;
	private int horsepower;
	
	public static void accelerate() {
		System.out.println("applying power to accelerate");
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
