package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class DrawBoard extends JPanel{

	
	 public void paintComponent(Graphics g) {

	        super.paintComponent(g);
	        doDrawing(g);
	    }
	 
	 public void doDrawing(Graphics g){
		 Graphics2D g2d = (Graphics2D) g;
		 g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		 g2d.setPaint(Color.BLACK);
		 
		 g2d.drawLine(0, 0, 1200, 400);
	 }
}
