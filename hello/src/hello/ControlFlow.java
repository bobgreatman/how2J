package hello;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean breakout = false;
		for(int i = 0;i < 10;i++) {
			for(int j = 0;j < 10;j++) {
				System.out.println(i + " : " + j);
				if(0 == j % 2){
					breakout = true;
					break;
				}
			}
			if (breakout)
				break;
		}
		
		
		outloop:
		for(int i = 0;i < 10;i++){
			for(int j = 0;j < 10;j++){
				System.out.println(i + " : " + j);
				if(0 == j % 2) 
					break outloop;
			}
		}
	}

}
