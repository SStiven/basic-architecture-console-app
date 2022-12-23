
public class List {
	private int[] values;
	private int index = 0;
	//private int size = 0;
	
	public List(int initialSize) {
		 values = new int[initialSize];
	}
	
	public void add(int n) {
		values[index] = n;
		index += 1;
		//size += 1;
	}
	
	public int size() {
		return index;
	}
	
	public int get(int i) {
		if( i > index) {
			throw new IndexOutOfBoundsException();
		}
		return values[i];
	}
}
