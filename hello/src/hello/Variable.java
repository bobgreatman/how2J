package hello;

public class Variable {

	public static void main(String[] args) {
		byte b = 1;
		short s = 200;
		int i = 300;
		long l = 400;
		
//		byte b2 = 200;
		
		char c = '中';
//		char c2 = '中国';
//		char c3 = 'ab';
		
		double d = 123.45;
//		默认小数是double类型
//		float f = 54.321;
		float f2 = 54.321f;
		
		boolean b1 = true;
		boolean b2 = false;
//		boolean b3 = 1;
		
		String str = "hello world！";
		
		long val = 26L;
		int decVal = 26;
		int hexVal = 0x1a;
		int oxVal = 032;
		int binVal = 0b11010;
		System.out.println(hexVal);
		
		float f1= 123.4F;
		double d1 = 123.4;
		double d2 = 1.2334e2;
		
		String name = "bob";
		char a = 'c';
		
		char tab = '\t';
		char carriageReturn = '\r';
		char newLine = '\n';
		char doubleQuote = '\"';
		char singleQuote = '\'';
		char backslash = '\\';
		
		char c1 = 'A';
		short s1 = 80;
		c1 = (char) s1;
//		s1 = c1;
		
		long l1 = 50;
		int i1 = 50;
		l1 = i1;
		
		byte b3 = 5;
		int i2 = 10;
		int i3 = 300;
		b3 = (byte) i2;
		System.out.println(b3);
		
		b3 = (byte) i3;
		System.out.println(b3);
		
		System.out.println(Integer.toBinaryString(i3));
		
		final int i5 = 5;
//		i5 = 10;
	}
}
