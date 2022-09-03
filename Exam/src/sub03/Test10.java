package sub03;
/*
 * 날짜 : 2022/09/03
 * 이름 : 홍민준
 * 내용 : 인터페이스 연습문제
 */
interface Buyer{
	public void buy();
}
interface Seller{
	public void sell();
}
class Customers implements Buyer,Seller {
	public void sell() {
		System.out.println("판매하기");
	}
	
	public void buy() {
		System.out.println("구마해기");
	}
}
public class Test10 {
	public static void main(String[] args) {
		Buyer buyer = new Customers();
		Seller seller = new Customers();
		
		buyer.buy();
		seller.sell();
		
	}

}
