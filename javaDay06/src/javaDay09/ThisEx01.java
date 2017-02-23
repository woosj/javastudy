package javaDay09;

class This{
	String name,jumin,tel;
	
	public This() {
		// TODO Auto-generated constructor stub
		this.name = "home";
		this.jumin = "123456-12345678";
		this.tel = "02-1234-1234";
		
	}
	
	public This(String name) {
		// TODO Auto-generated constructor stub
		
		this();	//현재 객체의 생성자
		
		this.name = name;
		
	}
	
	public This(String name,String jumin) {
		// TODO Auto-generated constructor stub
		
		this(name);	//현재 객체의 생성자
		
		this.jumin = jumin;
		
	}
	
	public This(String name,String jumin,String tel) {
		// TODO Auto-generated constructor stub
		
		this(name,jumin);	//현재 객체의 생성자
		
		this.tel = tel;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "This [name=" + name + ", jumin=" + jumin + ", tel=" + tel + "]";
	}

	
	
	
}
public class ThisEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This th = new This("test","1234");
		System.out.println(th.toString());
	}

}
