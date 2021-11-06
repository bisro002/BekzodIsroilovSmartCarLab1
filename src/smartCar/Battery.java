/**
 * 
 */
package smartCar;

/**
 * @author bekis
 *
 */
public class Battery extends Car {
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
}
