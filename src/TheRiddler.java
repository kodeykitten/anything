import javax.swing.JOptionPane;


public class TheRiddler {

	public static void main(String[] args) {

	
int score=32;
		
String answer=JOptionPane.showInputDialog(null, "give me food and i will live give me water and i will die what am i?");

	
if (answer.equals("fire")) {
	JOptionPane.showMessageDialog(null, "maybe....ok fine u got it right adios!");
}else {
	JOptionPane.showMessageDialog(null, " hola!!no it was fire. nice try!");
}
		
	}
}


