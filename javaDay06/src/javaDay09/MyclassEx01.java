package javaDay09;

class Myclass {
	private String name;
	private int age;
	
	public Myclass() {
		// TODO Auto-generated constructor stub
		this.name = "test";
		this.age = 20;
	}
	
	//������ �Լ� �����ε�
	public Myclass(String n) {
		// TODO Auto-generated constructor stub
		this.name = n;
	}
	
	//������ �Լ� �����ε�
	public Myclass(int a) {
		// TODO Auto-generated constructor stub
		this.age = a;
	}
	
	//������ �Լ� �����ε�
	public Myclass(int a,String n) {
		// TODO Auto-generated constructor stub
		this.age = a;
		name = n;
	}
	
	//������ �Լ� �����ε�
	public Myclass(String n, int a) {
		// TODO Auto-generated constructor stub
		this.age = a;
		name = n;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}
	
}
public class MyclassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass mc1 = new Myclass();
		Myclass mc2 = new Myclass("ȫ�浿");
		Myclass mc3 = new Myclass("ȫ�浿",24);
		Myclass mc4 = new Myclass(27,"������");
		
		System.out.println(mc1.getName() +"," + mc1.getAge());
		System.out.println(mc2.getName() +"," + mc2.getAge());
		System.out.println(mc3.getName() +"," + mc3.getAge());
		System.out.println(mc4.getName() +"," + mc4.getAge());
	}

}
