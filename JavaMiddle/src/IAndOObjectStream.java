import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IAndOObjectStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.name = "ferrari";
		car.speed = 333;
		
		File f = new File("d:/Java/car.txt");
		try (
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			)
		{
			oos.writeObject(car);
			Car car1 = (Car) ois.readObject();
			System.out.println(car1.name);
			System.out.println(car1.speed);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
