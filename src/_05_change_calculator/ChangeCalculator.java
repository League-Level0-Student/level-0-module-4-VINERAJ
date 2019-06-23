package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nAsk = JOptionPane.showInputDialog("How many nickels do you have?");

		// Convert their answer to an int using Integer.parseInt()
int nMoney = Integer.parseInt(nAsk);
		// Ask the user how many dimes they have, and convert their answer
String dAsk = JOptionPane.showInputDialog("How many dimes do you have?");
int dMoney = Integer.parseInt(dAsk);
		// Ask the user how many quarters they have, and convert their answer
String qAsk = JOptionPane.showInputDialog("How many quarters do you have?");
int qMoney = Integer.parseInt(qAsk);
		// Calculate how much money the user has and save it in a double variable 
double nAmount = .050*nMoney;
double dAmount = .100*dMoney;
double qAmount = .250*qMoney;
double ammount = nAmount+dAmount+qAmount;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have $"+ammount);
	}
}

