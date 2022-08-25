package sub3;

public class Calc {
	
	//싱글톤
	
	private static Calc instance = new Calc(); //자체 객체 생성
	public static Calc getInstance() {
		return instance;
	}// getter 생성으로 인스턴스 제공

	private Calc() {}
	
	public int plus(int x, int y) {
		return x+y;
	}
	public int minus(int x, int y) {
		return x-y;
		
	}
	public int multi(int x, int y) {
		return x*y;
		
	}
	public int dibv(int x, int y) {
		return x/y;
		
	}	
}
