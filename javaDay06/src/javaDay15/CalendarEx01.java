package javaDay15;

import java.util.Calendar;
import static java.lang.System.out;

public class CalendarEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("년중");
		Calendar now = Calendar.getInstance();
		
		int week_yy = now.get(now.WEEK_OF_YEAR);
		int yy = now.get(now.YEAR);
		int mm = now.get(now.MONTH)+1;	//1월이 0을 기억하기 때문에 1을 더함
		int dd = now.get(now.DAY_OF_MONTH);
		
		sb.append(week_yy);
		sb.append("주째인");
		sb.append(yy);
		sb.append("년");
		sb.append(mm);
		sb.append("월");
		sb.append(dd);
		sb.append("일");
		
		System.out.println(sb.toString());
	}

}
