package problem201701;

public class problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2차원 배열을 이용하여 다음과 같이 결과를 출력하시오.
		 * 1  
		 * 2  3  
		 * 4  5  6
		 * 7  8  9  10
		 */
		
		int cnt = 4;	//배열의 행크기
		int[][] arr = new int[cnt][];	//2차원 배열 선언
		int num = 1;	//숫자 증가값
		//행출력
		for(int i = 0; i < arr.length;i++){
			//레그드 배열 선언 2차 배열공간이 하나씩 늘어난다.
			arr[i] = new int[(i+1)];
			
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
	}

}
