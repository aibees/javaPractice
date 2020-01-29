package com.sinc.intern.thread;

public class PrtThread {
	
	public synchronized void printChar(char c) {
		for(int i = 0; i < 10; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
}
