package javaDay11;

import java.io.IOException;

public class CalculateExam02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//메서드 호출만해서 처리
		
		//객체 생성
		Calculate cal = new Calculate();
		
		//두 정수 입력 및 연산자 입력 메서드
		cal.Input();
		
		//계산 메서드
		int a = cal.cal();
		
		//출려 메서드
		cal.disp(a);
	}

}
