package Ch06static;

public class Student1 {
	public static int serialnum = 1000;
	public int studentID;
	public String studentname;
	public int grade;
	public String address;
	
	public Student1() {
		serialnum++; 			//학생이 생성될 때마다 증가
		studentID = serialnum;	//증가된 값을 학번 인스턴스 변수에 부여
		
	}
	
	public String getStudentName() {
		return studentname;
	}
	
	public void setStudentName(String name) {
		studentname = name;
	}

}
