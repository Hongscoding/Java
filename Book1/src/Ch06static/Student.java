package Ch06static;

public class Student {
	public static int serialnum = 1000; // static 변수는 인스턴스 생성과 상관 없이 먼저 생성됨
	public int studentID;
	public String studentname;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentname;
	}
	
	public void setStudentName(String name) {
		studentname = name;
	}

}
