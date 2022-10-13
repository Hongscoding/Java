package Ch13lambda;

//매개변수로 전달하는 람다식

interface PrintString{
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		
		//람다식을 인터페이스형 변수에 대입하고 그 변수를 사용해 람다식 구현부 호출
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello_lambda_1");
		//메소드의 매개변수로 람다식을 대입한 변수 전달
		showMyString(lambdaStr);
		
		//반환 값으로 쓰이는 람다식
		PrintString reStr = returnString(); //변수로 반환받기
		reStr.showString("hello");			//메서드 호출
		
	}
	
	private static PrintString returnString() {
		return s -> System.out.println(s+"world");
	}

	public static void showMyString(PrintString p) {
		p.showString("hello_lambda_2");
	}
	
	

}
