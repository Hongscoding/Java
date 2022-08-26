package Ch05;
//p157 나 혼자 코딩 하기
public class PersonTest {
	public static void main(String[] args) {
		
		//디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		
		
		
		//인스턴수 변수 초기화와 동시에 클래스 생성
		Person persomLee = new Person("이순신", 175, 75);
	}
}
