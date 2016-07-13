package day3;

import javax.swing.JOptionPane;

public class snooper {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("What is your address?");
		JOptionPane.showMessageDialog(null, "That is wrong");
		String b = JOptionPane.showInputDialog("What is your social security number?");
		JOptionPane.showMessageDialog(null, "That is wrong");
		String c = JOptionPane.showInputDialog("When is your birthday?");
		JOptionPane.showMessageDialog(null, "That is wrong");
		JOptionPane.showInputDialog("What is your real address?");
		JOptionPane.showConfirmDialog(null, "Are you sure?");
		JOptionPane.showInputDialog("What is your real social security number?");
		JOptionPane.showConfirmDialog(null, "Are you sure?");
		JOptionPane.showInputDialog("What is your real birthday?");
		JOptionPane.showConfirmDialog(null, "Are you sure?");
		JOptionPane.showMessageDialog(null, a + " " + b + " " + c);
	}

}
