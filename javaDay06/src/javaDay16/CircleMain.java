package javaDay16;
/*
 * 문]
 * 원의 넒의와 둘레구하기
 * 원의 넒이와 둘레를 구하는 클래스를 별도 생성하여 구현하고
 * 메인에서 메서드 호출로 프로그램을 구현하시오.
 * 
 * 
 */

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle ci = new Circle();
		
		//입력 메서드 호출
		ci.radiusInput();
		
		//넒이 구하는 메서드 호출
		double area = ci.circleArea();
		//둘레 구하는 메서드 호출
		double length = ci.circleLength();
		
		//출력
		ci.print(area, length);
		
	}

}
