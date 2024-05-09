package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("Chess");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		//add game panel to the window
		GamePanel gp = new GamePanel();
		window.add(gp);
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gp.launchGame();
	}

}
