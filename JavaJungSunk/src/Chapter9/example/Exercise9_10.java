package Chapter9.example;

/*
[9-10] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
�޼���� : format
�� �� : �־��� ���ڿ��� ������ ũ���� ���ڿ��� ��ȯ�Ѵ�. ������ ������ �������� ä���.
��ȯŸ�� : String
�Ű����� : String str - ��ȯ�� ���ڿ�
int length - ��ȯ�� ���ڿ��� ����
int alignment - ��ȯ�� ���ڿ��� ��������
(0:���� ����, 1: ��� ����, 2:������ ����)

[������]
������
  ������
    ������

*/
public class Exercise9_10 {

	/*
	 * (1) format�޼��带 �ۼ��Ͻÿ�. 
	 * 1. length�� ���� str�� ���̺��� ������ length��ŭ�� �߶� ��ȯ�Ѵ�. 
	 * 2. 1�� ��찡 �ƴϸ�, lengthũ���� char�迭�� �����ϰ� �������� ä���. 
	 * 3. ��������(alignment)�� ���� ���� ���ڿ�(str)�� ������ ��ġ�� �����Ѵ�. (System.arraycopy()���) 
	 * 4. 2���� ������ char�迭�� ���ڿ��� ���� ��ȯ�Ѵ�.
	 */
	static String format(String str, int length, int alignment){
		
		String result = "";
		
		if(length < str.length()){
			result = str.substring(0, length);
		}else{
			char[] chArr = new char[length];
			//��������� �ʱ�ȭ
			for(int i = 0; i < chArr.length; i++){
				chArr[i] = ' ';
			}
			
			
			if(alignment == 0){
				//��������
				System.arraycopy(str.toCharArray(),0,chArr,0,str.length());
				
			}else if(alignment == 1){
				//��� ����
				System.arraycopy(str.toCharArray(),0,chArr,( length-str.length() )/2,str.length());
				
			}else if(alignment == 2){
				//������ ����
				System.arraycopy(str.toCharArray(),0,chArr,length-str.length(),str.length());
				
			}
			
			result = new String(chArr);
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		String str = "������";
		System.out.println(format(str, 7, 0)); // ���� ����
		System.out.println(format(str, 7, 1)); // ��� ����
		System.out.println(format(str, 7, 2)); // ������ ����
	}
}