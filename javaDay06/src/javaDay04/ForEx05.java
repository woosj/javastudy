package javaDay04;

public class ForEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1부터 100까지의 합계를 구하되, 10의 배수가 될때마다 결과를 출력하는 프로그램을 구현하시오.
		 * 
		 * 1 ~ 10 까지의 합계 : 55
		 * 1 ~ 20 까지의 합계 : 210
		 * 1 ~ 30 까지의 합계 : 465
		 * 
		 * 1 ~ 100 까지의 합계 : 5050
		 * 
		 */
		
		int i = 0;
		int sum = 0;
		
		for( i = 0 ; i <= 100; i++){
			sum += i;
			
			if( i%10 == 0 && i > 0 ){
				System.out.println("1 ~ " + i + " 까지의 합계 : " + sum);
			}
		}
		
		i = 0;
		sum = 0;
		while(i <= 100){
			sum += i;			
			if( i%10 == 0 && i > 0 ){
				System.out.println("1 ~ " + i + " 까지의 합계 : " + sum);
			}
			i++;
		}
		
	}

}
