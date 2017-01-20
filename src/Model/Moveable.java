package Model;


public class Moveable {
	 private int speedBall;
	 private Vector2D position;
	 private Vector2D direction; 
	 
	 public Moveable(Vector2D position){
		 this.position = position;
	 }
	 
	 public void setSpeedBall(int speedBall){
		 this.speedBall = speedBall;
	 }
	 
	 public int getSpeedBall(){
		 return this.speedBall;
	 }
	 
	 public void setPosition(Vector2D position){
		 this.position = position;
	 }
	 
	 public Vector2D getPosition(){
		 return this.position;
	 }
	 
	 public void setDirection(Vector2D direction){
		 this.direction = direction;
	 }
	 
	 public Vector2D getDirection(){
		 return this.direction;
	 }

}
