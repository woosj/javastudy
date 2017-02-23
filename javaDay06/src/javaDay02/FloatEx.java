package javaDay02;

public class FloatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * float형은 변수값 뒤에 f를 붙여줘야한다
		 */
		float var1,var2;
		double var3;
		
		var1 = 3.4f;
		var2 = 55.55f; //자료형이 float일 경우 값에다 자료형을 명시해 주어야함
		var3 = 55.55;	
		
		System.out.println("var1의 값: " + var1);
		System.out.println("var2의 값: " + var2);
		System.out.println("var2의 더블형 값: " + (double)var2);
		System.out.println("var3의 값: " + var3);
	}

}
