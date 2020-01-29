import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import com.sinc.intern.oop.model.vo.PersonVO;
import com.sinc.intern.oop.sub.model.vo.EmployeeVO;
import com.sinc.intern.oop.sub.model.vo.StudentVO;
import com.sinc.intern.oop.sub.model.vo.TeacherVO;

public class CollectionMain {

	public static void printList(List<PersonVO> personList) {
		Iterator<PersonVO> iter = personList.iterator();
		while(iter.hasNext()) {
			PersonVO p = iter.next();
			System.out.println(p.perInfo());
		}
	}
	
	public static void main(String[] args) {
		List<PersonVO> li = new Vector<PersonVO>();
		
		li.add(new StudentVO("aibees", 27, 'M', "p90kfu"));
		li.add(new EmployeeVO("smile", 30, 'F', "Humans"));
		li.add(new TeacherVO("jslim", 48, 'M', "java_basic"));
		
		printList(li);
		
		
		Map<String, List<PersonVO> > m = new HashMap<String, List<PersonVO> >();
		m.put("intern", li);
		
		Map<String, String> ssm = new HashMap<String, String>();
		ssm.put("id", "p90kfu");
		ssm.put("pwd", "mypassword");
		ssm.put("name", "aibees");
		Set<String> keys = ssm.keySet();
		Iterator<String> ssmIter = keys.iterator();
		while(ssmIter.hasNext()) {
			System.out.println(ssm.get(ssmIter.next()));
		}
		
		
		/*
		 * Generic Type을 사용함으로써 얻을 수 있는 장점
		 * 1. Object가 아닌 특정 타입으로 명시함으로써 각 element에 접근할 때 casting 관련 작업을 할 필요 없다.
		 * 2. 필요 타입을 지정함으로써 Compile 시점에서 코드의 안정성을 얻을 수 있다.
		 * */
	}

}
