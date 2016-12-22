package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Linea on 18/12/2016.
 */
public class GameBoard extends JPanel {

    private JPanel panelCenter;
    private JTextField text;

    //Controller
    public GameBoard(){
        text = new JTextField("Test");
        panelCenter = new JPanel();
        setVisible(true);
        setPreferredSize(new Dimension(1200, 900));


        startup();

    }

    public void startup(){

        add(panelCenter);
        panelCenter.add(text);

    }

}
