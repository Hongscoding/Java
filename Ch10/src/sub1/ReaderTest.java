package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜 : 2022/09/13
 * 이름 : 홍민준
 * 내용 : 문자 스트림 실습하기
 * 
 */
public class ReaderTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Semple1.txt";
		
		try {
			// 파일과 스트림 연결
			FileReader fr = new FileReader(path);

			while(true) {
				
				int value = fr.read();
				
				if(value == -1) {
					// 파일을 모두 읽었으면 
					break;
				}
				
				char c = (char)value;
				System.out.print(c);
				
			
			
			
			}
			// 스트림 해제
			fr.close();
			
			System.out.println("쓰기 완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
