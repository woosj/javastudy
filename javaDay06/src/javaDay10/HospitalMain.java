package javaDay10;

class Animal {
	/*
	 * ������ ������ �ִ� ���� ����
	 * �̸� , �Ҹ�
	 */
	
	public String scream(){
		return "���� �����Ҹ�";
	}
	
	public String getName(){
		return null;
	}
	
}

//������, �����, ȣ����
class Dog extends Animal {
	
	private String name;
	
	
	
	
	public Dog() {
		// TODO Auto-generated constructor stub
		name = getClass().getSimpleName();
	}
	
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "�۸۸�";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Cat extends Animal {
	
	private String name;
	
	public Cat() {
		// TODO Auto-generated constructor stub
		name = getClass().getSimpleName();
	}
	
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "�߿˾߿�";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Tiger extends Animal {
	
	private String name;
	
	public Tiger() {
		// TODO Auto-generated constructor stub
		name = getClass().getSimpleName();
	}

	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "�������";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Hospital{
	
	public void inject(Animal animal){

		System.out.println(animal.getName()+"��(��) ġ���ϱ� ���� �ֻ縦 �����ϴ�.");
		System.out.println(animal.scream());
	}
}
public class HospitalMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hospital h = new Hospital();
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal Tiger = new Tiger();
		
		Animal test = new Animal();
		
		h.inject(dog);
		h.inject(cat);
		h.inject(Tiger);
		
		h.inject(test);
		
	}

}
