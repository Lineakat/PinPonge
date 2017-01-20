package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawBall extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.WHITE);
		g.setColor(Color.BLUE);
		
		
		g.fillOval(200, 200, 200, 200);
	}


}
