/**
 * 
 */
package smartCar;

/**
 * @author bekis
 *
 */
public class LIDAR extends Sensor {
	private double sensitivity;
	private double range;
	private double frequency;
	
	public static void scan() {
		System.out.println("LIDAR is scanning the area");
	}
	public static void detectLight() {
		System.out.println("LIDAR is detecting light");
	}
	
	@Override
	public double checkRange() {
		// TODO Auto-generated method stub
		return 0;
	}

}
