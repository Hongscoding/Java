package Ch12generice;

//GenericPrinter<T> 클래스 사용하기
public class GenericPrinterTest {
	public static void main(String[] args) {
		
		//Powder 형으로 GenericPrinter 클래스 생성
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		//Plastic 형으로 GenericPrinter 클래스 생성
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>(); 
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
		
		
		
		
	}

}
