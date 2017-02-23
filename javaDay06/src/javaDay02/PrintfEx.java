package javaDay02;

public class PrintfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		char b = 'A';
		float c = 12.346f;
		String d = "ghdrlfehd";
		/*
		 * %c, %d, %f, %s
		 * char, int, float, string		 * 
		 */
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.printf("a= %d 입니다.\n", a);
		System.out.printf("b= %c 입니다.%n", b);
		System.out.printf("b= %c %d 입니다.%n", b,(int)b);
		System.out.printf("c= %f 입니다.\n", c);
		System.out.printf("c= %6.2f 입니다.\n", c);
		System.out.printf("d= %s 입니다.\n", d);
		
		
	}

}
