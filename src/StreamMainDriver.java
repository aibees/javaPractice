import java.io.File;

import com.sinc.intern.stream.FileObj;

public class StreamMainDriver {

	public static void main(String[] args) {
		String writeMsg = "내일이면 주말이다 우와웅";
		
		FileObj obj = new FileObj();
		File f = new File("sinc.txt");
		
		//obj.saveToFile(f, writeMsg);
		obj.loadToFile(f);
	}

}
