package problem201701;

public class problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2���� �迭�� �̿��Ͽ� ������ ���� ����� ����Ͻÿ�.
		 * 20 16 12 8 4 
		 * 19 15 11 7 3
		 * 18 14 10 6 2
		 * 17 13 9  5 1
		 */
		
		int cnt_i = 4;	//�迭�� �� ũ��
		int cnt_j = 5;	//�迭�� �� ũ��
		int[][] arr = new int[cnt_i][cnt_j];	//2���� �迭 ����
		
		//�����
		for(int i = 0; i < arr.length;i++){
				
			//�����
			for(int j = 0; j < arr[i].length; j++){
				
				//���ڰ� �ϳ��� �����Ѵ�. 
				//���� ���۰��� ��*��-1 �ν��۵ǰ� ���� ���� ũ�� * ���� �ε��� �̴�.
				arr[i][j] = (cnt_i * cnt_j - i) - (cnt_i*j);
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
