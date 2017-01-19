import View.*;

/**
 * Created by Linea og philip on 18/12/2016.
 */
public class Controller {
    //private Model model;
    private static View view;
	private static Controller control;

    //Constructor
    public Controller() {
        view = new View();
        createALButtonsStart();
        createALButtonGameOver();
        createALButtonToFront();
        createALButtonRestartGame();
    }

    public static void main(String[] args){
        //System.out.println("HEJ PHILIP du er dejlig!");
        //System.out.println("HEJ PHILIP jeg elsker dig!");


        control = new Controller();
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

    //Start

    public void buttonStartGame(){
        view.goToPage(View.whichPage.GAMEBOARD);
        view.getStart().colorButton();
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

}
