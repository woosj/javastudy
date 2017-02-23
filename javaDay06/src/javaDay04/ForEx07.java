package javaDay04;

public class ForEx07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * while 문을 구하시오.
		 * 
		 * 1*2*3* .... *10 의  값을 구하시오.
		 * 
		 */
		
		int i = 1;
		int sum = 1;
		
		while(i <= 10){
			sum *= i;	
			i++;
		}
		
		System.out.println("1 ~ 10 까지의 곱 : " + sum);
		
	}
}
