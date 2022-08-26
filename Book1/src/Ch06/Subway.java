package Ch06;

public class Subway {
	String Linenumber;
	int passengerCount;
	int money;
	
	public Subway(String Linenumber) {
		this.Linenumber = Linenumber;
	} //지하철 노선 번호를 매개변수로 받는 생성자
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	} // 승객이 자하철에 탄 경우를 구현한 메서드
	
	public void showInfo() {
		System.out.println(Linenumber+"의 승객은"+passengerCount+"명이고, 수입은"+money+"입니다.");
	} // 지하철 정보를 출력하는 메서드

}
