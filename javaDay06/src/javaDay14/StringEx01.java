package javaDay14;

public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Twnkle";
		String s2 = "Twnkle";
		
		if(s1 == s2){
			System.out.println("s1 과 s2는 같다");
		}else{
			System.out.println("s1 과 s2는 같지 않다.");
		}
		
		String s3 = new String("Little");
		String s4 = new String("Little");
		
		if(s3 == s4){
			System.out.println("s3 과 s4는 같다");
		}else{
			System.out.println("s3 과 s4는 같지 않다.");
		}
	}

}
