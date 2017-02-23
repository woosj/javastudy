package review;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 구구단 출력 1
		 * 2*1 = 2	3*1 = 3  ...... 9*1 = 9
		 * 2*2 = 4  3*2 = 6  ...... 9*2 = 18
		 * 
		 */
		for(int i = 1; i <= 9; i++){
			for( int j = 2; j <= 9; j++){
				System.out.print( j + "*" + i + " = " + (j*i) );
				System.out.print("    ");
			}
			System.out.println();
		}
		
		/*
		 * 구구단 출력 2
		 * 2*1 = 2	3*1 = 3  4*1 = 4
		 * 2*2 = 4  3*2 = 6  4*2 = 8
		 * 
		 * 5*1 = 5  6*1 = 6  7*1 = 8
		 * 
		 */
		System.out.println();
		System.out.println();
		
		for(int i = 2; i <= 8; i += 2){
			for(int k = 1; k <=3; k++){
				for( int j = i; j <= i+2; j++){
					System.out.print( j + "*" + k + " = " + (j*k) );
					System.out.print("\t");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
