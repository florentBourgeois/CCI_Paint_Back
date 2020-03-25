package fr.CCI.LPDAOO.java.paint_Back.model.shapes;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;


public class SConstruction extends Shape {
	
	private ArrayList<Shape> shapes; 
	
	public ArrayList<Shape> getShapes() {
		return this.shapes;
	}

	public SConstruction() {
		this.shapes = new ArrayList<Shape>();
	}
	
	public void addShape(Shape s) {
		shapes.add(s);
	}
	
	public static void main(String[] args) {
		SSquare s = new SSquare(new Point(20,30), 50);
		SSquare s2 = new SSquare(new Point(2,3), 5);
		SCircle c = new SCircle(new Point(100, 100), 10);
		
		SConstruction superShape = new SConstruction();
		superShape.addShape(s);
		superShape.addShape(s2);
		superShape.addShape(c);
		superShape.print();
		
		System.out.println("localisation : " + superShape.getLoc());
		
		System.out.println("\n\n-----\ntraslate\n-----");
		superShape.setLoc(new Point(10, 10));
		superShape.print();
		
		System.out.println("localisation : " + superShape.getLoc());
		
	}
	
	
	@Override
	public Point getLoc() {
		if (shapes.size() == 0) {
			return new Point();
		}
		
		int maxX = 9999;
		int maxY = 9999;
		for (Iterator<Shape> it = shapes.iterator(); it.hasNext();) {
			Shape shape = (Shape) it.next();
			if (shape.getBounds().x < maxX) {
				maxX = shape.getBounds().x;
			}
			if (shape.getBounds().y < maxY) {
				maxY = shape.getBounds().y;
			}
		}
		return new Point(maxX, maxY);
	}

	@Override
	public void setLoc(Point p) {
		//il faut calculer la position du nouveau point par rapport à la position actuelle pour ensuite déplacer toutes les formes de cette distance
		Point currentLoc = this.getLoc();
		int dx = p.x - currentLoc.x;  
		int dy = p.y - currentLoc.y;

		this.translate(dx, dy);
	}

	@Override
	public void translate(int dx, int dy) {
		// translater toutes les formes contenues
		for (Shape shape : shapes) {
			shape.translate(dx, dy);
		}

	}

	@Override
	public Rectangle getBounds() {
		if (shapes.size() == 0) {
			return new Rectangle(0,0,0,0);
		}
		
		
		Point loc = this.getLoc();  // stocké dans une variable pour éviter de le calculer à chaque besoin
		// il faut calculer la position du endpoint (le point le plus en bas à droite de l'ensemble des formes. pour cela on peut demander les bounds de chaque forme
		int endX = -9999;
		int endY = -9999;
		
		for (Shape shape : shapes) {
			Rectangle r = shape.getBounds();
			if(r.x + r.width > endX)
				endX = r.x+r.width;   // la position la plus à droite est le x du start point plus la width du rectangle
			if(r.getMaxY() > endY) 
				endY = (int)r.getMaxY();   // le rectangle offre une méthode pour retourner cette valeur
		}

		int rWidth = endX-loc.x;  
		int rHeight = endY-loc.y;
		
		return new Rectangle(loc.x, loc.y, rWidth, rHeight);
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Assemblage : ").append(super.toString());
		for (Shape shape : shapes) {
			sb.append("\n\t").append(shape.toString());
		}
		
		return sb.toString();
	}

}
