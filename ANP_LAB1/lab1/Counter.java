
public class Counter extends Thread{
	public void run(){
		for(int i = 10; i < 501; i++)
			System.out.println("Counte "+i);
	}
}
