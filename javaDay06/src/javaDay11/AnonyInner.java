package javaDay11;

abstract class Tt {
	int data = 100;
	public abstract void printData();
}

class Inner6 {
	
	int y = 200;
	static int common = 1000;
	
	public Inner6(){
		this.disp();
	}
	
	public void disp(){}
				
}

public class AnonyInner {
	Tt t = new Tt() {
		
		@Override
		public void printData() {
			// TODO Auto-generated method stub
			System.out.println("data : " + data);
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonyInner aa = new AnonyInner();
		aa.t.printData();
		
		int x = 100;
		
		Inner6 bb = new Inner6();
		Inner6 cc = new Inner6();
		
		System.out.println(bb.common);
		System.out.println(cc.common);
		
		bb.common = 300;
		
		System.out.println(bb.common);
		System.out.println(cc.common);
		
		new Inner6(){
			public void disp(){
				System.out.println("default »ý¼ºÀÚ");
				System.out.println("x = " + x);
				System.out.println("y = " + y);
			}
		};
	}

}
