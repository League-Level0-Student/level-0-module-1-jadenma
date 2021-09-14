package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("What travels around the world while staying in one corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equalsIgnoreCase("A stamp")) { 
	score++;
	JOptionPane.showMessageDialog(null, "Correct! Your score is now "+score+"");
}
		// 5. Otherwise, say "wrong" and tell the answer
else { 
	JOptionPane.showMessageDialog(null, "Wrong!! The correct answer is a stamp. Your score is "+score+"");
}
		// 6. Add some more riddles
answer = JOptionPane.showInputDialog("What has to be broken before you can use it?");
if (answer.equalsIgnoreCase("An egg")) { 
	score++;
	JOptionPane.showMessageDialog(null, "Correct! Your score is now "+score+"");
}
else { 
	JOptionPane.showMessageDialog(null, "Wrong!! The correct answer is an egg. Your score is "+score+"");
}
//Question 3
answer = JOptionPane.showInputDialog("What has many keys but can't open a single lock?");
if (answer.equalsIgnoreCase("A piano")) { 
	score++;
	JOptionPane.showMessageDialog(null, "Correct! Your score is now "+score+"");
}
else { 
	JOptionPane.showMessageDialog(null, "Wrong!! The correct answer is a piano. Your score is "+score+"");
}
//Question 4
answer = JOptionPane.showInputDialog("What runs all around a backyard, yet never moves?");
if (answer.equalsIgnoreCase("A fence")) { 
	score++;
	JOptionPane.showMessageDialog(null, "Correct! Your score is now "+score+"");
}
else { 
	JOptionPane.showMessageDialog(null, "Wrong!! The correct answer is a fence. Your score is "+score+"");
}
//Question 5
answer = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
if (answer.equalsIgnoreCase("A candle")) { 
	score++;
	JOptionPane.showMessageDialog(null, "Correct! Your score is now "+score+"");
}
else { 
	JOptionPane.showMessageDialog(null, "Wrong!! The correct answer is a candle. Your score is "+score+"");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Nice Job! Your final score for this riddle quiz is "+score+"");
	}
}

