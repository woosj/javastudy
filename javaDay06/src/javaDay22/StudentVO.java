package javaDay22;

public class StudentVO {
	
	private String hak_name;
	private int[] score = new int[3];
	private int total;
	private int avg;
	private String grade;
	
	
	public String getHak_name() {
		return hak_name;
	}
	public void setHak_name(String hak_name) {
		this.hak_name = hak_name;
	}
	public int[] getScore() {
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
	
}
