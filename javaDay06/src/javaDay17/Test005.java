package javaDay17;

/*
 * 사용자가 로또 복권을 구매하고 그에 따른 당첨번호를 출력하는 프로그램을 작성하시오.
 * 단 , 로또 구매수 입력받고 클래스를 분할 하여 프로그램을 완성하시오.
 * 
 */
public class Test005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체생성
		Lotto lo = new Lotto();
		
		Lotto1 lo1 = new Lotto1();
		
		//로또 구매수 입력
		lo.lottoBuyCnt();
		//번호 생성
		lo.lottoNumCreate();
		
		lo1.input();
		
		
	}

}
