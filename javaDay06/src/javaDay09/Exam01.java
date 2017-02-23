package javaDay09;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 원을 나타내는 Circle 클래스를 작성
		 * 원은 중심과 반지름으로 표현
		 * 중심을 표현하기 위해 point클래스를작성하고
		 * point 객체를 Circle클래스 안에 포함하여
		 * 정의하는 코드를 작성하시오. 
		 */
		
		Point p = new Point(25,78);
		Circle c = new Circle(p,10);
		
		System.out.println(c);
		
	}

}
