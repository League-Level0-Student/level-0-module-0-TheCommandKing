package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random(); // This will be used later to make random numbers.

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		int playerHealth;
		int dragonHealth;
		// playerHealth to store your health - set it equal to 100
		playerHealth = 100;
		// dragonHealth to store the dragon's health - set it equal to 100
		dragonHealth = 100;
		// 2. Create some variables to hold the attack strengths. These will be given
		// different values later.
		int playerAttack;
		int dragonAttack;
		// playerAttack to store the damage the player's attack will do - set it equal
		// to 0 for now.
		playerAttack = 0;
		// dragonAttack to store the damage the dragon's attack will do - set it equal
		// to 0 for now.
		dragonAttack = 0;

		// This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

			// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
			// or a kick
			String slashorshoot = JOptionPane.showInputDialog("Would you like to slash or shoot at the dragon.");
			// 4. If they typed in "yell":

			// -- Find a random number between 0 and 10 and store it in playerAttack. Use
			// ran.nextInt(10)
			if (slashorshoot.equals("shoot")) {
				playerAttack = ran.nextInt(25);
			}
			// 5. If they typed in "kick":
			if (slashorshoot.equals("slash")) {
				playerAttack = ran.nextInt(10);
			}
			if (slashorshoot.equals("Secret12354666!!!")) {
				playerAttack = ran.nextInt(1000000000);
				String Secret = "Error....Dragon.exe c0rupted. Dragon AI shut down by unknown devel0per.\n"
						+ "Virus detected in drag0n files. Ant1viru5 0verr1dd3n by unkn0wn 50urc3. P14y3r h45 0n3. Dr460n h45 d13d. 64m3 0v3rrrrr...\n"
						+ "..........................................................................................................................................................................................................................................";

				JOptionPane.showMessageDialog(null, Secret);
			}
			// -- Find a random number between 0 and 25 and store it in playerAttack.

			// 6. Subtract the player attack value from the dragon's health
			dragonHealth = dragonHealth - playerAttack;
			// THE DRAGON RETALIATES

			// 7. Find a random number between 0 and 35 and store it in dragonAttack
			dragonAttack = ran.nextInt(35);
			// 8. Subtract the dragon attack value from the player's health
			playerHealth = playerHealth - dragonAttack;
			// ASSESS THE DAMAGE

			// 9. If the player's health is less than or equal to 0, the game is over,
			// call the playerLost() method
			if (playerHealth <= 0) {
				playerLost();
			}
			// 10. If the dragon's health is less than or equal to 0, the game is over,
			// call the dragonLost() method
			if (dragonHealth <= 0) {
				dragonLost();
			}
			// 11. Pop up a message that tells us how much health the player and
			// dragon have left.
		JOptionPane.showMessageDialog(null,
					"The Player has " + playerHealth + " health left. The Dragon has " + dragonHealth + " health left");	

			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
int dragonGameAttack = 0;
		dragonGameAttack = dragonAttack + dragonGameAttack;
				int playerGameAttack = 0;
				playerGameAttack = playerAttack + playerGameAttack;
JOptionPane.showMessageDialog(null,
				"The Dragon did " + dragonGameAttack + " while the player did " + playerGameAttack + "");

		} // this is the end of the while loop
		
		
	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no
		// treasure
JOptionPane.showMessageDialog(null,"You have been defeated by the dragon and found no gold. You must return home to fight one other day.");
		System.exit(0); // This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of
		// gold!
JOptionPane.showMessageDialog(null,"You have won!!! The dragon has died and you shall inheret all of its gold.");
		System.exit(0); // This code ends the program
	}

}
