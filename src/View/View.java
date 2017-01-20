package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Linea on 18/12/2016.
 */
public class View {
    private JFrame frame;
    private JPanel panel;

    private Start start;
    private GameOver gameOver;
    private GameBoard gameBoard;
    private int frameHeight;
    private int frameWidth;

    //Laver enums til hver af siderne
    public enum whichPage{
        START, GAMEOVER, GAMEBOARD
    }

   //forhole



    //Constructor
    public View(){
        start = new Start();
        gameOver = new GameOver();
        gameBoard = new GameBoard();

        frameHeight = 900; //kan ændres
        frameWidth = 1200; //kan ændres

        start();

        createStart();
        createGameBoard();
        createGameOver();

        goToPage(whichPage.START);

        frame.setVisible(true);
        frame.setSize(frameWidth,frameHeight);
    }

    private void start() {
        frame = new JFrame("PinPong");

        panel = new JPanel(new CardLayout());
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public int getFrameHeight() {
        return frameHeight;
    }

    public int getFrameWidth() {
        return frameWidth;
    }

    public void goToPage(whichPage gotoPage) {
        CardLayout cardLayout = (CardLayout)panel.getLayout();
        cardLayout.show(panel, gotoPage.toString());
    }

    private void createStart(){
        start = new Start();
        panel.add(start, whichPage.START.toString());
    }

    private void createGameOver(){
        gameOver = new GameOver();
        panel.add(gameOver, whichPage.GAMEOVER.toString());
    }

    private void createGameBoard(){
        gameBoard = new GameBoard();
        panel.add(gameBoard, whichPage.GAMEBOARD.toString());
    }

    public Start getStart(){
        return start;
    }

    public GameBoard getGameBoard(){
        return gameBoard;
    }

    public GameOver getGameOver(){
        return gameOver;
    }

}
