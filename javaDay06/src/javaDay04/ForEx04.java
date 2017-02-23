package javaDay04;

public class ForEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 ~ 100 까지으 ㅣ수중 짝수의 합, 홀 수의 합, 짝수와 홀수의 합을 구하시오.
		 */
		
		int i = 0;
		int even_sum = 0;
		int odd_sum = 0;
		
		for( i = 0 ; i <= 100; i++){
			if( (i%2) == 0 ){
				even_sum += i;
			}else{
				odd_sum += i;
			}
		}
		
		System.out.println("짝수의 합 :" + even_sum);
		System.out.println("홀수의 합 :" + odd_sum);
		System.out.println("짝수와 홀수의 함:" + (even_sum+odd_sum));
		
		i = 0;
		even_sum = 0;
		odd_sum = 0;
		while(i <= 100){
			if( (i%2) == 0 ){
				even_sum += i;
			}else{
				odd_sum += i;
			}
			i++;
		}
		
		System.out.println("짝수의 합 :" + even_sum);
		System.out.println("홀수의 합 :" + odd_sum);
		System.out.println("짝수와 홀수의 함:" + (even_sum+odd_sum));
		
		i = 0;
		even_sum = 0;
		odd_sum = 0;
		do{
			if( (i%2) == 0 ){
				even_sum += i;
			}else{
				odd_sum += i;
			}
			i++;
		}while(i <= 100);
		
		/*for( i = 0; i <= 100; i +=2 ){
			even_sum += i;
		}
		
		for( i = 1; i <= 99; i +=2 ){
			odd_sum += i;
		}*/
		
		System.out.println("짝수의 합 :" + even_sum);
		System.out.println("홀수의 합 :" + odd_sum);
		System.out.println("짝수와 홀수의 함:" + (even_sum+odd_sum));
		
	}

}
