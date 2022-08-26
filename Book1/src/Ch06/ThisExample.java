package Ch06;

class Birth {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}

}

public class ThisExample{
	public static void main(String[] args) {
		Birth bday = new Birth();
		bday.setYear(2000);
		System.out.println(bday);
		bday.printThis();
	}
}
