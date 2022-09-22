package Ch12generice;

//GenericPrinter<T> 클래스 정의하기
public class GenericPrinter<T extends Material> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	} //T 자료형 변수 material을 반환하는 제네릭 메서드
	
	public String toString() {
		return material.toString();
	}

	public void printing() {
		material.doPrinting();
	}
}
