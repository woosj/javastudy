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
		
		System.out.printf("a= %d �Դϴ�.\n", a);
		System.out.printf("b= %c �Դϴ�.%n", b);
		System.out.printf("b= %c %d �Դϴ�.%n", b,(int)b);
		System.out.printf("c= %f �Դϴ�.\n", c);
		System.out.printf("c= %6.2f �Դϴ�.\n", c);
		System.out.printf("d= %s �Դϴ�.\n", d);
		
		
	}

}
