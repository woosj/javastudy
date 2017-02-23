package javaDay10;

class PointEx{
	private int x;
	private int y;
	
	public PointEx() {
		// TODO Auto-generated constructor stub
	}
	
	public PointEx(int x) {
		// TODO Auto-generated constructor stub
		this.x = x;
	}
	
	public PointEx(int x, int y) {
		// TODO Auto-generated constructor stub
		this(x);
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void disp(){
		//출력함수
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		
	}
	
}

public class SuperEx03 extends PointEx {
	
	private int r;
	
	public SuperEx03() {
		// TODO Auto-generated constructor stub
	}
	
	public SuperEx03(int x) {
		// TODO Auto-generated constructor stub
		super(x);
		r = 1;
	}
	
	public SuperEx03(int x, int y) {
		// TODO Auto-generated constructor stub
		super(x,y);
		r = 2;
	}
	
	public SuperEx03(int x, int y, int r) {
		// TODO Auto-generated constructor stub
		super(x,y);
		this.r = r;
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void disp(){
		super.disp();
		System.out.println("r의 값은 : " + r);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperEx03 su = new SuperEx03(1,2,4);
		su.disp();
	}

}
