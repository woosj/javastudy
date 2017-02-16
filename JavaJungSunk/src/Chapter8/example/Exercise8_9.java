package Chapter8.example;

/*
[8-9] ������ ���� ������ ����Ŭ������ �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
[����] �����ڴ� �������� ���� �˸°� �ۼ��ؾ��Ѵ�.
* Ŭ������ : UnsupportedFuctionException
* ����Ŭ������ : RuntimeException
* ������� :
�� �� : ERR_CODE
���尪 : �����ڵ�
Ÿ �� : int
�⺻�� : 100
������ : final private
* �޼��� :
1. �޼���� : getErrorCode
�� �� : �����ڵ�(ERR_CODE)�� ��ȯ�Ѵ�.
��ȯŸ�� : int
�Ű����� : ����
������ : public
2. �޼���� : getMessage
�� �� : �޼����� ������ ��ȯ�Ѵ�.(ExceptionŬ������ getMessage()�� �������̵�)
��ȯŸ�� : String
�Ű����� : ����
������ : public

[������]
Exception in thread "main" UnsupportedFuctionException: [100]�������� �ʴ� ���
�Դϴ�.
at Exercise8_9.main(Exercise8_9.java:5)

*/
class UnsupportedFuctionException extends RuntimeException {
	private final int ERR_CODE;
	
	public UnsupportedFuctionException(String msg, int num) {
		// TODO Auto-generated constructor stub
		super(msg);
		ERR_CODE = num;
	}
	
	public UnsupportedFuctionException(String msg) { // ������
		this(msg, 100); // ERR_CODE�� 100(�⺻��)���� �ʱ�ȭ�Ѵ�.
	}
	
	public int getErrorCode(){
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "[" + getErrorCode() +"]" + super.getMessage();
	}
}

public class Exercise8_9 {
	public static void main(String[] args) throws Exception {
		throw new UnsupportedFuctionException("�������� �ʴ� ����Դϴ�.", 100);
	}
}
