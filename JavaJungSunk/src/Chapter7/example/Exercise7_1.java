package Chapter7.example;

/*
 [7-1] ����ī�� 20���� �����ϴ� ����ī�� �� ��(SutdaDeckŬ����)�� ������ ���̴�. 
 ����ī�� 20���� ��� SutdaCard�迭�� �ʱ�ȭ�Ͻÿ�. ��, ����ī��� 1���� 10������ ���ڰ� 
 ���� ī�尡 �� �־� �ְ�, ���ڰ� 1, 3, 8�� ��쿡�� �� ���� �� ���� ��(Kwang)�̾�� �Ѵ�. 
 ��, SutdaCard�� �ν��Ͻ����� isKwang�� ���� true�̾�� �Ѵ�.
*/


public class Exercise7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaDeck deck = new SutdaDeck();
		
		for(int i = 0; i < deck.cards.length; i++){
			System.out.print(deck.cards[i]+",");
		}
	}

}
