package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		
		String code = JOptionPane.showInputDialog("do you know how to write code");
		
		
	//	String language = "yes";
		if (code.equals("yes")) {
			//System.out.println("you will rule the world");
			JOptionPane.showMessageDialog(null, "you will rule the world");
		}
			else {
			JOptionPane.showMessageDialog(null, "take coding classes");
		}
		
		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

