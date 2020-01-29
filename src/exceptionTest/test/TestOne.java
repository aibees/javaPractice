package exceptionTest.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import exceptionTest.test.util.SincException;

public class TestOne {
	public void compileE() {
		// compile exception
		InputStreamReader sr = null;
		BufferedReader br = null;
		sr = new InputStreamReader(System.in);
		br = new BufferedReader(sr);
		
		try {
			String msg = br.readLine();
			System.out.println(msg);
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println("IOException occured");
		}
	}
	
	@SuppressWarnings("finally")
	public boolean a(int flag) throws SincException {
		/*
		 * 내가 잡은 임의의 Exception을 내가 잡는건 웃긴 일
		 * throws로 다른 객체에 던져라
		 * */
		System.out.println("before A");
		try {
			if(flag == 1) {
				System.out.println("success");
				return true;
			}
			else {
				try {
					throw new SincException("Sinc Exception Execution");
				}
				finally { // 예외 발생에 대한 finally scope
					return false;
				}
			}
		}
		finally { // 정상작동과 예외처리 상관없이 실행되어야 하는 finally scope
			System.out.println("after A");
		}
		
		
	}
	public boolean b(int flag) {
		return false;
	}
	public boolean c(int flag) {
		return false;
	}
	
	
	public	String t1() {
		try {
			InputStream in = new FileInputStream("./img.jpg");
			System.out.println(in.read());
			return Integer.toString(in.read());
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error : FileNotFoundException");
			//System.exit(1);
			return null;
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println("Error : IOException");
			return null;
			//System.exit(1);
		}
		finally {
			System.out.println("final sysout");
		}
	}
}
