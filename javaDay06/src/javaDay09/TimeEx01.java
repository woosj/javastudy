package javaDay09;

class Time {
	private int hour;	//�ð� 0 ~23
	private int minute;	//0 ~ 59
	private int second;	//0 ~ 59
	
	//ù��° ������
	public Time() {
		this(0,0,0);
	}
	
	//�ι�° ������
	public Time(int h, int m, int s) {
		setTime(h,m,s);
	}
	
	//�ùٸ��� ���� �ð� ����
	
	//�ð� ���� �Լ�
	public void setTime(int h, int m, int s) {
		hour = ( (h >= 0 && h < 24) ? h:0 );	//�ð� ����
		minute = ( (m >= 0 && m < 60) ? m:0 );	//�� ����
		second = ( (s >= 0 && s < 60) ? s:0 );	//�� ����
	}
	
	@Override
	public String toString() {
		return String.format("%2d:%2d:%2d", hour,minute,second);
	}
	
}



public class TimeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Time ���並 �����ϰ� �ʱ�ȭ�Ѵ�
		Time ti = new Time();
		System.out.println(ti);
		
		Time t2 = new Time(12,5,30);
		System.out.println(t2);
		
		Time t3 = new Time(12,5,99);
		System.out.println(t3);

	}

}
