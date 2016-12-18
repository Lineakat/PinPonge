package View;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Created by Linea on 18/12/2016.
 */
public class GameOver extends JPanel {
	private JPanel panelCenterLost;
	private JLabel labelLost;
	private JButton restartButton;
	

    //Controller
    public GameOver() {
    	
    	panelCenterLost = new JPanel();
    	labelLost = new JLabel("Game Over"); 
    	restartButton = new JButton("Restart Game");
    	
    	
    	
    	
    	startup();
    	centerpanel();


    }
    
    public void centerpanel(){
    	JPanel pane = new JPanel(new GridBagLayout());
    	GridBagConstraints c = new GridBagConstraints();
    	panelCenterLost.setLayout(new BorderLayout());
    	
    	c.gridx = 10;
    	c.gridy = 10;
    	pane.add(restartButton, c);
    	
    	c.gridx = 2;
    	c.gridy = 3;
    	pane.add(labelLost, c);
    	panelCenterLost.add(pane, BorderLayout.CENTER);
    }
    
    public void addALToStartGameButton(ActionListener a){
        restartButton.addActionListener(a);
    }

    public void startup(){
        add(panelCenterLost);
        panelCenterLost.add(labelLost);
        panelCenterLost.add(restartButton);

    }
}
