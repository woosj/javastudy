package javaDay14;

public class ExceptionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(5);
		}finally {
			System.out.println("무조건 수행한다.");
			
		}
		System.out.println(6);
		System.out.println();
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(5);
		}finally {
			System.out.println("무조건 수행한다.");
			
		}
		System.out.println(6);
	}

}
