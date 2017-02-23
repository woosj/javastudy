package javaDay11;

import java.io.IOException;

public class SumExam01 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//객체선언
		Sum sum = new Sum();
		int result = 0;
		//정수 입력 
		sum.Input();
		
		//1~ 입력수 까지 합계
		result = sum.Sum_result();
		
		//출력
		sum.disp();
	}

}
