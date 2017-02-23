package problem201701;

public class problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2차원 배열을 이용하여 다음과 같이 결과를 출력하시오.
		 * 1  2  3  4  5
		 * 10 9  8  7  6
		 * 11 12 13 14 15
		 * 20 19 18 17 16
		 */
		int cnt = 5;
		int[][] arr = new int[cnt][cnt];
		int add = 1;
		int plus = 1;
		int minus = 1;
		
		//행출력
		for(int i = 0; i < arr.length;i++){
			
			//열출력
			if(i%2 == 0){
				for(int j = 0; j < arr[i].length; j++){
					//증가되는 값을 넣는다.
					arr[i][j] = add++;
				}
			}else{
				for(int j = (arr[i].length-1); j >= 0; j--){
					//증가되는 값을 넣는다.
					arr[i][j] = add++;
				}
				
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
