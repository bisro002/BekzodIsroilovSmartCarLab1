/**
 * 
 */
package smartCar;

/**
 * @author bekis
 *
 */
public class GPS extends CentralComputer {
	private String location;
	private String make;
	
	public static void navigate() {
		System.out.println("GPS is navigating");
	}
	public static void inputDestination() {
		System.out.println("Destination inputted");
	}
	
}
