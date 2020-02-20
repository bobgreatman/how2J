package hello;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton s = new Singleton();   //		singleton mode will wrong.
		
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		Singleton1 s3 = Singleton1.getInstance();
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}

}
