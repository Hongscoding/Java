package Ch06singleton;
//p196 나 혼자 코딩 하기
public class Company {
	private static Company instance = new Company();
	private Company() {}
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		} // 인스턴스를 외부에서 참조할 수 있도록 public get()	메서드 구현
		return instance; //유일하게 생성한 인스턴스 반환
	}

}
