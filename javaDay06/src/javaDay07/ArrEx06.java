package javaDay07;

public class ArrEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	*        *
		 *  **      **
		 *  ***    ***
		 *  ****  ****
		 *  **********
		 *  **********
		 *  ****  ****
		 *  ***    ***
		 *  **      **
		 *  *        *
		 */
		int max = 5;
		for(int i = 0; i < max; i++){
			for(int j = 0; j < (i+1); j++){
				System.out.print("*");
			}
			
			for(int k = 0; k < 8-(i*2); k++){
				System.out.print(" ");
			}
			
			for(int k = 0; k <= i; k++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = 0; i < max; i++){
			for(int j = i; j < max; j++){
				System.out.print("*");
			}
			
			for(int k = 0; k < i*2; k++){
				System.out.print(' ');
			}
			
			for(int k = 0; k < (max-i); k++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/*
		for(int i = 0; i < 5; i++){
			for(int j = i; j <5;j++){
				System.out.print(" ");
			}			
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}*/
	}

}
