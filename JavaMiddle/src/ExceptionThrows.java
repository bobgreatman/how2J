import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}
	
	private static void method1() {
		try {
			method2();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void method2() throws FileNotFoundException {
		File f = new File("d:/test.exe");
		System.out.println("try open file");
		new FileInputStream(f);
		System.out.println("successful!");
	}

}
