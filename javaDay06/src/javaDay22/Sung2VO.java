package javaDay22;

public class Sung2VO {
	
	private String hak;
	private String name;
	private int kor, eng, mat;
	private int tot;
	
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return kor + eng + mat;
	}
	
	@Override
	public String toString() {
		return "SungVO [hak=" + hak + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot="
				+ getTot() + ", avg=" + getTot()/3 + "]";
	}
	
	
	
}
