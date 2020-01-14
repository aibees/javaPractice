import com.sinc.intern.oop.model.vo.PersonVO;
import com.sinc.intern.oop.sub.model.vo.EmployeeVO;
import com.sinc.intern.oop.sub.model.vo.StudentVO;
import com.sinc.intern.oop.sub.model.vo.TeacherVO;

public class ObjectArrayDriver {

	private static int idx = 0;
	
	public static void main(String[] args) {
		PersonVO[] perAry = new PersonVO[10];
		
		PersonVO s = new StudentVO("qkr", 22, 'M', "p90f");
		setArr(s, perAry);
		PersonVO t = new TeacherVO("lim", 48, 'M', "java");
		setArr(t, perAry);
		PersonVO e = new EmployeeVO("smile", 32, 'F', "Resources");
		setArr(e, perAry);
		
		printArray(perAry);
	}
	
	public static void printArray(PersonVO[] arr) {
		int x = 1;
		for(int idx = 0; idx < 3; idx++) {
			System.out.println("idx : " + x);
			PersonVO obj = arr[idx];
			System.out.println(obj.perInfo());
			x++;
		}
	}
	
	public static void setArr(PersonVO p, PersonVO[] arr) {
		arr[idx++] = p;
	}
}
