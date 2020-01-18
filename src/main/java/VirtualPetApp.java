import java.util.Scanner;
import java.util.Random;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet myVirtualPet = new VirtualPet();
		Scanner input = new Scanner(System.in);
		Random randomIncrease = new Random();

		int hungerIncrease = randomIncrease.nextInt(50);
		int boredomIncrease = randomIncrease.nextInt(35);
		int tiredIncrease = randomIncrease.nextInt(10);

		for (int tick = 0; tick < 200; tick++) {

			System.out.println("Alice the alligator");
			System.out.println("Hunger: " + myVirtualPet.hunger);
			System.out.println("Boredom: " + myVirtualPet.boredom);
			System.out.println("Tired: " + myVirtualPet.tired);

			System.out.println("What do you want to do?");
			System.out.println("[1] Feed Alice");
			System.out.println("[2] Play with Alice");
			System.out.println("[3] Put Alice to sleep");
			System.out.println("[4] Wait");

			myVirtualPet.hunger = myVirtualPet.hunger + hungerIncrease;
			myVirtualPet.boredom = myVirtualPet.boredom + boredomIncrease;
			myVirtualPet.tired = myVirtualPet.tired + tiredIncrease;
			myVirtualPet.userChoice = input.nextInt();
			myVirtualPet.petBehavior();

		}
		input.close();

	}

}