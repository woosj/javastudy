package Chapter9.example;

/*
[9-9] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
�޼���� : delChar
�� �� : �־��� ���ڿ����� ������ ���ڵ��� �����Ͽ� ��ȯ�Ѵ�.
��ȯŸ�� : String
�Ű����� : String src - ��ȯ�� ���ڿ�
String delCh - ������ ���ڵ�� ������ ���ڿ�
[��Ʈ] StringBuffer�� StringŬ������ charAt(int i)�� indexOf(int ch)�� ����϶�.
(1!2@3^4~5) -> 12345
(1 2 3 4 5) -> (12345)

*/
public class Exercise9_9 {

	/*
	 * (1) delChar�޼��带 �ۼ��Ͻÿ�.
	 */
	public static String delChar(String src, String delCh){
		
		for( int i = 0; i < delCh.length(); i++){
			src = src.replace(delCh.charAt(i),' ');
			
		}
		src = src.replaceAll(" ", "");
		return src; 
	}
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}