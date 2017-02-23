package javaDay11;

class OuterEx {
	class InnerEx {
		int x = 5;
	}
}
public class InnerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterEx eo = new OuterEx();
		OuterEx.InnerEx ei = eo.new InnerEx();
		System.out.println(ei.x);
	}

}
