package Model;

import java.awt.Point;

/**
 * Created by Philip on 18/12/2016.
 */
public class Stick {
	private int lengthStick;
	private int widthStick;
	private Vector2D stickPosition;

	public Stick(int lengthStick, int widthStick, Vector2D stickPosition){
		this.lengthStick = lengthStick;
		this.widthStick = widthStick;
		this.stickPosition = stickPosition;
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
	
	public void setStickPosition(Vector2D stickPosition){
		this.stickPosition = stickPosition;
	}
	
	public Vector2D getStickPosition(){
		return this.stickPosition;
	}
	

	
}