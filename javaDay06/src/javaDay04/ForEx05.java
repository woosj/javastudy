package javaDay04;

public class ForEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1���� 100������ �հ踦 ���ϵ�, 10�� ����� �ɶ����� ����� ����ϴ� ���α׷��� �����Ͻÿ�.
		 * 
		 * 1 ~ 10 ������ �հ� : 55
		 * 1 ~ 20 ������ �հ� : 210
		 * 1 ~ 30 ������ �հ� : 465
		 * 
		 * 1 ~ 100 ������ �հ� : 5050
		 * 
		 */
		
		int i = 0;
		int sum = 0;
		
		for( i = 0 ; i <= 100; i++){
			sum += i;
			
			if( i%10 == 0 && i > 0 ){
				System.out.println("1 ~ " + i + " ������ �հ� : " + sum);
			}
		}
		
		i = 0;
		sum = 0;
		while(i <= 100){
			sum += i;			
			if( i%10 == 0 && i > 0 ){
				System.out.println("1 ~ " + i + " ������ �հ� : " + sum);
			}
			i++;
		}
		
	}

}
