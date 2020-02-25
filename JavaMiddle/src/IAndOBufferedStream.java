import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IAndOBufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("d:/Java/test.txt");
		try(
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
		)
		{
			while (true) {
				String line = br.readLine();
				if (null == line)
					break;
				System.out.println(line);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileWriter fr = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fr);
			)
		{
			pw.println("i am genius");
			pw.flush();
			pw.println("i am so clever");
			pw.flush();
			pw.println("do you know?");
			pw.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
