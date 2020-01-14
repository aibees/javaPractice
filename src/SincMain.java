import com.sinc.intern.model.vo.SincVO;

public class SincMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SincVO obj1 = new SincVO();
		obj1.setId("aibees1129");
		obj1.setPwd("admin");
		obj1.setName("aibees");
		
		SincVO obj2 = new SincVO("aibees1129", "myaibeespwd", "junseo.park");
		
		obj1.printAll();
		obj2.printAll();
		
		obj2 = null;
		obj1 = null;
		
	}
}
