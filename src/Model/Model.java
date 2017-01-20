package Model;

/**
 * Created by Linea on 18/12/2016.
 */
public class Model {

    public Vector2D stickPosition;
    public int lengthStick;
    public int widthStick;
    public Stick stick;
    public Ball ball;
    public EdgeBounce edgeBounce;
    public EdgeDie edgeDie;


    //Constructor
    public Model(){
        lengthStick = 30; //skal ændres
        widthStick = 5; //skal ændres
        stickPosition = new Vector2D(2,2); //skal ændres
        stick = new Stick(lengthStick, widthStick, stickPosition);

        //ball = new Ball(); //kan ikke lave endnu
        edgeBounce = new EdgeBounce();
        edgeDie = new EdgeDie();


    }


	
}
