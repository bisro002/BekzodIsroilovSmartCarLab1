/**
 * 
 */
package smartCar;

/**
 * @author bekis
 *
 */
public class Camera extends CentralComputer {
	private String position;
	private int resolution;
	
	public static void record() {
		System.out.println("Camera is recording");
	}
	public static void takePicture() {
		System.out.println("Camera has captured an image");
	}
	
}
