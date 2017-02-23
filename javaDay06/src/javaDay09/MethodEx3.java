package javaDay09;

public class MethodEx3 {
	int var;
	
	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
		//var = var; 선언시 클래스 맴버변수에는 연향을 주지 못한다.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx3 me3 = new MethodEx3();
		me3.setVar(1000);
		System.out.println(me3.getVar());
	}

}
