package Model;

import java.awt.Point;

/**
 * Created by Philip on 18/12/2016.
 */
public class Stick {
	private int lengthStick;
	private int widthStick;
	private Point pointStick;

	public Stick(int lengthStick, int widthStick, Point pointStick){
		this.lengthStick = lengthStick;
		this.widthStick = widthStick;
		this.pointStick = pointStick;
	}
	
	public void setLengthStick(int lengthStick){
		this.lengthStick = lengthStick;
	}
	
	public int getLengthStick(){
		return this.lengthStick;
	}
	
	public void setWidthStick(int widthStick){
		this.widthStick = widthStick;
	}
	
	public int getWidthStick(){
		return this.widthStick;
	}
	
	public void setPointStick(Point pointStick){
		this.pointStick = pointStick;
	}
	
	public Point getPointStick(){
		return this.pointStick;
	}
	

	
}