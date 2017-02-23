package javaDay04;

public class ForEx03 {
	public static void main(String[] args) {
		int i, sum = 0;
		
		for( i = 0; i <= 100; i++){
			sum +=i;
		}
		
		System.out.println("for문 1 ~ 100까지의 합계 : " + sum);
		
		i = 0;
		sum = 0;
		while(i<=100){
			sum += i;
			i++;
		}
		System.out.println("while문 1 ~ 100까지의 합계 : " + sum);
		
		i = 0;
		sum = 0;
		do{
			sum += i;
			i++;
		}while(i<=100);
		System.out.println("do문 1 ~ 100까지의 합계 : " + sum);
		
	}
}
