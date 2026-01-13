package jigsawgame;

import javax.swing.*;

public class LoginJFrame extends JFrame {
	//Initialize interface
	public LoginJFrame(){
		//Set width and height
		this.setSize(488,430);
	
		//set title
		this.setTitle("登录");
		//Make the window always on top
		this.setAlwaysOnTop(true);
		//center the window
		this.setLocationRelativeTo(null);
		//set close operation
		this.setDefaultCloseOperation(3);
		//Display the interface
		this.setVisible(true);
	}
}
