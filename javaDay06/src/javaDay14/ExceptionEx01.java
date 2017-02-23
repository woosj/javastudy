package javaDay14;

/*
 * 실행도중 정수를 0으로 나눌 경우 생길수 있는 예외처리
 */
public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 50, sum = 0;
		for(int i = 0; i < 10; i++){
			try {
				sum = num/(int)(Math.random()*5);
				System.out.println(sum);
				
			} catch (ArithmeticException e) {
				// TODO: handle exception
				//e.printStackTrace();
				System.out.println("계산이 안되는 것 알죠 !!!");
				//System.out.println(e.getMessage());
			}
		}
	}

}
