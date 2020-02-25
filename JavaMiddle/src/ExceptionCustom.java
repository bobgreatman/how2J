
public class ExceptionCustom {

	public String name;
	protected float acc;
	
	public void accelerate(ExceptionCustom c) throws AccException{
		if (c.acc > 10) {
			 throw new AccException(c.name + "acc did't more than 10");
		}
	}
	
	public String toString() {
		return name;
	}
	
	public class AccException extends Exception{

		public AccException() {
			
		}
		public AccException(String msg) {
			super(msg);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionCustom ce = new ExceptionCustom();
		ce.name = "haha";
		ce.acc = 10.1f;
		
		try {
			ce.accelerate(ce);
		} catch (AccException e) {
			System.out.println("exception is:" + e.getMessage());
			e.printStackTrace();
		}
	}

}
