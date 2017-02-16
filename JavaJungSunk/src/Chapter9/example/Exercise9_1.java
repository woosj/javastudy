package Chapter9.example;

/*
[9-1] ������ ���� �������� �򵵷� SutdaCardŬ������ equals()�� ��������� num,
isKwang�� ���� ���ϵ��� �������̵��ϰ� �׽�Ʈ �Ͻÿ�.

[������]
c1=3K
c2=3K
c1.equals(c2):true
*/
public class Exercise9_1 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c1.equals(c2):" + c1.equals(c2));
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public boolean equals(Object obj) {
		/*
		 * (1) �Ű������� �Ѱ��� ��ü�� num, isKwang�� ������� num, isKwang�� ���ϵ��� �������̵� �Ͻÿ�.
		 */
		boolean result = false;
		
		if(obj instanceof SutdaCard){
			SutdaCard temp = (SutdaCard)obj;
			
			if(this.num == temp.num && this.isKwang == temp.isKwang){
				result = true;
			}
		}
		
		return result;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}