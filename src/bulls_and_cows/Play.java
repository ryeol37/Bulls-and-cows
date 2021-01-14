package bulls_and_cows;

import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
		
		//플레이어, 스캐너 인스턴스 생성
		Player player = new Player();
		Scanner sc = new Scanner(System.in);
		
		//3자리 랜덤숫자 생성
		Com com = new Com();
		com.setRandomNum();
		
		Rule rule = new Rule();
		
		//manual
		System.out.println("@@@@@ 게임 규칙 @@@@@");
		System.out.println("상대가 예상한 숫자를 맞춰야 한다.");
		System.out.println("숫자와 위치가 전부 틀리면 아웃.");
		System.out.println("사용되는 숫자는 0에서 9까지 서로 다른 숫자이다.");
		System.out.println("숫자는 맞지만 위치가 틀렸을 때는 볼.");
		System.out.println("숫자와 위치가 전부 맞으면 스트라이크.");
		System.out.println("숫자와 위치가 전부 틀리면 아웃.");
		System.out.println("물론 무엇이 볼이고 스트라이크인지는 알려주지 않는다.");
		
		while(rule.round != 10 && rule.strike != 3) {
			System.out.println("-------- " + rule.round + "round 입니다. --------");
			//플레이어 숫자생성
			for(int i = 0; i < player.userNum.length; i++) {
				System.out.println(i + 1 + "번째 숫자를 입력하세요.");
				player.userNum[i] = sc.nextInt();
			}
			player.setUserNum(player.userNum);
			
			rule.match(com.getRandomNum(), player.userNum);
		}
		sc.close();
	}

}