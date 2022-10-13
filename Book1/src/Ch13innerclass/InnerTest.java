package Ch13innerclass;


//인스턴스 내부 클래스 예제
class OutClass{ //외부 클래스
	private int num = 10; //외부 클래스 private 변수
	private static int sNum = 20; //외부 클래스 정적 변수
	
	static class InStaticClass{ //정적 내부 클래스
		int inNum = 100;		//정적 내부 클래스의 인스턴스 변수
		static int sInNum = 200;//정적 내부 클래스의 정적 변수
	
	//정적 내부 클래스의 일반 메서드
	void inTest() {
		System.out.println("InStaticClass inNum = "+inNum+"(내부 클래스의 인스턴스 변수 사용)");
		System.out.println("InStaticClass sInNum = "+sInNum+"(내부 클래스의 정적 변수 사용)");
		System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 정적 변수 사용)");
	}
	
	static void sTest() {
		System.out.println("OutClass sNum"+sNum+"(외부 클래스의 정적 변수 사용)");
		System.out.println("InStaticClass sInNum"+sInNum+"(내부 클래스의 정적 변수 사용)");
	}
	
	}
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 100;
		
		void inTest() {
			System.out.println("OutCalss num = "+num+"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutCalss snum = "+sNum+"(외부 클래스의 정적 변수)");
		}
	}
		
	public void usingClass() {
		inClass.inTest();
	}
		
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass(); //내부 클래스 기능 호출
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
	}
}
