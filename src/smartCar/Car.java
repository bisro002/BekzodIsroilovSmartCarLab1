package smartCar;

public class Car {
	private String driver;
	private int yearMake;
	private Tire tire;
	private Motor motor;
	private Battery battery;
	private CentralComputer cc;
	private Camera camera;
	private GPS gps;
	private Sensor sensor;
	private Brake brake;
	private AccelerationPedal ap;
	
	public Car() {
		this.driver = driver;
		this.yearMake = yearMake;
		this.tire = tire;
		this.motor = motor;
		this.battery = battery;
		this.cc = cc;
		this.camera = camera;
		this.gps = gps;
		this.sensor = sensor;
		this.brake = brake;
		this.ap = ap;
	}
	
	public static void operate() {
		System.out.println("operate");
	}
	public static void moveReverse() {
		System.out.println("move reverse");
	}
	public static void moveForward() {
		System.out.println("move forward");
	}
	public static void turnRight() {
		System.out.println("turn right");
	}
	public static void turnLeft() {
		System.out.println("turn left");
	}
	public static void stop() {
		System.out.println("stop");
	}
	public static void checkDiagnostics() {
		System.out.println("Diagnostics are optimal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		mycar.checkDiagnostics();
		
		
		
	}

}
