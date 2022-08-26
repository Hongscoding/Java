package Ch06static;

public class StudentTest2 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialnum);
		System.out.println(studentLee.studentname+" 학번:"+studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialnum);;
		System.out.println(studentSon.studentname+" 학번:"+studentSon.studentID);
	}

}
