package com.sinc.intern.thread;

import java.util.Random;

public class SincThread implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 26; i++) {
			System.out.print((char)('A' + i) + " ");
			try {
				Random r = new Random(System.currentTimeMillis());
				long s = r.nextInt(1000);
				System.out.println("sleep time : " + s);
				Thread.sleep(s);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
