package javaDay09;
//��¥�� ��Ÿ���� DateŬ������ ���Ͽ� �����ڸ� �ߺ������Ͽ� ����
import java.util.*;

class Date {
	private int year;
	private String month;
	private int day;
	
	public Date() {
		// TODO Auto-generated constructor stub
		month = "1��";
		day = 1;
		year = 2017;
	}
	
	public Date(int year) {
		// TODO Auto-generated constructor stub
		this();
		this.year = year;
	}
	
	//�ѹ��� set �ϴ� ���
	public Date(int year, String month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//�ѹ��� set �ϴ� ���
	public void setDate(int year, String month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}	
	
	
	
}
public class DateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		Date d2 = new Date(2017,"1��",1);
		Date d3 = new Date(2017);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
	}

}
