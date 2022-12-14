package sub6;
/*
 * 날짜 : 2022/08/31
 * 이름 : 홍민준
 * 내용 : Override 실습하기 / 메서드에 final을 붙이면 오버라이드가 안됨 // 클래스에 final을 붙이면 상속이 안됨
 * 
 * 오버라이드(Override)
 *  - 부모클래스의 메서드를 자식클래스에 맞게 재정의 하는 것
 *  - 오버라이드를 통해 객체지향프로그래밍의 다형성 실현
 */
class AAA{
	public void method1() {
		System.out.println("AAA : method1...");
	}
	
	public void method2() {
		System.out.println("AAA : method2...");
	}
	
	public void method3() {
		System.out.println("AAA : method3...");
	}
}

class BBB extends AAA{
	
	@Override
	public void method2() {
		System.out.println("BBB : method2...");
	}
	
	public void method3(int a) {
		System.out.println("BBB : method3...");
	}
}

class CCC extends BBB{
	
	@Override
	public void method1() {
		System.out.println("CCC : method1...");
	}
	
	@Override
	public void method2() {
		System.out.println("CCC : method2...");
	}
	
	
	public void method3(int a, int b) {
		System.out.println("CCC : method3...");
	}
}

public class OverrideTest {
	public static void main(String[] args) {
		//오버라이드 메서드 호출
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1,2);
		
		Sedan sonata = new Sedan("소나타", "흰색", 0, 0);
		Truck bongo = new Truck("봉고", "파란색", 0 , 0);
		
		sonata.speedUp(100);
		sonata.speedTurbo();
		sonata.show();
		
		bongo.speedUp(100);
		bongo.show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
