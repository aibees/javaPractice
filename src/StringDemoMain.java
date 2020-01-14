
public class StringDemoMain {
	public final int num = 100;
	
	public static void main(String[] args) {
		String str1 = new String("junseo");
		String str2 = new String("junseo");
		if(str1 == str2) {
			System.out.println("str1 == str2");
		}
		else {
			System.out.println("str1 != str2");
		}
	}
}