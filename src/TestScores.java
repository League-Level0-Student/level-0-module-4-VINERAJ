import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("What was your test score?");
	double dScore = Double.parseDouble(score);
	if(dScore>=90) {
		JOptionPane.showMessageDialog(null, "Average");
	}
	else if(dScore>=80) {
		JOptionPane.showMessageDialog(null, "Below average");
	}
	
	else if(dScore>=70) {
		JOptionPane.showMessageDialog(null, "Can't have dinner");
	}
	
	else if(dScore>=60) {
		JOptionPane.showMessageDialog(null, "Don't come home");
	}
	
	else if(dScore<=59) {
		JOptionPane.showMessageDialog(null, "Find a new family");
	}
}
}
