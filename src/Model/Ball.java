package Model;

import java.awt.Color;
import java.awt.Point;

/**
 * Created by Linea on 18/12/2016.
 */
public class Ball extends Moveable {
    //Felter
    private int diameterBall;
    private Color colorBall;

    //Constructor
    public Ball(int diameterBall, Vector2D pointBall, Color colorBall){
    	super(pointBall);
        this.diameterBall = diameterBall;
        this.colorBall = colorBall;
    }

   //Getter og setter metoder
   public int getDiameterBall() {
       return diameterBall;
   }

    public void setDiameterBall(int diameterBall) {
        this.diameterBall = diameterBall;
    }

    

    public Color getColorBall() {
        return colorBall;
    }

    public void setColorBall(Color colorBall) {
        this.colorBall = colorBall;
    }

}
