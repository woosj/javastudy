package javaDay09;

public class Circle {
	int radius;
	private Point point;	//point ���������� �ʵ�(�������)�� �����
	
	public Circle() {
		// TODO Auto-generated constructor stub
		radius = 0;
		point = new Point(0,0);
	}
	
	public Circle(int r) {
		point = new Point(0,0);
		radius = r;
	}
	
	public Circle(Point p, int r) {
		point = p;
		radius = r;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", point=" + point + "]";
	}
	
	
	
}
