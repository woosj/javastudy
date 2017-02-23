package javaDay05;

public class BreakLableEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		One: for(int i = 0; i < 5; i++){
				Two: for(int j = 0; j < 3; j++){
					if( i == 2) break One;
					System.out.print(j + "x" + i + " ");
				}
				System.out.println(" ");
				
		}
	}

}
