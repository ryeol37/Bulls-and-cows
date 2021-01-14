package bulls_and_cows;

import java.util.Random;

public class Com {
	int[] com = new int[3];
	
	public void setRandomNum() {
		Random random = new Random();
		//1번째 숫자생성
		com[0] = random.nextInt(10);
		//2번째 숫자생성
		while(com[1] == com[0]) {
			com[1] = random.nextInt(10);
		}
		//3번째 숫자생성
		while(com[2] == com[1] || com[2] == com[0]) {
			com[2] = random.nextInt(10);
		}
	}
	
	public int[] getRandomNum() {
		return com;
	}
	
	public void showRandomNum() {
		for(int i = 0; i < com.length; i++) {
			System.out.print("[" + com[i] + "]");
		}
	}
}
