package javaDay05;

public class WhileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1 ���� 100 ������ �հ�
		 * 
		 */
		
		//��������
		int i, sum = 0;
		
		//����ó��
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
		
		//������
		System.out.println(sum);

	}

}
