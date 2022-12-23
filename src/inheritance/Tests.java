package inheritance;

import java.util.LinkedList;
import java.util.List;

public class Tests {

	public static void main(String[] args) {
		//Vehicle v1 = new Vehicle("Generico");
		
		Vehicle v2 = new Car("Audi", "Automaticio");
		System.out.println(((Car)v2).getTransmissionType());
		
		Vehicle v3 = new Airplane("747");
		
		Turnable v4 = new ToyCar();
		
		ToyCar tc1 = (ToyCar)v4;
		tc1.MakeNoise();
		((ToyCar)v4).MakeNoise();
		//(ToyCar)v4.MakeNoise(); error
		
		LinkedList<Turnable> prendibles = new LinkedList();
		prendibles.add(v4);
		Turnable tn1 = (Turnable)v2;
		prendibles.add(tn1);
		
		System.out.println("--------------------\n\n");
		
		var iter = prendibles.iterator();
		while(iter.hasNext()) {
			iter.next().TurnOn();
		}
		
		for(Turnable t :  prendibles) {
			t.TurnOn();
		}
		
		List l = new LinkedList<Integer>();
		
		//favorecer la composicion sobre la herencia
		

	}

}
