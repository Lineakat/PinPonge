package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Linea on 18/12/2016.
 */
public class Start extends JPanel{
    private JPanel panelCenter;
    private JButton startGameButton;
    private JButton gameOverButton;
    private JLabel startText;

    //Constuctor
    public Start(){
        startGameButton = new JButton("Start Game");
        gameOverButton = new JButton("Game Over");
        startText = new JLabel("Welcome to PinPong!");
        panelCenter = new JPanel();

        setVisible(true);
        setPreferredSize(new Dimension(1200, 900));

        startup();
    }

    public void addALToStartGameButton(ActionListener a){
        startGameButton.addActionListener(a);
    }

    public void addALToGameOverButton(ActionListener a){
        gameOverButton.addActionListener(a);
    }

    public void startup(){
        setLayout(new BorderLayout());
        panelCenter.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10); //plads mellem knapperne og labels

        c.gridx = 1;
        c.gridy = 1;
        panelCenter.add(startText, c);

        c.gridx = 1;
        c.gridy = 2;
        panelCenter.add(startGameButton, c);

        c.gridx = 2;
        c.gridy = 2;
        panelCenter.add(gameOverButton, c);

        add(panelCenter, BorderLayout.CENTER);
    }

}
