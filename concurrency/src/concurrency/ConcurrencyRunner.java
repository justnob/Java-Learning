package concurrency;

public class ConcurrencyRunner {

	public static void main(String[] args) {
		/*Counter counter = new Counter();
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		System.out.println(counter.getI());*/
		BiCounter biCounter = new BiCounter();
		biCounter.incrementJ();
		biCounter.incrementJ();
		biCounter.incrementJ();
		biCounter.incrementJ();
		biCounter.incrementI();
		biCounter.incrementI();
		biCounter.incrementI();
		biCounter.incrementI();
		System.out.println(biCounter.getI());
		System.out.println(biCounter.getJ());

	}

}
