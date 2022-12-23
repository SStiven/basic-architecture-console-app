package inheritance;

public class ToyCar implements Turnable{
	
	public void MakeNoise() {
		System.out.println("huuyuyuyuy");
	}

	@Override
	public void TurnOn() {
		System.out.println("turn on de toycar");
		
	}

	@Override
	public void TurnOff() {
		// TODO Auto-generated method stub
		
	}
	
}
