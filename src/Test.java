import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		//Integer a = new Integer(3);
		Integer a = 3;
		var numbers1 = new LinkedList<Integer>();
		var numbers2 = new LinkedList<Integer>();
		numbers1.add(1);
		numbers1.add(2);
		numbers1.add(3);
		
		numbers2.add(10);
		numbers2.add(20);
		
		// n^2
		/*for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}*/
		
		var iter = numbers1.iterator();
		var iter2 = numbers2.iterator();
		
		int n ;
		int m ;
		
		// n^2
		/*for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers1.get(i));
			System.out.println(numbers2.get(i));
		}*/
		
		while(iter.hasNext() && iter2.hasNext()) {
			n = iter.next();
			m = iter2.next();
			System.out.println(n);
		}
		
		System.out.println(numbers1.get(100));
		
	}

}
