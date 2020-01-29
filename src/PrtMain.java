import java.util.ArrayList;
import java.util.List;

import com.sinc.intern.thread.CharThread;
import com.sinc.intern.thread.PrtThread;

public class PrtMain {

	public static void main(String[] args) {
		List<Thread> threadList = new ArrayList<>();
		
		PrtThread pt = new PrtThread();
		CharThread ct_A = new CharThread('A', pt),
				   ct_B = new CharThread('B', pt),
				   ct_C = new CharThread('C', pt);
		
		Thread thread_a = new Thread(ct_A),
			   thread_b = new Thread(ct_B),
			   thread_c = new Thread(ct_C);
		
		threadList.add(thread_a);
		threadList.add(thread_b);
		threadList.add(thread_c);
		
		thread_a.start();
		thread_b.start();
		thread_c.start();
	}
}
