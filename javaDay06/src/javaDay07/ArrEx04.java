package javaDay07;

public class ArrEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���� for���� �̿��Ͽ� 2�ܿ��� 9�ܱ��� �������� ����Ͻÿ�.
		 * ��, 3�ܾ� ����Ͻÿ�.
		 */
		int dan,num = 3;
		for(int i = 1; i < 9; i+=num){
			for(int j=1; j<=9; j++){
				for(int k =1; k <= num; k++){
					if(i+k <= 9){
						System.out.print((i+k) + "*" + j + "=" + (i+k)*j + "\t");
					}
				}
				System.out.println();
			}
			System.out.println();			
		}
		
		//���ܱ���
		for(int i = 2; i <= 8; i += 4){
			
			//���ϱ� �� 
			for(int k = 1; k <=9; k++){
				
				//������
				for( int j = i; j <= i+3; j++){
					System.out.printf(" %2d * %2d = %2d \t",j,k,(j*k));
				}
				
				System.out.println();
			}
			
			System.out.println();
		}

	}

}
