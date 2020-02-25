import java.io.File;

public class IAndOtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1 = new File("d:/Java");
		System.out.println("f1's absolute path: " + f1.getAbsolutePath());
		File f2 = new File("test.exe");
		System.out.println("f2's absolute path: " + f2.getAbsolutePath());
		File f3 = new File(f1,"test.exe");
		System.out.println("f3's absolute path: " + f3.getAbsolutePath());
		
		
	}

}
