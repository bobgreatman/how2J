package hello;

public class Singleton1 {
	private Singleton1(){
		
	}
	
	private static Singleton1 instance;
	
	public static Singleton1 getInstance(){
		if(null == instance) {
			instance = new Singleton1();
		}
		return instance;
	}
}
