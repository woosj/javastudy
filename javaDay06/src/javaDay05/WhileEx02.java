package javaDay05;

public class WhileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �޷�
		 */
		//��������
		int i = 1;
		
		while(i<=31){
			
			if( i%7 == 0 ){
				//������ 7�� �������� �� ��ٲ�
				System.out.println(i);
			}else{
				System.out.print(i+"\t");
			}
			
			i++;
		}
		
		System.out.println();
	}

}
