import java.io.File;
import java.util.Date;
import java.io.IOException;

public class IAndOFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("d:/Java/test.exe");
		System.out.println("now file is: " + f);
		System.out.println("judge exist: " + f.exists());
		
		System.out.println("judge exist is Directory: " + f.isDirectory());
		
		System.out.println("judge exist is file: " + f.isFile());
		
		System.out.println("get file length: " + f.length());
		
		long time = f.lastModified();
		Date d = new Date(time);
		System.out.println("get file last modify time: " + d);
		
		f.setLastModified(0);
		
		File f2 = new File("d:/Java/test/test.exe");
		f.renameTo(f2);
		System.out.println("put test.exe rename to haha.exe");
		
		System.out.println("attention:need d:\\java exist test.exe,\r\n so get file length,time etc..");
	
		
		File f3 = new File("d:/Java");
		
		f3.list();
		
		File[] fs = f3.listFiles();
		
		f3.getParent();
		
		f3.getParentFile();
		
		f3.mkdir();
		
//		f3.createNewFile();
		
		f3.getParentFile().mkdir();
		
		f3.listRoots();
		
		f3.delete();
		
		f3.deleteOnExit();
	
		
	
	
	
	}

}
