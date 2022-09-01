package Ch07array;
//객체 배열의 깊은 복사
public class ObjectCopy3 {
	public static void main(String[] args) {
		Book[] bookarray1 =new Book[3];
		Book[] bookarray2 =new Book[3];
		
		bookarray1[0] =	 new Book("태백산맥", "조정래");
		bookarray1[1] =	 new Book("데미안", "헤르만 헤세");
		bookarray1[2] =	 new Book("어떻게 살 것인가", "유시민");
		
		bookarray2[0] = new Book();
		bookarray2[1] = new Book();
		bookarray2[2] = new Book();
		
		for(int i =0; i <bookarray1.length;i++) {
			bookarray2[i].setBookname(bookarray1[i].getBookname());
			bookarray2[i].setAuthor(bookarray1[i].getAuthor());
		}
		
		for(int i=0;i<bookarray2.length;i++) {
			bookarray2[i].showBookInfo();
		}
		
		bookarray1[0].setBookname("나목");
		bookarray1[0].setAuthor("박완서");
		
		System.out.println("===bookarray1===");
		for(int i=0;i<bookarray1.length;i++) {
			bookarray1[i].showBookInfo();
		}
		
		System.out.println("===bookarray2===");
		for(int i=0;i<bookarray2.length;i++) {
			bookarray2[i].showBookInfo();
		}
		
	}

}
