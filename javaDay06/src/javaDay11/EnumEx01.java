package javaDay11;

public class EnumEx01 {
	
	public enum Lesson {
		java,jsp,servlet,oracle,test
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lesson le = Lesson.java;
		
		System.out.println(le);
	}

}
