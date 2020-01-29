import com.sinc.intern.thread.SincThread;

public class ThreadMain {
	public static void main(String[] args) {
		System.out.println("main start");
		
		SincThread runnable = new SincThread();
		for(int i = 0; i < 10; i++) {
			Thread thread = new Thread(runnable);
			thread.start();
		}
		
		System.out.println("main end");
	}
}
