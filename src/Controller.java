import View.*;
import Model.*;

/**
 * Created by Linea og philip on 18/12/2016.
 */
public class Controller {
    //private Model model;
    private static View view;
	private static Controller control;
	private static Model model;

    //Constructor
    public Controller() {
        view = new View();
        model = new Model();

        createALButtons();
    }

    public static void main(String[] args){
        //System.out.println("HEJ PHILIP du er dejlig!");
        //System.out.println("HEJ PHILIP jeg elsker dig!");
        control = new Controller();
    }

    public void createALButtons(){
        createALButtonsStart();
        createALButtonGameOver();
        createALButtonToFront();
        createALButtonRestartGame();
        createALButtonGiveUp();
    }

    //Start
    private void createALButtonsStart() {
        view.getStart().addALToStartGameButton(e -> buttonStartGame());
    }

    private void createALButtonGameOver(){
        view.getStart().addALToGameOverButton(e -> buttonGameOver());
    }


    //Game over
    private void createALButtonToFront(){
        view.getGameOver().addALToToFrontButton(e -> buttonToFront());
    }

    private void createALButtonRestartGame(){
        view.getGameOver().addALToRestartGameButton(e -> buttonRestartGame());
    }

    //Gameboard
    private void createALButtonGiveUp(){
        view.getGameBoard().addALToGiveUpButton(e -> buttonGiveUp());
    }

    //Start

    public void buttonStartGame(){
        view.goToPage(View.whichPage.GAMEBOARD);
    }

    public void buttonGameOver(){
        view.goToPage(View.whichPage.GAMEOVER);
    }


    //Game over
    public void buttonToFront(){
        view.goToPage(View.whichPage.START);
    }

    public void buttonRestartGame(){
        buttonStartGame();
    }

    //Gameboard
    public void buttonGiveUp(){
        buttonGameOver();
    }


    public int getFrameHeight() {
        return view.getFrameHeight();
    }

    public int getFrameWidth() {
        return view.getFrameWidth();
    }

}
