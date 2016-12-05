
public class CounterApp {
	public static void main(String arg[]){
		Counter a = new Counter();
		SleepyCounter b = new SleepyCounter();
		Thread bt = new Thread(b);
		
		a.start();
		bt.start();
	}
}
