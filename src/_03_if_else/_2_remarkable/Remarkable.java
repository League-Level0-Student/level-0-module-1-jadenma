package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String EthanHu = "Ethan is good at basketball and is twins with Ryan";
String RyanHu = "Ryan is smart and is good at roasting people";
String JamesGuo = "James is good at math";
String RyanZhao = "Ryan Z is good at reading and writing";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String input = JOptionPane.showInputDialog("Enter a name.");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (input.equalsIgnoreCase("Ethan")) { 
	JOptionPane.showMessageDialog(null, EthanHu);
}
else if (input.equalsIgnoreCase("Ryan")) { 
	JOptionPane.showMessageDialog(null, RyanHu);
}
else if (input.equalsIgnoreCase("James")) { 
	JOptionPane.showMessageDialog(null, JamesGuo);
}
else if (input.equalsIgnoreCase("Ryan Z")) { 
	JOptionPane.showMessageDialog(null, RyanZhao);
}
else { 
	JOptionPane.showMessageDialog(null, "This person is not in our friend group.");
}
	}
}

