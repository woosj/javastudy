package javaDay22;

import java.io.IOException;

public class Sung2Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char ch;
		
		Sung2 ss = new SungImpl2();
		
		System.out.println("성적 처리");
		while(true){
			do{
				
				System.out.print("\n 1.입력 2.수정 3.이름검색 4.삭제 5.전체 출력 6.합게순 전체출력 7.종료");
				System.out.print("\n 메뉴 선택 :");
				
				ch = (char)System.in.read();
				System.in.skip(2);
				
			}while(ch < '1' || ch > '7');
			
			switch(ch){
				case '1': ss.insert();break;
				case '2': ss.update();break;
				case '3': ss.search();break;
				case '4': ss.delete();break;
				case '5': ss.writeAll();break;
				case '6': ss.writeSort();break;
				case '7': System.exit(0);break;
			}
		}
		
	}

}
