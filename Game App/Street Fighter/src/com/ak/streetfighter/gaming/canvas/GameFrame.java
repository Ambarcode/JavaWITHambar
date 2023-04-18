package com.ak.streetfighter.gaming.canvas;

import javax.swing.JFrame;

import com.ak.streetfighter.gaming.utils.GameConstants;
//Shortcut key to import classes: ctlr+Shift+O
public class GameFrame extends JFrame implements GameConstants{
	
	//Creating a constructor
	public GameFrame() throws Exception {
		setResizable(false);
		setTitle(TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(GWIDTH, GHEIGHT); //width , height
		setLocationRelativeTo(null);
		Board board=new Board();
		add(board);
		setVisible(true);
	}
  public static void main(String[] args) {
	  //JVM Triggers main()
	  //But who is executing the main() method code?
	  //The answer is Main Thread
	  //Thread-->Code in Execution
	  //Thread is run by CPU core
	  //Every Thread has it's own call stack
	  //We can Use Timer class to achieve MultiThreading
	 
	  
	try {
		GameFrame obj=new GameFrame();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}




