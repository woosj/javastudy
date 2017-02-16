package Chapter7.example;

/*
[7-22] 아래는 도형을 정의한 Shape클래스이다.  이 클래스를 조상으로 하는 클래스 Circle와
 Rectangle 클래스를 작성하시오. 이 때 생성자도 각 클래스에 맞게 적절히 추가해야 한다.
	(1) 클래스명 : Circle 
	조상클래스 : Shape
	멤버변수 : double r - 반지름
	
	(2) 클래스명 : Rectangle 
	조상클래스 : Shape
	멤버변수 : double width - 촉
	double height - 높이
	메서드 :
	1. 메서드명 : isSquare 
	기 능 : 정사각형인지 아닌지를 알려준다.
	반환타입 : boolean
	매개변수 없음
*/
class Circle extends Shape {
	double r; //반지름
	
	public Circle(double r) {
		// TODO Auto-generated constructor stub
		this(new Point(0,0),r);
	}
	
	public Circle(Point p, double r) {
		// TODO Auto-generated constructor stub
		super(p);
		this.r = r;
	}
	
	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}
	
}

class Rectangle extends Shape {
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		// TODO Auto-generated constructor stub
		this(new Point(0,0), width, height);
	}
	
	public Rectangle(Point p, double width, double height) {
		// TODO Auto-generated constructor stub
		super(p);
		this.width = width;
		this.height = height;
	}
	
	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	boolean isSquare(){
		boolean result = false;
		
		if( width == height ) result = true;
		
		return result;
	}
}

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}
/*
[7-23]  7-22 문제에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트 하시
오.
1. 메서드명 : sumArea 
기 능 : 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환한다 .
반환타입 : double
매개변수 : Shape[] arr
*/

public class Exercise7_22 {
	/*
	(1) sumArea . 메서드를 작성하시오
	*/
	public static double sumArea(Shape[] arr){
		double result = 0.0;
		for( int i = 0; i < arr.length; i++){
			result += arr[i].calcArea();
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합 :"+sumArea(arr));
	}

}
