package Chapter7.example;

/*
	[7-2] ����7-1�� SutdaDeckŬ������ ������ ���ǵ� ���ο� �޼��带 �߰��ϰ� �׽�Ʈ �Ͻÿ�.
	[����] Math.random()�� ����ϴ� ��� �������� �ٸ� �� ����.
	1. �޼���� : shuffle
	�� �� : �迭 cards�� ��� ī���� ��ġ�� �ڼ��´�.(Math.random()���)
	��ȯŸ�� : ����
	�Ű����� : ����
	2. �޼���� : pick
	�� �� : �迭 cards���� ������ ��ġ�� SutdaCard�� ��ȯ�Ѵ�.
	��ȯŸ�� : SutdaCard
	�Ű����� : int index - ��ġ
	3. �޼���� : pick
	�� �� : �迭 cards���� ������ ��ġ�� SutdaCard�� ��ȯ�Ѵ�.(Math.random()���)
	��ȯŸ�� : SutdaCard
	�Ű����� : ����
*/

public class Exercise7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
