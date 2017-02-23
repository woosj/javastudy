package javaDay11;

import java.util.ArrayList;

public class ObjectEx01 {
	private String name;
	private int price;
	
	public ObjectEx01(String name, int price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectEx01 t1 = new ObjectEx01("1", 1);
		ObjectEx01 t2 = new ObjectEx01("1", 1);
		String str = "str";
		
		System.out.println("t1 :"+t1.toString());
		System.out.println("t2 :"+t2.toString());
		System.out.println("t1 :"+t1.hashCode());
		System.out.println("t2 :"+t2.hashCode());
		System.out.println(t1.equals(t2));
		System.out.println(str.equals("str"));
		

	}

}
