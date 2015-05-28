

// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		
	String sofia=	JOptionPane.showInputDialog("what color would you like for the tortoise to draw?P.S choose red."
			+ "if u dont u get black");
		//4. use an if/else statement to set the pen color that the user requested
		if (sofia.equals("red"))
		{
			Tortoise.setPenColor(Colors.Reds.FireBrick);
					
		}
//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		
Tortoise.setPenWidth(10);		
Tortoise.turn(300);
Tortoise.move(90);
Tortoise.turn(67);
Tortoise.move(50);
Tortoise.turn(67);
Tortoise.move(79);
Tortoise.turn(50);
Tortoise.move(79);
Tortoise.turn(50);
Tortoise.move(60);
Tortoise.turn(70);
Tortoise.move(50);
Tortoise.turn(37);
Tortoise.move(34);
	}
}


