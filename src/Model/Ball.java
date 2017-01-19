package Model;

import java.awt.Point;

/**
 * Created by Linea on 18/12/2016.
 */
public class Ball extends Moveable {
    //Felter
    private int diameterBall;
    private String colorBall;

    //Constructor
    public Ball(int diameterBall, Point pointBall, String colorBall){
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

    

    public String getColorBall() {
        return colorBall;
    }

    public void setColorBall(String colorBall) {
        this.colorBall = colorBall;
    }

}
