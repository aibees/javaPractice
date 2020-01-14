package casting;

public class ExtendTestMain {

	public static void main(String[] args) {
		Parent p = new Child();
		
		p.printNum();
		/*
		 * child에서 overriding을 하지 않아 parent 자체의 method와 변수로 가져온다. 다만, printNum에서
		 * this.getClass로 클래스 이름을 가져오는 문구 때문에 Child instance의 getClass를 가져간다.
		 * type이 parent이기 때문에 this 자체는 child로 가져가지만 num은 일반 변수이기 때문에 parent가 child로 접근할 수 없다. 
		 */
		System.out.println("p.num : " + p.getNum()); // child에서 overriding된 method

	}

}
