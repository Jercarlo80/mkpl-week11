import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {

		Counter counter = new Counter();

		System.out.println("Perhitungan:" + counter.getCount());

		System.out.println("Perhitungan:" + counter.getCount());
		System.out.println("Perhitungan:" + counter.getCount());
		System.out.println("Perhitungan:" + counter.getCount());
		System.out.println("Perhitungan:" + counter.getCount());

		counter.increment();

		System.out.println("masalah:" + counter.getCount());

		counter.decrement();

		System.out.println("Count:" + counter.getCount());

	}

}
