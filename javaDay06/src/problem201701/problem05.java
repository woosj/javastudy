package problem201701;

public class problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2���� �迭�� �̿��Ͽ� ������ ���� ����� ����Ͻÿ�.
		 *  1  2  3  4
		 *  5  6  7
		 *  8  9
		 * 10
		 */
		
		
		int cnt = 4;	//�迭�� ��ũ��
		int[][] arr = new int[cnt][];	//2���� �迭 ����
		int num = 1;	//���� ������
		
		//�����
		for(int i = 0; i < arr.length;i++){
			//���׵� �迭 ���� 2�� �迭������ ���� �þ� ���� ���� ���� ũ��� �ϳ��� �ش�.
			arr[i] = new int[(cnt-i)];
			
			//�����
			for(int j = 0; j < arr[i].length; j++){
				
				//���ڰ� �ϳ��� �����Ѵ�. 
				arr[i][j] = num++;
				
			}
			
		}
				
		//���
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		/*int cnt_i = 4;	//�迭�� �� ũ��
		int cnt_j = 4;	//�迭�� �� ũ��
		int[][] arr = new int[cnt_i][cnt_j];	//2���� �迭 ����
		int num = 1;
		//�����
		for(int i = 0; i < arr.length;i++){
				
			//�����
			for(int j = 0; j < cnt_j-i; j++){
				
				//���ڰ� �ϳ��� �����Ѵ�. 
				//���� ���۰��� ��*��-1 �ν��۵ǰ� ���� ���� ũ�� * ���� �ε��� �̴�.
				arr[i][j] = num++;
			}
					
		}
		
		//���
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < cnt_j-i; j++){
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}*/
		
	}

}
