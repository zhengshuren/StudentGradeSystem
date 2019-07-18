package cn.ccsu.system;

public class Subject {
	private String name;
	private String num;
	private String teacher;
	private float grade;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	
	public void GradeRank() {
		
		System.out.println("学号\t\t" + "姓名\t\t" + "班级\t\t" + "成绩\t\t");
		
		
	}
	
	public float GradeRank(String name) {
		
		System.out.println("学号\t\t" + "姓名\t\t" + "班级\t\t" + "成绩\t\t");
		return grade;
		
	}
}
