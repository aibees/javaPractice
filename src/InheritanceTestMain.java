import java.util.ArrayList;
import java.util.List;

import com.sinc.intern.oop.model.vo.PersonVO;
import com.sinc.intern.oop.sub.model.vo.EmployeeVO;
import com.sinc.intern.oop.sub.model.vo.StudentVO;
import com.sinc.intern.oop.sub.model.vo.TeacherVO;

public class InheritanceTestMain {
	public static void main(String[] args) {
		
		List<PersonVO> li = new ArrayList<PersonVO>();
		
		// Instances casting
		PersonVO p0 = new PersonVO("object", 0, 'N');
		li.add(p0);
		PersonVO p1 = new StudentVO("junseo", 27, 'M', "p90kfu");
		li.add(p1);
		PersonVO p2 = new TeacherVO("jslim", 48, 'M', "Basic of OOP");
		li.add(p2);
		PersonVO p3 = new EmployeeVO("Smile", 32, 'F', "Human Resources");
		li.add(p3);
		
		for(PersonVO p : li) {
			System.out.println(p.perInfo());
		}
		
		// primitive type casting example
		byte x = 10, y = 10;
		long z = 0;
		z = (x + y);
		System.out.println(z);
		
		float fv = (float)12.3526;
		System.out.println(fv);
		
		char c = '1';
		System.out.println();
		System.out.println(c - 48);
	}
}
