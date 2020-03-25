package fr.CCI.LPDAOO.java.paint_Back.model.shapes;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public class SCircle extends Shape {

	private Point center;
	private int radius;
	
	public SCircle() {
		this.radius = 1;
		this.center = new Point(0, 0);
	}

	public SCircle(SCircle c) {
		this.center = new Point(c.center);
		this.radius = c.radius;
	}

	public SCircle(int r, Point origin) {
		this.radius = Math.abs(r);
		this.center = origin;
	}

	public SCircle(Point p, int radius) {
		this.center = p ;
		this.radius = Math.abs(radius);
	}

	public Point getLoc() {
		return this.center;
	}

	public void setLoc(Point point) {
		this.center = point;
	}
	
	@Override
	public void translate(int dx, int dy) {
		this.center.x += dx;
		this.center.y += dy;
	}


	public Rectangle getBounds() {
		int x = center.x-radius;
		int y = center.y-radius;
		int width= 2*radius;
		return new Rectangle(x, y, width, width);

	
	}
	/**
	 *  function which return un objet as a String
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Circle : location=" + this.center.x +"|" +this.center.y + " ; radius=" + this.radius + " ; " +super.toString());
		return sb.toString();
	}

	

}
