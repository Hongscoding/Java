package Ch06;

public class Bus {
	int busnumber;
	int passengerCount;
	int money;
	
	public Bus(int busnumber) {
		this.busnumber = busnumber;
	} //버스 번호를 매개변수로 받는 생성자
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	} //승객이 버스에 탄 경우를 구현하는 메서드
	
	public void showInfo() {
		System.out.println("버스"+busnumber+"번의 승객은"+passengerCount+"명이고,수입은"+money+"입니다.");
	} //버스 정보를 출력하는 메서드
}
