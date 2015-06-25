package anything;

//Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
* I have a pocket full of change. I hate doing math. Make me a program that
* will calculate how much money I have without me having to use my brain. Then
* make me a sandwich.
*/
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String calculatornickles=		JOptionPane.showInputDialog("HOW MANY NICKLES DO U HAVE IN UR POCKET....");

		// Convert their answer to an int using Integer.parseInt()
int creepnickles= Integer.parseInt(calculatornickles);

		// Ask the user how many dimes they have, and convert their answer
String dimmy= JOptionPane.showInputDialog("how many dimes do u have in ur pocket... now");
		// Ask the user how many quarters they have, and convert their answer
int creepdimmy= Integer.parseInt(dimmy);
		// Calculate how much money the user has and save it in a double variable 
String que= JOptionPane.showInputDialog("how many que do u have in ur pocket... now");
// Ask the user how many quarters they have, and convert their answer
int creepque= Integer.parseInt(que);
// Calculate how much money the user has and save it in a double variable 
int creepsum= creepnickles*5+ creepdimmy*10+ creepque*25;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null,"u have"+ creepsum);

	}
}


