package Ch15stream;

import java.io.IOException;

//문자 여러 개를 입력받기
public class SystemInTest2 {
	public static void main(String[] args) {
		System.out.println("알파벳을 여러 개 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			while((i = System.in.read()) != -1) {
				System.out.println((char)i);
			} //while문에서 read() 메서드로 한 바이트를 반복해 읽음
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
