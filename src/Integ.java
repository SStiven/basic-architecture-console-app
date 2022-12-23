
public class Integ {
	private int value;
	
	public Integ(int value) {
		this.value = value;
	}
	
	public int getInteger() {
		return value;
	}
	
	public int pow(int exponent) {
		int result = 1;
		for(int i = 0; i < exponent; i++) {
			result += value * value;
		}
		return result;
	}

}
