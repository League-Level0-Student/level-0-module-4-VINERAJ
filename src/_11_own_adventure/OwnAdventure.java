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
	}
	else if(oneCross.equalsIgnoreCase("S")) {
		JOptionPane.showMessageDialog(null, "You fall in quicksand and die.");
		JOptionPane.showMessageDialog(null, "Farewell, " + name + ".");
		System.exit(0);
	}
	else if(oneCross.equalsIgnoreCase("R")) {
		JOptionPane.showMessageDialog(null, "There is an earthquake and you have to take cover.");
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
