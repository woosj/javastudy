package javaDay09;

public class MethodEx3 {
	int var;
	
	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
		//var = var; ����� Ŭ���� �ɹ��������� ������ ���� ���Ѵ�.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx3 me3 = new MethodEx3();
		me3.setVar(1000);
		System.out.println(me3.getVar());
	}

}
