package javaDay16;

/*
 * 문2]
 *	임의의 정수를 입력받아 1 부터 입력받은 수 까지의 합을 구하여 결과값을 출력하는 프로그램을 구현
 *	단, 클래스의 개면(클래스 따로구현)을 적용시켜 처리할 수 있도록 한다.
 *	또한 입력 처리 과정에서 BufferReader 의 readLine()을 사용하며 입력 데이터가 1보다 작거나 1000보다 큰 경우 다시 입력을 받도록 한다.
 *
 */
public class OperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oper op = new Oper();
		op.Input();
		op.Sum_result();
		op.disp();
	}

}
