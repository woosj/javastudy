package problem201701;

public class problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2���� �迭�� �̿��Ͽ� ������ ���� ����� ����Ͻÿ�.
		 * 1  
		 * 2  3  
		 * 4  5  6
		 * 7  8  9  10
		 */
		
		int cnt = 4;	//�迭�� ��ũ��
		int[][] arr = new int[cnt][];	//2���� �迭 ����
		int num = 1;	//���� ������
		//�����
		for(int i = 0; i < arr.length;i++){
			//���׵� �迭 ���� 2�� �迭������ �ϳ��� �þ��.
			arr[i] = new int[(i+1)];
			
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
	}

}
