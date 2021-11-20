package smartCar;

public class Car implements selfCheckCapable{
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
	public static void parkCar() {
		System.out.println("Car parked");
	}
	
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		String componentName = null;
		return componentName;
	}

	
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public static void checkDiagnostics() {
		System.out.println("Diagnostics are optimal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		mycar.checkDiagnostics();
		mycar.runSelfCheck();
		
		
		
	}

	

}
