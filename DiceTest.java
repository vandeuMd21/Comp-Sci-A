

public class DiceTest {

	public static void main(String[] args) {
		int count = 1;
		TwentySidedDice roll = new TwentySidedDice(20);
		roll.changeSections(20);
		while(count < 2) {
			roll.roll();
			count++;
			
		}
	}


	}

