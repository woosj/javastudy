package javaDay22;

import java.util.*;

class SungRec {
	private String name;
	private int tot;
	private int mat;
	private int kor;
	private int eng;
	
	public SungRec() {
		// TODO Auto-generated constructor stub
	}
	
	public SungRec(String name,int kor, int eng, int mat) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
}


public class TreeMapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, SungRec> map = new TreeMap<String, SungRec>();
		
		map.put("3333", new SungRec("È«±æµ¿",10,20,30) );
		map.put("4444", new SungRec("È«±æµ¿",20,30,30) );
		map.put("1111", new SungRec("È«±æµ¿",50,80,30) );
		map.put("2222", new SungRec("È«±æµ¿",50,60,30) );
		map.put("5555", new SungRec("È«±æµ¿",10,90,30) );
		
		//Å° ¼ø¼­´ë·Î Á¤¸¯
		String key;
		Set set = map.keySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			key = (String)it.next();
			SungRec data = map.get(key);
			System.out.printf("%7s %10s %4d %4d %4d %d\n",key, data.getName(), data.getKor(), data.getEng(), data.getMat(), data.getTot());
		}
	}

}
