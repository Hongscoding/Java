package Ch14exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//throws로 예외 미루기
public class ThrowsException {
	public Class loadClass(String fileName, String className) throws
	FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException 발생 가능
		Class c = Class.forName(className); //ClassNotFoundException 발생 가능
		return c;
		
		
	}
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} //Exception 클래스로 그 외 예외 상황 처리
		
	}

}
