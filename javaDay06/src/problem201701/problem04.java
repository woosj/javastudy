package problem201701;

public class problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2���� �迭�� �̿��Ͽ� ������ ���� ����� ����Ͻÿ�.
		 * 1 5  9 13 17
		 * 2 6 10 14 18
		 * 3 7 11 15 19
		 * 4 8 12 16 20
		 */
		
		int cnt_i = 4;	//�迭�� �� ũ��
		int cnt_j = 5;	//�迭�� �� ũ��
		int[][] arr = new int[cnt_i][cnt_j];	//2���� �迭 ����
		
		//�����
		for(int i = 0; i < arr.length;i++){
				
			//�����
			for(int j = 0; j < arr[i].length; j++){
				
				//���ڰ� �ϳ��� �����Ѵ�. 
				//���� ���۰��� ���ε��� +1 �� ���۵ǰ� ���� ���� ũ�� * ���� �ε��� �̴�.
				arr[i][j] = ( i + 1 ) + (cnt_i*j);
			}
					
		}
						
		//���
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
