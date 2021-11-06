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
	public static void autoPilot() {
		System.out.println("Autonomous driving is activated");
	}
	
}
