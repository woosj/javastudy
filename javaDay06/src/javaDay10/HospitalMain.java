package javaDay10;

class Animal {
	/*
	 * 동물이 가지고 있는 공통 성분
	 * 이름 , 소리
	 */
	
	public String scream(){
		return "동물 울음소리";
	}
	
	public String getName(){
		return null;
	}
	
}

//강아지, 고양이, 호랑이
class Dog extends Animal {
	
	private String name;
	
	
	
	
	public Dog() {
		// TODO Auto-generated constructor stub
		name = getClass().getSimpleName();
	}
	
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "멍멍멍";
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
		return "야옹야옹";
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
		return "어흥어흥";
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

		System.out.println(animal.getName()+"을(를) 치료하기 위해 주사를 놓습니다.");
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
