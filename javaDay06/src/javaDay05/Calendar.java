package javaDay05;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int year = 2016;
		int month = 1;
		int lastDay = 31 , firstDay = 1 , totalDay = 365;
		int total =0 ;
		
		do{
			System.out.print("년도를 입력 : ");
			year = sc.nextInt();
		}while(year < 1);
		
		
		do{
			System.out.print("월을 입력 : ");
			month = sc.nextInt();
		}while(month < 1 || month > 12);
		
		
		
		
		int n;
		//입력한 월의 요일수를 구한다.
		if( month == 4 || month == 6 || month == 9 || month == 11 ){
			lastDay = 30;
		}
		
		if(month == 2){
			if(year%4==0 && (!(year%100==0) && !(year%400==0))){
				lastDay = 29;
			}else{
				lastDay = 28;
			}
		}
		
		for(int i =1; i <= month; i++){
			n = 31;
			
			if( i == 4 || i == 6 || i == 9 || i == 11 ){
				n = 30;
			}
			
			if(i == 2){
				if( year%4==0 && (year%100 !=0 || year%400==0) ){
					n = 29;
				}else{
					n = 28;
				}
			}
			
			total += n;

		}
		
		/*
		 * 	(lastyear+(lastyear/4)-(lastyear/100)+(lastyear/400)+1)%7;
	    	lastyear : 1년은 365일, 1년이 지날때마다 요일이 한번 늘어난다 (365를 7로 나누면 1이기 때문)
	    	+(lastyear/4)-(lastyear/100)+(lastyear/400) : 윤년의 다음연도는 요일이 두번 늘어므로, lastyear까지 있던 모든 윤년을 더한다
	    	+1 : 1년 1월 1일은 일요일이 아니라 월요일이므로 1을 더한다 (0년은 없다)
	    	%7 : 요일은 7가지 이므로, 앞의 계산값을 7로 나눈 나머지가 year년 1월의 첫요일 뜻한다
	    	나머지값에 따라 0:일요일, 1:월요일, 2:화요일, 3:수요일, 4:목요일, 5:금요일, 6:토요일
	    */
		year--;
		//총 날짜를 구한다.
		totalDay = ( (year*365) + (year-1/4) -(year-1/100) + (year-1/400) + 1 ) % 7;
		
		int week = 0;
		week = (totalDay + total)  % 7;//total % 7;
		System.out.println(week);
		
		System.out.println(year + "년" + month + "월");
		
		System.out.println("\t일\t월\t화\t수\t목\t금\t토");
		for(int i = 0; i < 14; i++){
			System.out.print("====");
		}
		
		System.out.println();
		for(int i=-week;i<lastDay;i++)
	    {
	        if((i+week)%7 == 0) // 출력될 차례가 일요일이면, 개행
	        	System.out.print("\n");
	        if(i<0) // month월 1일이 출력되기 이전의 날짜는 공백으로 채움
	        	System.out.print("    ");
	        else // 날짜 출력
	        	System.out.printf("%4d",i+1);
	    }
		
		for(int i = 0; i < week; i++){
			System.out.print("	");
		}
		
		for(int i = 1; i <= lastDay; i++){
			System.out.printf("\t%d",i);
			if(++week%7 == 0){
				System.out.println();
			}
		}
		
		if(week%7 != 0){
			System.out.println();
		}

		System.out.println("====================================");
		
		
	}

}
