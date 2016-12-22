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
    }

    public static void main(String[] args){
        //System.out.println("HEJ PHILIP du er dejlig!");
        //System.out.println("HEJ PHILIP jeg elsker dig!");


        control = new Controller();
    }

    private void createALButtonsStart() {
        view.getStart().addALToStartGameButton(e -> buttonStartGame());
    }

    public void buttonStartGame(){
    	
        view.goToPage(View.whichPage.GAMEBOARD);
        view.getStart().colorButton();
    }
}
