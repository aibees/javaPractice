package com.sinc.intern.thread;

public class CharThread implements Runnable {
	
	private char 		charValue;
	private PrtThread 	monitor;
	
	public CharThread() {
		
	}
	
	public CharThread(char c, PrtThread monitor) {
		this.charValue = c;
		this.monitor = monitor;
	}
	
	@Override
	public void run() {
		synchronized (monitor) {
			for(int i = 0; i < 10; i++) {
				this.monitor.printChar(charValue);
			}
		}
	}
}
