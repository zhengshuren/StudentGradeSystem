package cn.ccsu.system;

public class Sysem {
	public static void main(String[] args) {
		Student s = new Student("zzz", "b123", "123");
		s.ChangeCode();
		System.out.println(s.getPwd());
	}
}
