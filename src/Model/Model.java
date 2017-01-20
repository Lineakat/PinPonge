package Model;

import java.awt.Color;

/**
 * Created by Linea on 18/12/2016.
 */
public class Model {
	
    public Vector2D stickPosition;
    public int lengthStick;
    public int widthStick;
    public Stick stick;
    public Moveable moveable;
    public EdgeBounce edgeBounce;
    public EdgeDie edgeDie;


    //Constructor
    public Model(int width, int height){
        lengthStick = 30; //skal ændres
        widthStick = 5; //skal ændres
        stickPosition = new Vector2D(2,2); //skal ændres
        stick = new Stick(lengthStick, widthStick, stickPosition);
        
        moveable = new Ball(40, new Vector2D((double)width/2, (double)height/2), Color.BLACK);
        
        //ball = new Ball(); //kan ikke lave endnu
        edgeBounce = new EdgeBounce();
        edgeDie = new EdgeDie();
    }

    public Stick getStick() {
        return stick;
    }

    public Vector2D getStickPosition() {
        return stickPosition;
    }

    /*
    public Ball getBall() {
        return ball;
    }
    */

    public EdgeBounce getEdgeBounce() {
        return edgeBounce;
    }

    public EdgeDie getEdgeDie() {
        return edgeDie;
    }
    
   public Moveable getMoveable(){
	   return this.moveable;
   }

	
}
