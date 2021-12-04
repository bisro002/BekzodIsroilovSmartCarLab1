/**
 * 
 */
package smartCar;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author bekis
 *
 */
public class Camera extends CentralComputer implements SelfCheckCapable {
	private String position;
	private int resolution;
	
	public static void record() {
		System.out.println("Camera is recording");
	}
	public static void takePicture() {
		System.out.println("Camera has captured an image");
	}
	public static void cameraOn() {
		System.out.println("Camera is turned on");
	}
	public static void detectObstacles() {
		System.out.println("Detecting obstacles");
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
