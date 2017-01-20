package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class DrawBall extends JPanel{
	private int positionX;
	private int positionY;
	
	 public void paintComponent(Graphics g) {
		 
		 super.paintComponent(g);
		 setBackground(Color.BLUE);
		 
		 doDrawing(g);
	    }
	 
	 public void doDrawing(Graphics g){
		 Graphics2D g2d = (Graphics2D) g;
		 g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		 g2d.setPaint(Color.BLACK);
		
		 g2d.fillOval(positionX, positionY, 40, 40);
	 }
	 
	 public void setPosition(double x, double y){
		 this.positionX = (int)x;
		 this.positionY = (int)y;
	 }
}
