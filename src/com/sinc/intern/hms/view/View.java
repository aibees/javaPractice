package com.sinc.intern.hms.view;

import java.util.Scanner;

public class View {
	public void mainMenu() {
		while(true) {
			System.out.println("** Insa Management System **");
			System.out.println("1. insert");
			System.out.println("2. single select");
			System.out.println("3. multi select");
			System.out.println("4. update select");
			System.out.println("5. delete select");
			System.out.println("9 : exit");
			
			System.out.println("choice number => ");
			Scanner sc = new Scanner(System.in);
			int switches = sc.nextInt();
			
			switch(switches) {
			case 1 :
				insert();
				break;
			case 9 :
				System.exit(1);
			}
			
			System.out.println(switches);
			
		}
	}
	
	public void insert() {
		System.out.println("insert data");
	}
}
