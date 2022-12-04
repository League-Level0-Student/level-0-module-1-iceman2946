package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= JOptionPane.showInputDialog("Can you please tell me your birthday in MM/DD?");
		if (input.equals("12/3")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy Un-birthday!");
		}
			
	}

}
