package Ch06static;

public class Student2 {
	private static int serialNum = 1000;
	int studentId;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentId = serialNum;
	}
	
	public String getStudetnName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	} //serialNum의 get()메서드
	
	public static void setserialNum(int serialNum) {
		Student2.serialNum = serialNum;
	} //serialNum의 set()메서드

}
