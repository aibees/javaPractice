package runnable;

import java.util.ArrayList;

public class RunnableTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Start main method");
		
		Runnable r = new ConcreteRunnable();
		ArrayList<Thread> threadList = new ArrayList<Thread>();
		
		for(int i = 0; i < 10; i++) {
			Thread test = new Thread(r);
			
			test.start();
			threadList.add(test);
		}
		
		for(Thread t : threadList) {
			t.join(); // 쓰레드 처리가 끝날때까지 기다림
		}
		
		System.out.println("End main method");
	}

}
