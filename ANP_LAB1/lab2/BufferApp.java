
public class BufferApp {
	public static void main(String arg[]){
		Buffer buff = new Buffer(50);
		Producer pro = new Producer(buff);
		Consumer con = new Consumer(buff);
		
		Thread proTh = new Thread(pro);
		Thread conTh = new Thread(con);
		
		proTh.start();
		conTh.start();
	}
}
