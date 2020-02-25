import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IAndOByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("d:/Java/test.txt");
		FileInputStream fis = new FileInputStream(f);
		
		try {
//			File f = new File("d:/Java/test.txt");
			
//			FileInputStream fis = new FileInputStream(f);
		
			byte[] all = new byte[(int)f.length()];
			
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
			}
			
//			fis.close();
			
			
			File f1 = new File("d:/Java/test.txt");
			byte data[] = {88,88,88};
			FileOutputStream fos = new FileOutputStream(f1);
			fos.write(data);
			fos.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (null != fis)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		File fclose = new File("d:/java/test.txt");
		try (FileInputStream fisclose = new FileInputStream(fclose)) {
			byte [] allclose = new byte[(int)fclose.length()];
			fisclose.read(allclose);
			for(byte b : allclose) {
				System.out.println(b);
			}
		} catch (IOException e) {
				e.printStackTrace();
			
		}
		
	}

}
