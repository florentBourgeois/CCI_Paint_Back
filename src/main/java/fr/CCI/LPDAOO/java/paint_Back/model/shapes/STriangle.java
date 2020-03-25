
package fr.CCI.LPDAOO.java.paint_Back.model.shapes;


import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public class STriangle extends Shape
{
	
	private int[] xs = new int[] {1, 5, 10};
	private int[] ys = new int[] {1, 5, 10};

	public STriangle() {
		xs = new int[] {1, 5, 10};
		
	}
	
	
	public STriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.xs[0] = x1;
		this.ys[0] = y1;
		this.xs[1] = x2;
		this.ys[1] = y2;
		this.xs[2] = x3;
		this.ys[2] = y3;
	}

	
	public STriangle (STriangle T) {
		this.xs[0]=T.xs[0];
		this.xs[1]=T.xs[1];
		this.xs[2]=T.xs[2];
		this.ys[0]=T.ys[0];
		this.ys[1]=T.ys[1];
		this.ys[2]=T.ys[2];
	}
	
	private Point findTopLeft() {
		int x = 9999;
		int y = 9999;
		for(int i=0; i<3; i++) {
			if(x > this.xs[i]) x= this.xs[i];
			if(y > this.xs[y]) x= this.xs[y];
		}
		return new Point(x, y);
	}
	
	private Point findBottomRight() {
		int x = 0;
		int y = 0;
		for(int i=0; i<3; i++) {
			if(x < this.xs[i]) x= this.xs[i];
			if(y < this.xs[y]) x= this.xs[y];
		}
		return new Point(x, y);
	}
	
	public Point getLoc() {
		return this.findTopLeft();
	}
	
	@Override
	public void setLoc(Point p) {
		Point currentLoc = this.findTopLeft();
		int dx = currentLoc.x - p.x;
		int dy = currentLoc.y - p.y;
		this.translate(dx, dy);
	}


	@Override
	public void translate(int dx, int dy) {
		for(int i=0; i<3; i++) {
			this.xs[i] += dx;
			this.ys[i] += dy;
		}
	}


	@Override
	public Rectangle getBounds() {
		Point topLeft = this.findTopLeft();
		Point bottomRight = this.findBottomRight();
		int width = bottomRight.x - topLeft.x;
		int height = bottomRight.y - topLeft.y;
		return new Rectangle(this.findTopLeft(), new Dimension(width, height));
	}
		

}
