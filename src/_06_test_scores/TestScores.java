package _06_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String scores = JOptionPane.showInputDialog("What was your last test score?");
	Double score = Double.parseDouble(scores);
	if(score>=90) {
		JOptionPane.showMessageDialog(null, "Average");
	}
	else if(score>=80) {
		JOptionPane.showMessageDialog(null, "Below average");
	}
	else if(score>=70) {
		JOptionPane.showMessageDialog(null, "Can't eat dinner");
	}
	else if(score>=60) {
		JOptionPane.showMessageDialog(null, "Don't come home");
	}
	else if(score<=59) {
		JOptionPane.showMessageDialog(null, "Find a new family");
	}
}

}
