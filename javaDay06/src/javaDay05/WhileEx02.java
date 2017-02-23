package javaDay05;

public class WhileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 달력
		 */
		//변수선언
		int i = 1;
		
		while(i<=31){
			
			if( i%7 == 0 ){
				//변수가 7로 나누어질 때 행바꿈
				System.out.println(i);
			}else{
				System.out.print(i+"\t");
			}
			
			i++;
		}
		
		System.out.println();
	}

}
