package fr.CCI.LPDAOO.java.paint_Back.model.shapes;

import java.awt.Point;
import java.awt.Rectangle;

public class SRectangle extends Shape{
	
	private int x=1, y=1, width=2, height=4;
	
	public SRectangle() {
		
	}
	
	public SRectangle (SRectangle rectangle) {
		
		this.x = rectangle.x;
		this.y = rectangle.y;
		this.width = rectangle.width;
		this.height = rectangle.height;
	}
	
	public SRectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public SRectangle(Point point, Point point2) {
		this.x = point.x;
		this.y = point.y;
		if(point2.x >= point.x) {
			this.width = point2.x - point.x;
		} else {
			this.width = point.x - point2.x;
		}
		
		if(point2.y >= point.y) {
			this.height = point2.y - point.y;
		} else {
			this.height = point.y - point2.y;
		}
	}

	public SRectangle(Point point, int i, int j) {
		this.x = point.x;
		this.y = point.y;
		this.width = i;
		this.height = j;
	}

	public void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public void setLoc(Point position) {
		this.x = position.x;
		this.y = position.y;
	}
	
	public Point getLoc () {
		return new Point(this.x, this.y);
	}


// class + function (m�thode)
	public Rectangle getBounds() {
		//calculer les bords du rectangle
		
		return new Rectangle(x, y, width, height);
		
	}


	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Rectangle : startPoint=").append(this.x).append("|").append(this.y).append(" ; endPoint=").append(this.x + this.width).append("|").append(this.y + this.height).append(" ; ").append(super.toString());
		return sb.toString();
	}

	
}
