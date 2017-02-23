package javaDay10;

public class CellPhone {
	//속성(멤버변수, 멤보필드)
	String model;	//모델명
	String number;
	int chord;	//화음
	
	//기능(멤버메서드)
	public String getModel() {
		return model;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getChord() {
		return chord;
	}
	
}
