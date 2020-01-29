package exceptionTest.test.util;

public class SincException extends Exception {
	/*
	 * 변수가 있다거나, 따로 예외처리를 하는 method가 존재하지 않는다.
	 * 
	 * 사용자 정의 Exception은 무조건 Compile Exception으로 간주한다.
	 * */
	
	public SincException() {}
	
	public SincException(String err) {
		super(err);
	}
}
