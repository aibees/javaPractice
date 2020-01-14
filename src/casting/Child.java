package casting;

public class Child extends Parent {
	public int num = 10;

	public int getNum() { return num; }
	
	public void printnum() {
		System.out.println("c");
		System.out.println(this.getClass().toString() + " " + num);
	}
}
