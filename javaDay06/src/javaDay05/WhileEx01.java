package javaDay05;

public class WhileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1 부터 100 까지의 합계
		 * 
		 */
		
		//변수선언
		int i, sum = 0;
		
		//연산처리
		i = 0;
		while(i<=100){
			sum += i;
			i++;
		}
		
		/*do{
			sum += i;
			i++;
		}while(i<=100);
		*/
		
		//결과출력
		System.out.println(sum);

	}

}
