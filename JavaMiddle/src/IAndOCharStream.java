import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IAndOCharStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("d:/Java/test.txt");
		try (FileReader fr = new FileReader(f)) {
			char[] all = new char[(int)f.length()];
			fr.read(all);
			for (char b : all) {
				System.out.println(b);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try (FileWriter fr = new FileWriter(f)) {
			String data = "hahah";
			char[] cs = data.toCharArray();
			fr.write(cs);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
