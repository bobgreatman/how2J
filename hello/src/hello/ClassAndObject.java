package hello;

public class ClassAndObject {

	String name;
	double speed;
	int gear;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClassAndObject();
		ClassAndObject co = new ClassAndObject();
		
		ClassAndObject co1 = co;
		ClassAndObject co2 = co;
		//co,co1,co2三个引用，都指向同一个对象
		
		
		ClassAndObject occ = new ClassAndObject();
		occ = new ClassAndObject();
		//一个引用，同一时间只能指向一个对象
		
		
		
	}

}
