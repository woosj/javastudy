package javaDay04;

public class ForEx07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * while ���� ���Ͻÿ�.
		 * 
		 * 1*2*3* .... *10 ��  ���� ���Ͻÿ�.
		 * 
		 */
		
		int i = 1;
		int sum = 1;
		
		while(i <= 10){
			sum *= i;	
			i++;
		}
		
		System.out.println("1 ~ 10 ������ �� : " + sum);
		
	}
}
