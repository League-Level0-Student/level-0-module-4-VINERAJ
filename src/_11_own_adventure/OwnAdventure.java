package _11_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Welcome to the jungle, traveller.");
	String name = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "Welcome, " + name + ".");
	JOptionPane.showMessageDialog(null, "You have come to the jungles of paIfdsjpoiajEopmvcae0rwv8au 99992-v to fond a mystical artifact known as the Heart of the Jungle.");
	JOptionPane.showMessageDialog(null, "Soon, you come to crossroads. You can go left, straight, right, and backwards. Where do you want to go?");
	String oneCross = JOptionPane.showInputDialog("Respond L/S/R/B.");
	if(oneCross.equalsIgnoreCase("L")) {
		JOptionPane.showMessageDialog(null, "You come to a river of lava.");
		String twoCross = JOptionPane.showInputDialog("Do you want to jump over it or go another way?(1 or 2)");
		if(twoCross.equalsIgnoreCase("1")) {
			JOptionPane.showMessageDialog(null, "You barely manage to get across.");
			JOptionPane.showMessageDialog(null, "You come to a cave. do you want to go in or not?");
			String fourCross = JOptionPane.showInputDialog("Respond Y/N");
			if(fourCross.equalsIgnoreCase("Y")) {
				JOptionPane.showMessageDialog(null, "You are attacked by a sasquatch and die.");
				JOptionPane.showMessageDialog(null, "Farewell, " + name + ".");
				System.exit(0);
			}
			else if(fourCross.equalsIgnoreCase("N")) {
				JOptionPane.showMessageDialog(null, "You continue walking on.");
				JOptionPane.showMessageDialog(null, "Soon, you come to a maze and enter it.");
				JOptionPane.showMessageDialog(null, "You can go left or right");
				JOptionPane.showMessageDialog(null, "Where do you want to go?");
				String sixCross = JOptionPane.showInputDialog("Respond L/R");
				if(sixCross.equalsIgnoreCase("L")||sixCross.equalsIgnoreCase("R")) {
					JOptionPane.showMessageDialog(null, "Suddenly, you see a monster blocking your path. What do you want to do?");
					JOptionPane.showMessageDialog(null, "Shoot it or run away?");
					String sevenCross = JOptionPane.showInputDialog("Respond S/R");
					if(sevenCross.equalsIgnoreCase("S")) {
						JOptionPane.showMessageDialog(null, "The monster eats you.");
						JOptionPane.showMessageDialog(null, "Farewell, " + name + ".");
						System.exit(0);
					}
					else if(sevenCross.equalsIgnoreCase("R")) {
						JOptionPane.showMessageDialog(null, "The monster chases you and then eats you.");
						JOptionPane.showMessageDialog(null, "Farewell, " + name + ".");
						System.exit(0);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Answer not accepted, please restart");
					System.exit(0);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Answer not accepted, please restart");
				System.exit(0);
			}
		}
		else if(twoCross.equalsIgnoreCase("2")) {
			JOptionPane.showMessageDialog(null, "There is no other way. You wander along the river forever and die.");
			JOptionPane.showMessageDialog(null, "Farewell, " + name + ".");
			System.exit(0);
	}
		else {
			JOptionPane.showMessageDialog(null, "Answer not accepted, please restart");
			System.exit(0);
		}
	}
	else if(oneCross.equalsIgnoreCase("S")) {
		JOptionPane.showMessageDialog(null, "You fall in quicksand and die.");
		JOptionPane.showMessageDialog(null, "Farewell, " + name + ".");
		System.exit(0);
	}
	else if(oneCross.equalsIgnoreCase("R")) {
		JOptionPane.showMessageDialog(null, "There is an earthquake and you have to take cover.");
		JOptionPane.showMessageDialog(null, "Where do you want to take cover?");
		JOptionPane.showMessageDialog(null, "A boulder or a tree?");
		String threeCross = JOptionPane.showInputDialog("Respond B/T");
		if(threeCross.equalsIgnoreCase("B")) {
			JOptionPane.showMessageDialog(null, "You bang your head against the boulder, shattering your skull. You die.");
			JOptionPane.showMessageDialog(null, "Farewell, " + name + ".");
			System.exit(0);
		}
		else if(threeCross.equalsIgnoreCase("T")) {
			JOptionPane.showMessageDialog(null, "You survive the earthquake, but something hits you on the head.");
			JOptionPane.showMessageDialog(null, "It is a cylinder. Do you want to open it or not?");
			String fiveCross = JOptionPane.showInputDialog("Respond Y/N");
			if(fiveCross.equalsIgnoreCase("Y")) {
				JOptionPane.showMessageDialog(null, "You open it and find a map inside. It leads to the Heart of the Jungle. You decide to follow it");
			}
			else if(fiveCross.equalsIgnoreCase("N")) {
				JOptionPane.showMessageDialog(null, "As you throw the cylinder aside, it hits an anthill and the giant ants inside it swarm out.");
				JOptionPane.showMessageDialog(null, "Do you want to run away from them or shoot at them with your gun?");
				String eightCross = JOptionPane.showInputDialog("Respond R/S");
				if(eightCross.equalsIgnoreCase("R")) {
					JOptionPane.showMessageDialog(null, "You are eaten before you can get far.");
					JOptionPane.showMessageDialog(null, "Farewell, " + name + ".");
					System.exit(0);
				}
				else if(eightCross.equalsIgnoreCase("S"))
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Answer not accepted, please restart");
			System.exit(0);
	}
	}
	else if(oneCross.equalsIgnoreCase("B")) {
		JOptionPane.showMessageDialog(null, "You leave the jungle of paIfdsjpoiajEopmvcae0rwv8au 99992-v, you coward.");
		JOptionPane.showMessageDialog(null, "Farewell, " + name + ".");
		System.exit(0);
	}
	else {
		JOptionPane.showMessageDialog(null, "Answer not accepted, please restart");
		System.exit(0);
	}
}
}

