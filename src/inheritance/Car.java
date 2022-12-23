package inheritance;

public class Car extends Vehicle implements Turnable{
	private String transmissionType;
	private Engine engine;
	private Wheel[] wheels; 
	
	public Car(String name, String transmissionType) {
		super(name);
		this.engine = new Engine();
		this.wheels = new Wheel[4];
		this.transmissionType = transmissionType;
	}

	public Car(String name) {
		super(name);
	}
	
	public String getTransmissionType() {
		return transmissionType;
	}

	@Override
	public void TurnOn() {
		System.out.println("turn on de carro");
		
	}

	@Override
	public void TurnOff() {
		System.out.println("bobom");		
	}

}
