package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import java.util.Random;

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String r1= "is brillant.";
		String r2= "is bilingual.";
		String r3= "is smart.";
		String r4= "is strong.";
		String r5= "is a A+ student in school.";
		String r6= "is unique.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name=JOptionPane.showInputDialog("Please enter a name and I will tell you what is remarkable about them.");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		Random ran=new Random();
		int num=ran.nextInt(6);
		if (num==0)  {
			JOptionPane.showMessageDialog(null, name + r1);
		}
		if (num==1) {
			JOptionPane.showMessageDialog(null,name + r2);
		}
		if (num==2) {
			JOptionPane.showMessageDialog(null, name + r3);
		}
		if (num==3) {
			JOptionPane.showMessageDialog(null, name + r4);
		}
		if (num==4) {
			JOptionPane.showMessageDialog(null, name + r5);
		}
		if (num==5) {
			JOptionPane.showMessageDialog(null, name + r6);
		}
	}
}

