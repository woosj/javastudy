package javaDay19;

import java.io.File;

public class FileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dire = new File("l:/files");
		
		if(dire.exists()){
			if(dire.isDirectory()){
				//현재 폴더내의 모드 파일, 폴더 이름 얻기
				String[] fnameList = dire.list();
				
				for(String ss : fnameList){
					System.out.println("파일이름 : " + ss);
				}
			}
		}
	}

}
