package javaDay06;

public class ArrEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a;	//2���� �迭 ����
		//int i = 2, j = 3
		
		a = new int[2][3];
		
		//ù��°��
		a[0][0] = 100;
		a[0][1] = 200;
		a[0][2] = 300;
		//�ι�°��
		a[1][0] = 400;
		a[1][1] = 500;
		a[1][2] = 600;
		
		//ù��° �ε���
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
			
		}
		
	}

}
