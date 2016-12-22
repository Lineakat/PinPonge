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
    private JTextField text;

    //Constuctor
    public Start(){
        startGameButton = new JButton("Start Game");
        panelCenter = new JPanel();

        setVisible(true);
        setPreferredSize(new Dimension(1200, 900));

        startup();
    }

    public void addALToStartGameButton(ActionListener a){
        startGameButton.addActionListener(a);
    }

    public void startup(){
        setLayout(new BorderLayout());
        panelCenter.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10); //plads mellem knapperne og labels
        c.gridx = 1;
        c.gridy = 1;
        panelCenter.add(startGameButton, c);

        add(panelCenter, BorderLayout.CENTER);
    }

    public void colorButton(){
        startGameButton.setBackground(Color.BLUE);
    }

}
