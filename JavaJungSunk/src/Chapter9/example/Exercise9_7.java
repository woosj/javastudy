package Chapter9.example;

/*
[9-7] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
�޼���� : contains
�� �� : ù ��° ���ڿ�(src)�� �� ��° ���ڿ�(target)�� ���ԵǾ� �ִ��� Ȯ���Ѵ�.
���ԵǾ� ������ true, �׷��� ������ false�� ��ȯ�Ѵ�.
��ȯŸ�� : boolean
�Ű����� : String src
String target
[Hint] StringŬ������ indexOf()�� ����� ��

[������]
true
false

*/

public class Exercise9_7 {

	/*
	 * (1) contains�޼��带 �ۼ��Ͻÿ�.
	 */
	public static boolean contains(String src, String target){
		return src.contains(target);
	}
	
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}
}
