import View.View;

/**
 * Created by Linea on 18/12/2016.
 */
public class Controller {
    //private Model model;
    private static View view;

    //Constructor
    public Controller() {
        //view = new View();
        createALButtonsStart();
    }

    public static void main(String[] args){
        //System.out.println("HEJ PHILIP du er dejlig!");
        //System.out.println("HEJ PHILIP jeg elsker dig!");


        view = new View();
    }

    private void createALButtonsStart() {
        view.getStart().addALToStartGameButton(e -> System.out.println("jep"));
    }

    public void buttonStartGame(){
    	
        view.goToPage(View.whichPage.GAMEBOARD);
        view.getStart().colorButton();
    }
}
