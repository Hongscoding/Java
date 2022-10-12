package Ch15stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//InputStreamReader 사용하기
public class InputStreamReaderTest {
	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while((i = isr.read()) != -1) { //파일의 끝인 -1이 반환될때까지 보조 스트림으로 자료를 읽음
				System.out.println();
			} 
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
