package Ch11Object;

//clone() 메서드로 인스턴스 복제하기

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x="+x+","+"y="+y;
	}
} // 원점을 의미하는 Point 클래스

class Circle implements Cloneable{
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		this.radius = radius;
		point = new Point(x,y);
	}
	
	public String toString() {
		return "원점은 "+ point+"이고,"+"반지름은"+radius+"입니다.";
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone(); // clone() 메서드를 사용해 circle 인스턴스를 copyCircle에 복제함
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
		
		
		
	}
	

}






