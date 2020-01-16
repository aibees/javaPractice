import com.sinc.intern.tv.factory.BeanFactory;
import com.sinc.intern.tv.util.TV;

public class TVMain {

	public static void main(String[] args) {
		BeanFactory tvFactory = BeanFactory.getInstance();
		
		TV s = tvFactory.getBrand("Samsung");
		s.turnOn();
		TV l = tvFactory.getBrand("Samsung");
		l.turnOn();
		
		System.out.println("s addr : " + s + ", l addr : " + l);
		
		/*
		 * Client 에게 객체 생성을 맡기고 싶지 않으며
		 * 객체의 타입을 보여주기 싫다
		 * 
		 * Interface가 객체 생성을 할 수 없을 뿐, 객체의 타입으로는 정의할 수 있다.
		 * 
		 * IOC : Inversion Of Control
		 * */
		
	}
}
