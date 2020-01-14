package runnable;

import java.util.Random;

public class ConcreteRunnable implements Runnable {

	private int index = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random r = new Random(System.currentTimeMillis());
		
		@SuppressWarnings("unused")
		long s = r.nextInt(3000);
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		addIndex();
	}
	
	synchronized void addIndex() {
		index++;
		System.out.println("current index value : " + index);
	}
}
