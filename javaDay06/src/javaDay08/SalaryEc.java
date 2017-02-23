package javaDay08;

class Salary {
	private int pay;

	public int getPay() {
		return pay;
	}

	public void setPay(int pay, String pass) {
		
		if(pass.equals("1234"))		
		this.pay = pay;
		
		/*
		 * this는 현재 클래스내의 변수
		 * 현재클래스를 가르킴
		 * super는 상속받은  상위클래스의 변수접근할때 사용
		 * 상속받은 상위클래스를 가르킴
		 */
	}
	
}
public class SalaryEc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary ss = new Salary();
		ss.setPay(1000, "1234");
		
		int myPay = ss.getPay();
		
		System.out.println(myPay);
		
	}

}
