package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

/**
 * Created by Linea on 18/12/2016.
 */
public class GameBoard extends JPanel {

    private JPanel panelCenter;
    
    private JLabel text;
    private JButton giveUpButton;


    //Controller
    public GameBoard(Dimension dim){
    	
    	text = new JLabel("New Game!");
        giveUpButton = new JButton("Give up!");

       
        panelCenter = new JPanel(new BorderLayout());
        setVisible(true);
        setPreferredSize(dim);
        setBackground(Color.WHITE); //Laver baggrunden hvid
        
        
        panelCenter.setPreferredSize(dim);
        panelCenter.setBackground(Color.WHITE);
        
        DrawBoard board = new DrawBoard();
        
        
        add(panelCenter);
        panelCenter.add(text, BorderLayout.SOUTH);
        panelCenter.add(giveUpButton,BorderLayout.NORTH);
        panelCenter.add(board, BorderLayout.CENTER);
        
    	
		
        
       
        //startBall();
    }

    public void startup(){
    	
    	
    }

    public void addALToGiveUpButton(ActionListener a){
        giveUpButton.addActionListener(a);
    }

    public void paintBall(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(30, 40, 100,100);
    }

    public void paintStick(Graphics g){
        //g.fillRect(x, y, width, height);
    }

    public void Paint(Graphics g){
        g.fillOval(300, 400, 10,10);
        paintBall(g);
    }

}
