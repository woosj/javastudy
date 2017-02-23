package javaDay17;

import java.io.IOException;

/*
 * 임의의 두 정수와 연산자를 입력받아 사칙연산을 수행하는 프로그램을 작성하시오.
 * 단, 클래스 개념을 적용하여 구현하도록 한다.
 * 클래스명 : Calcaulte (입력, 계산, 출력 메서드 구현)
 * 실행클래스 : Test002 에서 메서드만 호출하여 실행할 수 있도록 구현하시오.
 * 
 */

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calulate cal = new Calulate();
		cal.Input();
		int result = cal.cal();
		cal.disp(result);
		
		
	}

}
