package javaDay04;

public class ForEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * while�� ���
		 * 1/2 + 2/3 + 3/4 .... 9/10 �հ踦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
