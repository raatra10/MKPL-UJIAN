import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count 1:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Count 2:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Count 3:" + counter.getCount());
		
	}

}
