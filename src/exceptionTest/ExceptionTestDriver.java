package exceptionTest;

import exceptionTest.test.TestOne;
import exceptionTest.test.util.SincException;

//
//import exceptionTest.test.TestOne;

public class ExceptionTestDriver {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, SincException {
		// TODO Auto-generated method stub
		TestOne demo = new TestOne();
//		demo.compileE();
		boolean aValue = demo.a(1);
		System.out.println(aValue);
		//		String ret = t.t1();
//		System.out.println(ret);
		
		String str[] = {"aibees", "hello", "1129"};
		
		try {
			for(int i = 0; i <= str.length; i++) {
				System.out.println(str[i]);
			}
			System.out.println("inner try");
		}
		finally {
			System.out.println("finally execution");
			System.exit(1);
		}
	}
	
	

}
