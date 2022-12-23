package inheritance;

public class Airplane extends Vehicle implements Turnable{

	public Airplane(String name) {
		super(name);
	}

	@Override
	public void TurnOn() {
		System.out.println("pufff");
		
	}

	@Override
	public void TurnOff() {
		System.out.println("asdf");
	}

}
