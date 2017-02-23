package javaDay04;

public class ForEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAX = 10;
		int MAX_HALF = MAX/2;

		for( int i = 0 ; i < MAX ; i++){
			
			for( int j = 1 ; j <= MAX_HALF; j++){
				if( MAX_HALF > i ){
					if( (MAX_HALF - i ) <= j ){
						System.out.print(" *");
					}else{
						System.out.print(" ");
					}
				}else{
					if( ( (i+1) - MAX_HALF ) < j ){
						System.out.print(" *");
					}else{
						System.out.print(" ");
					}
				}
			}
			
			System.out.println();
		}
	}

}
