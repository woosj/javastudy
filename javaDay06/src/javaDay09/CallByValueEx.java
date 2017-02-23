package javaDay09;

public class CallByValueEx {
	//값에 의한 호출(Call by value)
	/*
	 * 메서드 호출시 기본 자료형의 ㄱ밧을 인자값으로
	 * 호출하는 방식을 의미함
	 */
	public int incre(int n){
		n++;
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 100;
		
		CallByValueEx ce = new CallByValueEx();
		
		int var2 = ce.incre(var1);
		
		System.out.println("var1:"+var1+"var2:"+var2);
		
	}

}
