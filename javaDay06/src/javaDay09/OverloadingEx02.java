package javaDay09;

public class OverloadingEx02 {
	
	//생성자 함수도 오버로딩이 가능하다.
	public OverloadingEx02() {
		// TODO Auto-generated constructor stub
	}
	
	public void getLength(int n){
		String s = String.valueOf(n);
		getLength(s);
	}
	
	void getLength(float n){
		String s = String.valueOf(n);
		getLength(s);
	}
	
	private void getLength(String str){
		System.out.println(str);
		System.out.println(str.length());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingEx02 vd = new OverloadingEx02();
		vd.getLength(100);
		vd.getLength(10.2f);
		vd.getLength("1000");
		
	}

}
