package Ch10interfaceQueue;

import java.util.ArrayList;

//Shelf 클래스 만들기
public class Shelf {
	protected ArrayList<String> shelf; //자료를 순서대로 저장할 ArrayList 선언
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}

	public int getCount() {
		return shelf.size();
	}
}
