/*
Cao, Brian

December 14, 2021

CS A170
Ch 7&9 Task 5: Frames
*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frames 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		
		JButton button = new JButton("Click me!");
		JLabel label = new JLabel("Hello, World!");
		
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		
		final int FRAME_WIDTH = 400;
		final int FRAME_HEIGHT = 200;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("A frame with two components");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);

	}

}
