package cn.ccsu.system;

import java.util.Date;

public class Mannege extends Teacher{
	private String name;
	private String account;
	private String pwd;
	private String Idcard;
	private int age;
	private String sex;
	private Subject[] subject;
	private Date comeDate;
	private float salary;
	private String pistion;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getIdcard() {
		return Idcard;
	}

	public void setIdcard(String idcard) {
		Idcard = idcard;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Subject[] getSubject() {
		return subject;
	}

	public void setSubject(Subject[] subject) {
		this.subject = subject;
	}

	public Date getComeDate() {
		return comeDate;
	}

	public void setComeDate(Date comeDate) {
		this.comeDate = comeDate;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getPistion() {
		return pistion;
	}

	public void setPistion(String pistion) {
		this.pistion = pistion;
	}
	
	public void changeInfo(Object obj) {//修改信息
		
	}
	
	public void changeSubjectInfo(Subject subject) {//修改课程信息
		
	}
}
