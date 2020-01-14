package casting;

public class Parent {
	public int num = 20;
	
	public int getNum() { return num; }
	
	public void printNum() {
		System.out.println("pa");
		System.out.println(this.getClass().toString() + " " + num);
	}
}
