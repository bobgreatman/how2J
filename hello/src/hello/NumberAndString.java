package hello;

public class NumberAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;
		Integer it = new Integer(i);
		int i2 = it.intValue();
		System.out.println(it);
		System.out.println(it instanceof Number);
		
		Integer it1 = i;
		int i3 = it;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		String str = String.valueOf(i);
		String str1 = it.toString();
		
		String str2 = "666";
		int i4 = Integer.parseInt(str2);
		System.out.println(i4);
		
		
		float f1 = 5.4f;
		float f2 = 5.5f;
		System.out.println(Math.round(f1));
		System.out.println(Math.round(f2));
		
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*10));
		
		System.out.println(Math.sqrt(9));
		System.out.println(Math.pow(2, 4));
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		
		System.out.printf("%d ",i);
		System.out.format("%8d %n",i);
		
		
		char c = 'a';
		Character c1 = c;
		c = c1;
		
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('a'));
		
//		String a = 'a';
		String str3 = Character.toString('a');
		
		
		String str4 = "haha";
		String str5 = "heihei";
		char[] cs = new char[]{'a','b','c'};
		String str6 = new String(cs);
		String str7 = str4+str5;
		
		System.out.println(str7.length());
		
		
		System.out.println(str7.charAt(0));
		char[] cs1 = str7.toCharArray();
		System.out.println(cs1.length == str7.length());
		
		System.out.println(str7.substring(3));
		System.out.println(str7.substring(3, 6));
		
		String subStr[] = str7.split("h");
		for(String sub:subStr){
			System.out.println(sub);
		}
		
		System.out.println(str7.trim());
		
		System.out.println(str7.toLowerCase());
		System.out.println(str7.toUpperCase());
		
		System.out.println(str7.indexOf('h'));
		System.out.println(str7.indexOf("hh"));
		System.out.println(str7.lastIndexOf('h'));
		System.out.println(str7.indexOf('h',3));
		System.out.println(str7.contains("hh"));
		
		System.out.println(str7.replaceAll("h", "H"));
		System.out.println(str7.replaceFirst("h", " "));
		
		
		String str8 = "haha";
		String str9 = new String(str8);
		System.out.println(str8 == str9);
		
		String str10 ="haha";
		System.out.println(str8 == str10);
		
		System.out.println(str8.equals(str9));
		System.out.println(str8.equalsIgnoreCase(str9));
		
		System.out.println(str7.startsWith("ha"));
		System.out.println(str7.endsWith("ha"));
		
		
		StringBuffer sb = new StringBuffer(str7);
		sb.append("h");
		sb.delete(3, 6);
		sb.insert(3, "hah");
		sb.reverse();
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
	}

}