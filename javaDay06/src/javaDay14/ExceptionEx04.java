package javaDay14;

public class ExceptionEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			if(ae instanceof ArithmeticException){
				System.out.println(true);
			}
			System.out.println("계산착오");
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외발생");
			
		}
	}

}
