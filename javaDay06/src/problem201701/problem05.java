package problem201701;

public class problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2차원 배열을 이용하여 다음과 같이 결과를 출력하시오.
		 *  1  2  3  4
		 *  5  6  7
		 *  8  9
		 * 10
		 */
		
		
		int cnt = 4;	//배열의 행크기
		int[][] arr = new int[cnt][];	//2차원 배열 선언
		int num = 1;	//숫자 증가값
		
		//행출력
		for(int i = 0; i < arr.length;i++){
			//레그드 배열 선언 2차 배열공간이 행이 늘어 날때 마나 열의 크기는 하나씩 준다.
			arr[i] = new int[(cnt-i)];
			
			//열출력
			for(int j = 0; j < arr[i].length; j++){
				
				//숫자가 하나씩 증가한다. 
				arr[i][j] = num++;
				
			}
			
		}
				
		//출력
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		/*int cnt_i = 4;	//배열의 행 크기
		int cnt_j = 4;	//배열의 열 크기
		int[][] arr = new int[cnt_i][cnt_j];	//2차원 배열 선언
		int num = 1;
		//행출력
		for(int i = 0; i < arr.length;i++){
				
			//열출력
			for(int j = 0; j < cnt_j-i; j++){
				
				//숫자가 하나씩 증가한다. 
				//행의 시작값은 행*열-1 로시작되고 열은 행의 크기 * 열의 인덱스 이다.
				arr[i][j] = num++;
			}
					
		}
		
		//출력
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < cnt_j-i; j++){
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}*/
		
	}

}
