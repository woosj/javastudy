package javaDay22;

import java.io.IOException;

public interface Sung2 {
	
	//�߰�
	public int insert() throws IOException;
	//����
	public int update() throws IOException;
	//�˻�
	public void search() throws IOException;
	//����
	public int delete() throws IOException;
	//��ü ���(�й���)
	public void writeAll();
	//��ü���(����)
	public void writeSort();
	
}
