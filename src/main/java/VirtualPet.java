import java.util.Random;

public class VirtualPet {

	Random random = new Random();

	public int hunger = random.nextInt(100);
	public int boredom = random.nextInt(100);
	public int tired = random.nextInt(100);

	int hungerDecrease = 80;
	int boredomDecrease = 50;
	int tiredDecrease = 100;

	public int userChoice = 0;

	public void petBehavior() {
		if (userChoice == 1) {
			hunger = hunger - hungerDecrease;
			if (hunger < 0)
				hunger = 0;
		}
		if (userChoice == 2) {
			boredom = boredom - boredomDecrease;
			if (boredom < 0)
				boredom = 0;
		}
		if (userChoice == 3) {
			tired = tired - tiredDecrease;
			if (tired < 0)
				tired = 0;

		}

	}
}