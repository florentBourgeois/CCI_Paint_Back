package fr.CCI.LPDAOO.java.paint_Back.model.shapes;

import java.awt.Point;
import java.awt.Rectangle;


public class SPixel extends Shape{
	
	private boolean isSelected = false;

	// déclaration des coordonées et définition de leurs valeurs par défaut
	private int x=0, y=0;

	public SPixel() {
	}
	
	public SPixel(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public SPixel(Point p) {
		this.x = (int)p.getX();
		this.y = (int)p.getY();
	}

	public Point getLoc() {
		return new Point(this.x, this.y);
	}

	public void setLoc(Point p) {
		this.x = (int)p.getX();
		this.y = (int)p.getY();
	}

	public void translate(int dx, int dy) {
		this.x = this.x+dx;
		this.y = this.y+dy;
	}

	public Rectangle getBounds() {
		return new Rectangle(this.x, this.y, 1, 1);
	}
	
	
	
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Pixel : ");
		sb.append((int)this.x).append("|").append((int)this.y);
		sb.append(" ; ").append(super.toString());
		return sb.toString();
	}
	

	
	
	public static void main(String[] args) {
		System.out.println(new SPixel());
	}

}
