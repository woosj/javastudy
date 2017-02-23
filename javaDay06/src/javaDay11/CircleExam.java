package javaDay11;

public class CircleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 = 인스턴스 생성
		Circle cir = new Circle();
		
		//반지름 입력 메서드 호출
		cir.input();
		
		//원의 넓이를 구하는 메서드 호출
		double square = cir.Circle_Square();
		
		//원의 둘레를 구하는 메서드 호출
		double length = cir.Circle_length();
		
		//출력 메서드 호출
		cir.Print(square, length);
		
	}

}
