package javaDay07;

public class ArrEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * do~while , while
		 * -1^2 + 2^2 -3^2 + .... + 100^2 ������ ���� ���Ͽ���
		 */
		int i = 1;
		int total = 0;
		int plus = 1;
		do{
			/*if(i%2 == 0){
				total = total + i*i;
			}else{
				total = total + -(i*-1)*i;
			}*/
			
			plus = -plus;
			total = total + i*i*plus;
			i++;
			
		}while(i <= 100);
		
		System.out.println("��:"+total);
		
		/*
		 * -50���� 1������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		 * ��, �� �ٿ� 5���� ����ϰ� ������ �ǰ���
		 * 
		 * ��� -50 -49 -48 -47 -46
		 *    -45	
		 */
		int j = -50;
		while(j <= 1){
			
			if(j > -50 && j%5 == 0){
				System.out.println();
			}
			
			System.out.print(j + "\t");
			
			j++;
		}
		
		
	}

}
