package javaDay22;

import java.io.IOException;

public interface Sung2 {
	
	//추가
	public int insert() throws IOException;
	//수정
	public int update() throws IOException;
	//검색
	public void search() throws IOException;
	//삭제
	public int delete() throws IOException;
	//전체 출력(학번순)
	public void writeAll();
	//전체출력(정렬)
	public void writeSort();
	
}
