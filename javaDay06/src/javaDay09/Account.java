package javaDay09;

public class Account {
	private String name;
	private long balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		
	}
	
	public void deposit(long amount){
		//�Աݱ��
		balance += amount;
	}
	
	public void withdraw(long amount){
		
		if(balance > amount){
			balance -= amount;
		}else{
			System.out.println("�ܾ��� �����մϴ�.");
		}
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}
