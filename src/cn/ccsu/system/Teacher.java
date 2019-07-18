package cn.ccsu.system;

import java.util.Date;
import java.util.Scanner;

public class Teacher implements User {
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

	@Override
	public void ChangeCode() {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入您需要修改的密码：");
		String oldPwd = in.next();
		System.out.println("请再次输入您的新密码“：");
		String newPwd = in.next();
		if(oldPwd.equals(newPwd)) {
			setPwd(newPwd);
		}else {
			System.out.println("修改失败，两次输入的密码不相同！！！");
		}
	}
	
	public void quaryDepartmentGrade(Subject subject, String department) {//查询系部成绩
		
	}
	
	public void quaryStudentGrade(Subject subject, String account) {//查询学生成绩
		
	}
	
	public void quaryGrade(Subject subject) {//查询学科成绩
		
	}
	
	public void changeGrade(Subject subject, String account, float grade) {//修改成绩
		
	}
}
