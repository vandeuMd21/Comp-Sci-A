import java.util.Random;

public class TwentySidedDice {
	private int section;
	Random random = new Random();
	public TwentySidedDice() {
		section = 20;
	}

	public TwentySidedDice(int numSect) {
		section = numSect;
	}
	
	public void changeSections(int newSections) {
		section = newSections;
		
	}
	
	public int getSections() {
		return section;
	}
	
	public void roll() {
		int randomRoll = random.nextInt(section) + 1;
		System.out.println("you rolled a: " + randomRoll);
		
	}
}
