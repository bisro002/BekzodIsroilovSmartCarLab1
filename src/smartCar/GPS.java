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
	public static void search() {
		System.out.println("GPS is searching for the location");
	}
	
}
