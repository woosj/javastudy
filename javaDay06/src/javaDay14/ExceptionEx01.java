package javaDay14;

/*
 * ���൵�� ������ 0���� ���� ��� ����� �ִ� ����ó��
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
				System.out.println("����� �ȵǴ� �� ���� !!!");
				//System.out.println(e.getMessage());
			}
		}
	}

}
