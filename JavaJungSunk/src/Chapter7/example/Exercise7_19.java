package Chapter7.example;

/*
[7-19] ������ ������ �����ϴ� ����� ������ BuyerŬ�����̴�. �� Ŭ������ �������
�� ��(money)�� ��ٱ���(cart)�� ������ �ִ�. ��ǰ�� �����ϴ� ����� buy�޼���� ��
�ٱ��Ͽ� ������ ������ �߰��ϴ� add�޼���, ������ ������ ��ϰ� ���ݾ�, �׸��� ��
�� �ݾ��� ����ϴ� summary�޼��带 �ϼ��Ͻÿ�.

	1. �޼���� : buy
	�� �� : ������ ������ �����Ѵ�. ���� ��(money)���� ������ ������ ����,
	��ٱ���(cart)�� ��´�.
	���� ���� ���� ������ ���ݺ��� ���ٸ� �ٷ� �����Ѵ�.
	��ȯŸ�� : ����
	�Ű����� : Product p - ������ ����
	
	2. �޼���� : add
	�� �� : ������ ������ ��ٱ��Ͽ� ��´�.
	���� ��ٱ��Ͽ� ���� ������ ������, ��ٱ����� ũ�⸦ 2��� �ø� ������ ��´�.
	��ȯŸ�� : ����
	�Ű����� : Product p - ������ ����
	
	3. �޼���� : summary
	�� �� : ������ ������ ��ϰ� ���ݾ�, ���� �ݾ��� ����Ѵ�.
	��ȯŸ�� : ����
	�Ű����� : ����

[������]
�ܾ��� �����Ͽ� Computer��/�� ��� �����ϴ�.
������ ����:Tv,Computer,Tv,Audio,Computer,Computer,
����� �ݾ�:850
���� �ݾ�:150

*/
public class Exercise7_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();

	}

}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product�迭 cart�� ���� index

	void buy(Product p) {
		/*
		 * (1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. 1.1 ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ�.
		 * 1.2 ���� ���� ����ϸ�, ��ǰ�� ������ ���� ������ ���� 1.3 ��ٱ��Ͽ� ������ ������ ��´�.(add�޼��� ȣ��)
		 */
		if(money < p.price){
			return;
		}else{
			money -= p.price;
			add(p);
		}
	}

	void add(Product p) {
		/*
		 * (2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. 
		 * 1.1 i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ�� 
		 * 1.1.1 ������ ��ٱ��Ϻ��� 2�� ū ���ο� �迭�� �����Ѵ�. 
		 * 1.1.2 ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�. 1.1.3 ���ο�
		 * ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�. 
		 * 1.2 ������ ��ٱ���(cart)�� �����Ѵ�. �׸��� i�� ���� 1 ������Ų��.
		 */
		
		if( i >= cart.length ){
			//���ο� ũ���� ��ٱ��� ����
			Product[] cart_temp  = new Product[cart.length*2];
			
			/*clone �޼ҵ带 ����� �迭 ����*/
			//cart_temp = cart.clone();
			/*arraycopy() �޼ҵ带 ����� �迭 ����*/
			System.arraycopy(cart, 0, cart_temp, 0, cart.length);
			cart = cart_temp;
			
		}
		cart[i] = p;
		
		i++;
		
	} // add(Product p)

	void summary() {
		/*
		 * (3) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. 1.1 ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�. 1.2 ��ٱ��Ͽ�
		 * ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�. 1.3 ������ ��� ���� �ݾ�(money)�� ����Ѵ�.
		 */
		int total = 0;
		
		for( int cnt = 0; cnt < i; cnt++){
			System.out.println( (cnt+1) + " ��ǰ�� : " + cart[cnt].toString() + ", ���� : " + cart[cnt].price);
			total += cart[cnt].price;
			
		}
		
		System.out.println("�հ�" + total);
		System.out.println("���� ����" + money);
		
	} // summary()
}

class Product {
	int price; // ��ǰ�� ����

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}