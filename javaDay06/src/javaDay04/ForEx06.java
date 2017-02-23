package javaDay04;

public class ForEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * while문 사용
		 * 1/2 + 2/3 + 3/4 .... 9/10 합계를 구하는 프로그램을 작성하시오.
		 * 
		 * 
		 */
		
		double i = 0,j=1;
		int a = 0;
		double total = 0,total2 = 0;
		
		/*for( i = 0 ; i <= 10; i++){
			total += (i/(i + 1));
		}
		System.out.println(total);*/
		
		i = 0;
		total = 0;
		
		while(i <= 9){
			total = total + (i/j);
			total2 += (double)a/(a+1);
			i++;
			j++;
			a++;
		}
		
		System.out.printf("%10.2f",total);
		System.out.printf("%10.2f",total2);
	}

}
