package hello;

public class HelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
	
		Car car = Car.FERRARI;
		switch(car) {
			case FERRARI:
				System.out.println("Ferrari");
				break;
			case PORSCHE:
				System.out.println("Porsche");
				break;
			case LAMBORGHINI:
				System.out.println("Lamborghini");
				break;
		}
		
		for (Car car1:Car.values()) {
			System.out.println(car1);
		}
	}
}
