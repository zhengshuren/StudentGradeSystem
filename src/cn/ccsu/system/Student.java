package cn.ccsu.system;

import java.util.Scanner;

public class Student implements User{
	private String name;
	private String account;
	private String pwd;
	private String Idcard;
	private int age;
	private String department;
	private String sex;
	private String Sclass;
	private Subject[] subject;
	
	public Student(String name, String account, String pwd) {
		super();
		this.name = name;
		this.account = account;
		this.pwd = pwd;
	}

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSclass() {
		return Sclass;
	}

	public void setSclass(String sclass) {
		Sclass = sclass;
	}

	public Subject[] getSubject() {
		return subject;
	}

	public void setSubject(Subject[] subject) {
		this.subject = subject;
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
	
	public void rank() {//�ɼ�������
		
	}
	
	public void selectSubject() {//ѡ��
		
	}
	
	public void quarySuject() {//��ѯ�α�
		
	}
	public void quaryGrade(Subject subject) {//��ѯ��ѧ�Ƴɼ�
		
	}
}
