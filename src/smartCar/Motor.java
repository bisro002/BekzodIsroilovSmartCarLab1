/**
 * 
 */
package smartCar;

/**
 * @author bekis
 *
 */
public class Motor extends Car {
	private int voltage;
	private int horsepower;
	
	public static void accelerate() {
		System.out.println("applying power to accelerate");
	}
}
