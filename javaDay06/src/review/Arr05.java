package review;

public class Arr05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1~9 ������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ ���α׷��̴�.
		 */
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		//�迭 ballArr�� ������ ��� 2���� ��� ��ġ�� �ٲ۴�. 20�� �ݺ�
		for(int x=0; x<20; x++){
			int i = (int)(Math.random() * ballArr.length);
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			/*tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
			*/
			ballArr[i] = ballArr[i]^ballArr[j];
			ballArr[j] = ballArr[j]^ballArr[i];
			ballArr[i] = ballArr[i]^ballArr[j];
		}
		
		// �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		for(int i = 0; i < ball3.length; i++){
			ball3[i] = ballArr[i];
		}
		
		for(int i =0 ; i < ball3.length; i++){
			System.out.println(ball3[i]);
		}
	}

}
