package View;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Created by Linea on 18/12/2016.
 */
public class GameOver extends JPanel {
	private JPanel panelCenterGameOver;
	private JLabel labelLost;
	private JButton restartButton;
	private JButton toFrontButton;

    //Controller
    public GameOver() {
		panelCenterGameOver = new JPanel();
		labelLost = new JLabel("Game Over");
		restartButton = new JButton("Restart Game");
		toFrontButton = new JButton("To Front");

		startup();
	}

	public void addALToRestartGameButton(ActionListener a){
		restartButton.addActionListener(a);
	}

	public void addALToToFrontButton(ActionListener a ){
		toFrontButton.addActionListener(a);
	}

    public void startup(){
        add(panelCenterGameOver);
		JPanel pane = new JPanel(new GridBagLayout());
		panelCenterGameOver.setLayout(new BorderLayout());

		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(10, 10, 10, 10); //plads mellem knapperne og labels

		c.gridx = 1;
		c.gridy = 1;
		pane.add(labelLost, c);
		panelCenterGameOver.add(pane, BorderLayout.CENTER);

		c.gridx = 1;
		c.gridy = 2;
		pane.add(restartButton, c);

		c.gridx = 2;
		c.gridy = 2;
		pane.add(toFrontButton, c);
    }
}
