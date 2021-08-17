package _03_if_else._1_unbirthday;

import java.util.Date;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date date = new Date();
String currentDate = (date.getMonth() + 1) + "/" + (date.getDay()+1);
String input = JOptionPane.showInputDialog("When is your birthday? (Answer in #/# form.)");
if (input.equalsIgnoreCase(currentDate)) {
	JOptionPane.showMessageDialog(null, "Happy Birthday!");
}
else {
	JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
}
	}

}
