package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/*
 * 날짜 : 2022/09/14
 * 이름 : 홍민준
 * 내용 : 프로퍼티 실습하기
 * 
 */
public class PropertiesTest {
	
	public static void main(String[] args) {
		
		// 프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		String path = "C:\\Users\\java1\\Desktop\\Fruit.properties";
		
		//프로퍼티 파일 생성
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null); //파일 쓰기
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로퍼티 파일 생성 완료");
		
		//프로퍼티 객체 생성
		String target = "C:\\Users\\java1\\Desktop\\ties.properties";
		Properties propcities = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(target);
			propcities.load(fis); //파일 읽기
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(propcities);
		System.out.println(propcities.getProperty("kor"));
		System.out.println(propcities.getProperty("usa"));
		
		System.out.println("프로퍼티 객체 생성 완료");
		
		
		
	}

}
