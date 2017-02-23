package problem201701;

public class problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2차원 배열을 이용하여 다음과 같이 결과를 출력하시오.
		 * 20 16 12 8 4 
		 * 19 15 11 7 3
		 * 18 14 10 6 2
		 * 17 13 9  5 1
		 */
		
		int cnt_i = 4;	//배열의 행 크기
		int cnt_j = 5;	//배열의 열 크기
		int[][] arr = new int[cnt_i][cnt_j];	//2차원 배열 선언
		
		//행출력
		for(int i = 0; i < arr.length;i++){
				
			//열출력
			for(int j = 0; j < arr[i].length; j++){
				
				//숫자가 하나씩 증가한다. 
				//행의 시작값은 행*열-1 로시작되고 열은 행의 크기 * 열의 인덱스 이다.
				arr[i][j] = (cnt_i * cnt_j - i) - (cnt_i*j);
			}
					
		}
						
		//출력
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
