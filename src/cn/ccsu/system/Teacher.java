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
		System.out.println("����������Ҫ�޸ĵ����룺");
		String oldPwd = in.next();
		System.out.println("���ٴ��������������롰��");
		String newPwd = in.next();
		if(oldPwd.equals(newPwd)) {
			setPwd(newPwd);
		}else {
			System.out.println("�޸�ʧ�ܣ�������������벻��ͬ������");
		}
	}
	
	public void quaryDepartmentGrade(Subject subject, String department) {//��ѯϵ���ɼ�
		
	}
	
	public void quaryStudentGrade(Subject subject, String account) {//��ѯѧ���ɼ�
		
	}
	
	public void quaryGrade(Subject subject) {//��ѯѧ�Ƴɼ�
		
	}
	
	public void changeGrade(Subject subject, String account, float grade) {//�޸ĳɼ�
		
	}
}
