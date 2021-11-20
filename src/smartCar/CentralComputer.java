/**
 * 
 */
package smartCar;

/**
 * @author bekis
 *
 */
public class CentralComputer extends Car {
	private double memory;
	private String model;
	private int OSVersion;
	
	public static void summonCar() {
		System.out.println("The car is being summoned to the driver");
	}
	public static void autoPark() {
		System.out.println("The car is parking autonomously");
	}
	public static void turnOnAutoPilot() {
		System.out.println("Autonomous driving turned on");
	}
	public static void turnOffAutoPilot() {
		System.out.println("Autonomous driving turned off");
	}
	public static void checkAutoPilot() {
		System.out.println("Autonomous driving is activated");
	}
	
}
