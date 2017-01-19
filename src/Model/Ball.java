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
    public Ball(int diameterBall, int speedBall, Point pointBall, String colorBall){
        this.diameterBall = diameterBall;
        this.speedBall = speedBall;
        this.pointBall = pointBall;
        this.colorBall = colorBall;
    }

   //Getter og setter metoder
   public int getDiameterBall() {
       return diameterBall;
   }

    public void setDiameterBall(int diameterBall) {
        this.diameterBall = diameterBall;
    }

    public int getSpeedBall() {
        return speedBall;
    }

    public void setSpeedBall(int speedBall) {
        this.speedBall = speedBall;
    }

    public Point getPointBall() {
        return pointBall;
    }

    public void setPointBall(Point pointBall) {
        this.pointBall = pointBall;
    }

    public String getColorBall() {
        return colorBall;
    }

    public void setColorBall(String colorBall) {
        this.colorBall = colorBall;
    }

}
