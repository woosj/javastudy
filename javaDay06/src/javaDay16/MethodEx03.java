package javaDay16;

//메서드호출
public class MethodEx03 {

	public static void showHi(){
		System.out.println("Hellow , Welcome to JAVA.");
	}
	
	public static int a(int b){
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx03 m3 = new MethodEx03();
		m3.showHi();
		int a = a(1);
		
	}

}
