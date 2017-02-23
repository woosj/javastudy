package javaDay09;

class Time {
	private int hour;	//시간 0 ~23
	private int minute;	//0 ~ 59
	private int second;	//0 ~ 59
	
	//첫번째 생성자
	public Time() {
		this(0,0,0);
	}
	
	//두번째 생성자
	public Time(int h, int m, int s) {
		setTime(h,m,s);
	}
	
	//올바르지 않은 시간 설정
	
	//시간 설정 함수
	public void setTime(int h, int m, int s) {
		hour = ( (h >= 0 && h < 24) ? h:0 );	//시간 검증
		minute = ( (m >= 0 && m < 60) ? m:0 );	//분 검증
		second = ( (s >= 0 && s < 60) ? s:0 );	//초 검증
	}
	
	@Override
	public String toString() {
		return String.format("%2d:%2d:%2d", hour,minute,second);
	}
	
}



public class TimeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Time 객페를 생성하고 초기화한다
		Time ti = new Time();
		System.out.println(ti);
		
		Time t2 = new Time(12,5,30);
		System.out.println(t2);
		
		Time t3 = new Time(12,5,99);
		System.out.println(t3);

	}

}
