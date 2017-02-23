package javaDay19;

import java.io.File;
import java.io.IOException;

public class FileEx03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//파일 경로
		String filepath = "l:/files";
		String filename = "fileio.txt";
		//1.파일 생성
		File f1 = new File(filepath+"/"+filename);
		
		if(f1.exists()){
			System.out.println("파일이름 : " + f1.getName());
		}else{
			//파일이 존재하지 않을 경우 새파일을 만든다.
			if(f1.createNewFile()){
				System.out.println("새로운 파일을 생성했습니다.");
			}
		}
		
		//2.폴더 생성
		File f2 = new File(filepath+"/test");
		if(!f2.exists()){
			f2.mkdirs();
		}else{
			System.out.println("폴더 이름 : " + f2.getPath() );
		}
		
		//3.파일 혹은 폴더 삭제
		File f3 = new File(filepath+"/test");
		if(f3.exists()){
			f3.delete();
		}

	}

}
