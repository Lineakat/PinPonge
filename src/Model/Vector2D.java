package Model;

public class Vector2D {
	private double x;
	private double y;
	
	public Vector2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public Vector2D add(Vector2D other) {
		return new Vector2D(this.x + other.getX(), this.y + other.getY());
	}
	
}
