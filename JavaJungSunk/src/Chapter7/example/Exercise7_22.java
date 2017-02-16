package Chapter7.example;

/*
[7-22] �Ʒ��� ������ ������ ShapeŬ�����̴�.  �� Ŭ������ �������� �ϴ� Ŭ���� Circle��
 Rectangle Ŭ������ �ۼ��Ͻÿ�. �� �� �����ڵ� �� Ŭ������ �°� ������ �߰��ؾ� �Ѵ�.
	(1) Ŭ������ : Circle 
	����Ŭ���� : Shape
	������� : double r - ������
	
	(2) Ŭ������ : Rectangle 
	����Ŭ���� : Shape
	������� : double width - ��
	double height - ����
	�޼��� :
	1. �޼���� : isSquare 
	�� �� : ���簢������ �ƴ����� �˷��ش�.
	��ȯŸ�� : boolean
	�Ű����� ����
*/
class Circle extends Shape {
	double r; //������
	
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

	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���

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
[7-23]  7-22 �������� ������ Ŭ�������� ������ ���ϴ� �޼��带 �ۼ��ϰ� �׽�Ʈ �Ͻ�
��.
1. �޼���� : sumArea 
�� �� : �־��� �迭�� ��� �������� ���̸� ��� ���ؼ� ��ȯ�Ѵ� .
��ȯŸ�� : double
�Ű����� : Shape[] arr
*/

public class Exercise7_22 {
	/*
	(1) sumArea . �޼��带 �ۼ��Ͻÿ�
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
		System.out.println("������ �� :"+sumArea(arr));
	}

}
