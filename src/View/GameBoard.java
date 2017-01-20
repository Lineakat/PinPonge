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
    public GameBoard(){
        text = new JLabel("New Game!");
        giveUpButton = new JButton("Give up!");

        panelCenter = new JPanel();
        setVisible(true);
        setPreferredSize(new Dimension(1200, 900));
        setBackground(Color.black); //Laver baggrunden sort

        startup();
        //startBall();
    }

    public void startup(){
        add(panelCenter);
        panelCenter.add(text);
        panelCenter.add(giveUpButton);
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
