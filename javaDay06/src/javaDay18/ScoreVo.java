package javaDay18;

public class ScoreVo {
	
	//�̸�, �й�, �������, ����, ����, ����, �հ�
	private String hak, name, birth;
	private int kor, eng, mat, tot;
	
	public ScoreVo() {
		// TODO Auto-generated constructor stub
	}

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

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
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
		tot = kor + eng + mat;
		return tot;
	}

	@Override
	public String toString() {
		
		return "ScoreVo [hak=" + hak + ", name=" + name + ", birth=" + birth + ", kor=" + kor + ", eng=" + eng
				+ ", mat=" + mat + ", tot=" + getTot() + ", avg=" + (float)getTot()/3 + "]";
	}
	
	

}
