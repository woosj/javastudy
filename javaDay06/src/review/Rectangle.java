package review;

public class Rectangle {
	private int x1,x2,y1,y2;
	private static int count = 0;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		x1 = 1;
		y1 = 1;
		x2 = 2;
		y2 = 2;
		count++;
	}
	
	public Rectangle(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		count++;
	}
	
	void set(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		
	}
	
	int square(){
		int result;
		result = (x1-x2)*(y1-y2);
		return result;
	
	}
	
	void show(){
		 System.out.println("사각형의 좌표 : ("+x1+","+y1+"),("+x2+","+y2+")");
		 System.out.println("사각형의 넓이 : " + square());
		 System.out.println("사각형 만들어진 갯수 : " + count);
	}
}
