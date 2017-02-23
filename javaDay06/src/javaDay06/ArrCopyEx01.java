package javaDay06;

public class ArrCopyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] src = {"JAVA","DB","Iot","linux"};
		
		String[] des = new String[6];
		
		des[0] = "os";
		des[1] = "network";
		des[2] = "network";
		
		System.arraycopy(src, 0, des, 2, 4);
		
		for(String te : des){
			System.out.println(te);
		}
	}

}
