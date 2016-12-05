
public class SleepyCounter implements Runnable{
	public void run(){
		for(int i = 10; i < 501; i++){
			System.out.println("Countbbb "+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
