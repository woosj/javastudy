package Chapter9.example;

/*
[9-6] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
�޼���� : fillZero
�� �� : �־��� ���ڿ�(����)�� �־��� ������ ���ڿ��� �����, ���� �� ������ '0'���� ä���.
���� �־��� ���ڿ��� null�̰ų� ���ڿ��� ���̰� length�� ���� ������ �״�� ��ȯ�Ѵ�.
���� �־��� length�� ���� 0���� ���ų� ���� ���̸�, �� ���ڿ�("")�� ��ȯ�Ѵ�.
��ȯŸ�� : String
�Ű����� : String src - ��ȯ�� ���ڿ�
int length - ��ȯ�� ���ڿ��� ����

[������]
0000012345
123


*/

public class Exercise9_6 {

	public static String fillZero(String src, int length) {
		/*
		 * (1) fillZero�޼��带 �ۼ��Ͻÿ�. 
		 * 1. src�� ���̰ų� src.length()�� length�� ������ src�� �״�� ��ȯ�Ѵ�. 
		 * 2. length�� ���� 0���� ���ų� ������ �� ���ڿ�("")�� ��ȯ�Ѵ�. 
		 * 3. src�� ���̰� length�� ������ ũ�� src�� length��ŭ �߶� ��ȯ�Ѵ�. 
		 * 4. ���̰� length�� char�迭�� �����Ѵ�.
		 * 5. 4���� ������ char�迭�� '0'���� ä���. 
		 * 6. src���� ���ڹ迭�� �̾Ƴ��� 4���� ������ �迭�� �����Ѵ�.
		 * 7. 4���� ������ �迭�� String�� �����ؼ� ��ȯ�Ѵ�.
		 */
		String result = "";
		
		if(src.length() == length || src == null){
			result = src;
		}else if(length <= 0){
			result = "";
		}else if(length < src.length()){
			result = src.substring(0,length);
		}else{
			char[] chArr = new char[length];
			for(int i = 0; i < length; i++){
				chArr[i] = '0';
			}
				
			// 6. src���� ���ڹ迭�� �̾Ƴ��� 4���� ������ �迭�� �����Ѵ�.
			System.arraycopy(src.toCharArray(),0,chArr,length-src.length(),src.length());
			// 7. 4���� ������ �迭�� String�� �����ؼ� ��ȯ�Ѵ�.
			result = new String(chArr);
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
	}
}