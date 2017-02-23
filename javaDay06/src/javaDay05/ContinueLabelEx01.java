package javaDay05;

public class ContinueLabelEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		F1: for(int i = 0; i <= 5; i++){
			F2:for(int j = 0; j <= 3; j++){
				if(j==1){
					continue F1;
				}
				System.out.print(j+"x"+i+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}

}
