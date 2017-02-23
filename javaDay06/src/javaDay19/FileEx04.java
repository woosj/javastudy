package javaDay19;

import java.io.File;

public class FileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//파일명과 경로 설정
		String filename = "fileio.txt";
		String filepath = "l:/files";
		
		//파일 혹은 폴더 이름 변경
		File src = new File(filepath+"/" +filename);	//원본파일
		File des = new File(filepath + "/dest.txt");	//
		File des2 = new File(filepath);	//
		
		if(src.exists()){
			src.renameTo(des);
			src.renameTo(des2);
		}
		
		//폴더목록의 출력
		if(des2.exists()){
			String dir[] = des2.list();
			for(String sss : dir){
				System.out.println("dir : " + sss);
			}
		}
		
	}

}
