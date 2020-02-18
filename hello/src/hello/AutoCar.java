package hello;

public class AutoCar extends ClassAndObject {

	double acc;
	
	public void accelerate(){
		System.out.println("slow accelerate");
	}
	
//	public void accelerate(ClassAndObject co){
//		System.out.println("will accelerate to " + co.speed);
//	}
//	
//	public void accelerate(ClassAndObject co,ClassAndObject co1){
//		System.out.println("from " + co.speed + " accelerate to " + co1.speed);
//	}
	
	
	//改成可变参数
	public void accelerate(ClassAndObject... andObjects){
		for (int i = 0;i < andObjects.length;i++){
			System.out.println("now to " + andObjects.speed);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoCar autoCar = new AutoCar();
		autoCar.acc = 0.88;
		autoCar.name = "bmw";
		autoCar.gear = 8;
		autoCar.speed = 333;
		
		
		ClassAndObject co = new ClassAndObject();
		co.speed = 300;
		ClassAndObject co1 = new ClassAndObject();
		co1.speed = 30;
		autoCar.accelerate();
		autoCar.accelerate(co);
		autoCar.accelerate(co, co1);
	}
	
}
