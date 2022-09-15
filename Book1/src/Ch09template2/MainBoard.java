package Ch09template2;

//테스트 프로그램 실행하기
public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgaradeLevel1(aLevel);
		player.play(2);
		
		SuperLevel slevel = new SuperLevel();
		player.upgaradeLevel1(slevel);
		player.play(3);
		
	}

}
