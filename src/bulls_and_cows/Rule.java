package bulls_and_cows;

public class Rule {

	int round = 1;
	int strike = 0;
	int ball = 0;
	
	public void match(int[] ranNum, int[] userNum) {
		for(int i = 0; i < ranNum.length; i++) {
			if(ranNum[i] == userNum[i]) {
				strike++;
			}
			for(int j =0; j < userNum.length; j++) {
				if(ranNum[i] == userNum[j] && i != j) {
					ball++;
				}
			} 
		}
		
		if(strike == 3) {
			for(int i = 0; i < ranNum.length; i++) {
				System.out.print("[" + ranNum[i] + "]");
			}
			System.out.print(" 정답입니다.");
			return;
		}
		
		if(strike == 0 && ball == 0) {
			System.out.println("***  OUT!!! *** ");
		} else {
			System.out.println("*** " + round + "회 " + strike + "S " + ball + "B ***");
		}
		
		strike = 0;
		ball = 0;
		round++;
		if(round == 10) {
			System.out.print("9라운드가 종료되어 패배하였습니다. 정답은 ");
			for(int i = 0; i < ranNum.length; i++) {
				System.out.print("[" + ranNum[i] + "]");
			}
			System.out.print(" 입니다.");
			return;
		}
	}
}