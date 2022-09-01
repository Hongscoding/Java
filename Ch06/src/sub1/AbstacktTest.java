package sub1;
/*
 * 날짜 : 2022/09/01
 * 이름 : 홍민준	
 * 내용 : 추상클래스 실습하기
 * 
 * 추상클래스(Abstract Class)
 *  - 공통의 기능은 하나의 메서드로 구현하고 개별적인 기능은 override 메서드로 구현시크는 추상메서드를 갖는 클래스
 *  - 일반클래스 설계를 위한 가이드 역할을 하는 부모클래스
 *  - 추상클래스는 객체를 생성할 수 없음
 */
public class AbstacktTest {
	public static void main(String[] args) {
		
		Car sonata = new Sedan("소나타", "흰색", 0, 2000);
		Car bongo = new Truck("봉고", "파란색", 0, 0);
		
		sonata.show();
		bongo.show();
		
	}
}
