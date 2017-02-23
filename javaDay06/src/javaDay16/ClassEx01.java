package javaDay16;

import java.util.Scanner;

//클래스와 인스턴스
//사각형 클래스 설계
/*
 * 사각형의 넓이와 둘레 계산 클래스로 표현
 * 클래스		: 사각형
 * 클래스의 속성	: 가로, 세로, (넓이, 둘레, 무게, 색깔, 재질.....)
 * 클래스의 기능	: 넓이계산, 둘레계산, 가로/세로 입력 결과출력
 * 
 * 객체의 구성	: 데이터(속성, 상태) + 기능(행위)
 * 클래스의 구성	: 멤버필드(변수) + 메서드
 * 
 */

//사각형 클래스 설계
class Rect{
	
	int width;	//클래스 멤버변수 가로
	int height;	//클래스 멤버변수 세로
	
	/*
	 * 
	 */
	public Rect() {
		// TODO Auto-generated constructor stub
	}
	
	public Rect(int x, int y) {
		// TODO Auto-generated constructor stub
		this.width = x;
		this.height = y;
	}
	
	//가로와 세로값 입력
	void input(){
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 입력 : ");
		width = sc.nextInt();
		
		System.out.println("세로 입력 : ");
		height = sc.nextInt();
	}//end of inpu()
	
	//넓이 계산
	int area(){
		int result = this.width * this.height;
		return result;
	}
	
	int area(int x, int y){
		
		int result = x * y;
		return result;
	}
	
	//둘레를 구하는 메서드 정의
	int length(){
		int result;
		result = (this.width + this.height) * 2;
		return result;
	}
	
	int length(int x, int y){
		int result;
		result = (x + y) * 2;
		return result;
	}
	
	/*
	 * 결과를 출력하는 메서드 정의
	 * 
	 * 매개변수를 통해 데이터를 넘겨받은 (갖고있지 않은 데이터)
	 * 메서드의 매개변수는 메서드 내에서만 활동 가능함
	 * 매개변수 선언시 각각의 변수마다 자료형을 따로 지정해야함
	 * 
	 */
	
	void print(int a, int l){
		System.out.println("가로 : " + this.width);
		System.out.println("세로 : " + this.height);
		System.out.println("넒이 : " + a);
		System.out.println("둘레 : " + l);
	}
}
/*
 * 하나의 자바파일(.Java)에 여러개의 class를 만들수 있음
 * 하지만 [public class]는 하나만 올 수 있다.
 * 파일을 저장할때의 이름은 [public class] 이름으로 지정해야 한다.
 * 일반적으로 하나의 파일에는 하나의 클래스를 설계함
 * 
 */
public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rect 클래스 인스턴스 생성
		Rect r = new Rect();
		
		//입력 메서드 호출
		r.input();
		
		//연산메서드 호출(넓이,둘레)
		int area = r.area();
		int length = r.length();
		
		//출력 메서드 호출
		r.print(area, length);
		
	}

}
