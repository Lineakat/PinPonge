package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class DrawBoard extends JPanel{

	
	 public void paintComponent(Graphics g) {
		 setSize(new Dimension(1200, 900));
		 super.paintComponent(g);
		 setBackground(Color.BLUE);
		 
		 doDrawing(g);
	    }
	 
	 public void doDrawing(Graphics g){
		 Graphics2D g2d = (Graphics2D) g;
		 g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		 g2d.setPaint(Color.BLACK);
		 System.out.println(getHeight());
		 g2d.drawLine(0, 0, 1200, 900);
	 }
}
