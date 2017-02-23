package javaDay21;

class ATM2 {
	//ATM의 계좌 정보를 관리하는 클래스
	private int total;	//계좌의 총 잔액
	
	public ATM2(int total) {
		// TODO Auto-generated constructor stub
		this.total = total;
		
	}
	
	//입금
	void deposit(int amount, String name){
		total += amount;
		System.out.println(name + ": 입금 금액:" + amount);
	}
	
	//출금
	void withdraw(int amount, String name){
		if( total - amount > 0){
			//출금 가능한 조건
			total -= amount;
			System.out.println(name + ": 출금 금액:" + amount);
		}else{
			System.out.println(name + "님의 잔액이 부족합니다.");
		}
	}
	
	//
	public void getTotal() {
		System.out.println("현재 계좌의 잔액은 : " + total);
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
}

class ATM_USER2 extends Thread {
	//ATM 사용자 클래스
	
	ATM2 obj;
	boolean flag = false;	//입금, 출금
	
	
	public ATM_USER2(ATM2 obj, String name) {
		// TODO Auto-generated constructor stub
		super(name);
		this.obj = obj;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i = 0; i < 5; i++){
			try {
				sleep(500);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			//ATM 클래스에 동기화를 유지해 줄 수 있는 코드 삽입
			//중괄호 내에서는 입금중 출금을할 수 없도록 구현
			synchronized (obj) {
				if(flag){
					obj.deposit((int)(Math.random()*10000), getName());
					obj.getTotal();
				}else{
					obj.withdraw((int)(Math.random()*10000), getName());
					obj.getTotal();
				}
			}
			
			//동기화가 안됐을때
			/*if(flag){
				obj.deposit((int)(Math.random()*10000), getName());
				obj.getTotal();
			}else{
				obj.withdraw((int)(Math.random()*10000), getName());
				obj.getTotal();
			}*/
			
			
			
			flag = !flag;
			
		}
	}
}

public class ThreadEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//공유 금액 설정(계좌에 만원이 있음)
		ATM2 at = new ATM2(10000);
		
		//세명의 계좌를 처리함
		Thread user1 = new ATM_USER2(at,"우성정");
		Thread user2 = new ATM_USER2(at,"에이콘");
		Thread user3 = new ATM_USER2(at,"올데이");
		
		user1.start();
		user2.start();
		user3.start();

	}

}
