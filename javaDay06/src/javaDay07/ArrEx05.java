package javaDay07;

public class ArrEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2���� �迭�� �̿��Ͽ� ������ ���� ����� ����Ͻÿ�.
		 * 1 2 3 4 5
		 * 2 3 4 5 6
		 * 3 4 5 6 7
		 * 5 6 7 8 9
		 */
		for(String s : args){
			System.out.println(s);
		}
		int cnt = 5;
		int[][] arr = new int[cnt][cnt];
		
		//�����
		for(int i = 0; i < arr.length;i++){
			//�����
			for(int j = 0; j < arr[i].length; j++){
				//�����Ǵ� ���� �ִ´�.
				arr[i][j] = (i+1)+j;
			}
		}
		
		//���
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		/*
		 * 2���� �迭�� �̿��Ͽ� ������ ���� ����� ����Ͻÿ�.
		 * 1  2  3  4  5
		 * 10 9  8  7  6
		 * 11 12 13 14 15
		 * 20 19 18 17 16
		 */
		int add = 1;
		int plus = 1;
		int minus = 1;
		
		//�����
		for(int i = 0; i < arr.length;i++){
			
			//�����
			if(i%2 == 0){
				for(int j = 0; j < arr[i].length; j++){
					//�����Ǵ� ���� �ִ´�.
					arr[i][j] = add++;
				}
			}else{
				for(int j = (arr[i].length-1); j >= 0; j--){
					//�����Ǵ� ���� �ִ´�.
					arr[i][j] = add++;
				}
				
			}
			/*for(int j = 0; j < arr[i].length; j++){
				//�����Ǵ� ���� �ִ´�.
				if(i%2 != 0){
					arr[i][j] = add--;
				}else{
					arr[i][j] = add++;
				}
				
			}
			
			if(i%2 == 0){
				add = add+4;
			}else{
				add = add+6;
			}*/
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
