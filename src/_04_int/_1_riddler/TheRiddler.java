package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score;
		score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer1= "Nothing. Good riddles like this never get old.";
		String guess1= JOptionPane.showInputDialog("Can you please answer the riddle below.:/n"+ "What is greater than God,\n"
				+ "more evil than the devil,\n"
				+ "the poor have it,\n"
				+ "the rich need it,\n"
				+ "and if you eat it, you'll die?\n");
						
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(guess1.equals(answer1)) {
			score+=1;
			JOptionPane.showMessageDialog(null, "Great job!");
		}

		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer was" +answer1);
		}

		// 6. Add some more riddles
		String answer2= "A coffin.";
		String guess2=JOptionPane.showInputDialog("Can you please answer this riddle below:/n"+"Who makes it, has no need of it./n"
				+"Who buys it, has no use for it./n"
				+"Who uses it can neither see nor feel it./n"
				+"What is it?");
		if(guess2.equals(answer2)) {
			score+=1;
			JOptionPane.showMessageDialog(null," Correct!");
		}

		else {
			JOptionPane.showMessageDialog(null, "The correct answer was"+answer2);
		}
		String answer3= "Stop imagining.";
		String guess3=JOptionPane.showInputDialog("Can you please answer this riddle below:/n"+"Imagine you are in a dark room./n"
				+ "How do you get out?\n");
		if(guess3.equals(answer3)) {
			score+=1;
			JOptionPane.showMessageDialog(null,"Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null,"Wrong.The correct answer was"+answer3);
		}
				
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score was :" +score);
		}
	}


