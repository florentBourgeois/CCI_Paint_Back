package fr.CCI.LPDAOO.java.paint_Back.model.shapes;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.concurrent.TimeUnit;


public class SSquare extends Shape{
	
	private int x=0,y=0,width=1;
	private boolean isSelected = false;

	

	public SSquare() {
		//use default values for each field
	}

	public SSquare(Point origin, int length) {
		this.x = origin.x;
		this.y = origin.y;
		this.width = length;
	}
	
	
	
	
	public SSquare(Point origin, Point end) throws Exception {
		int width = end.x - origin.x;
		int height = end.y - origin.y;
		if (width == height) {
			this.x = origin.x;
			this.y = origin.y;
			this.width = width;
		}
		else {
			Exception e = new Exception("The two points does not form a square : width="+width+" height="+height);
			throw e;
		}
		
	}
	
	public SSquare(SSquare c) {
		// notice that it is possible to access to the private c.x because we are in the SSquare class  
		this.x = c.x;
		this.y = c.y;
		this.width = c.width;
	}
	


	public Point getLoc() {
		return new Point(x,y);
	}

	public void setLoc(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	public void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public Rectangle getBounds() {
		return new Rectangle(this.x, this.y, width, width);
	}
	
	
	public String toString() {
		/*
		String s = "Square : location=";
		s+= this.x + "|" + this.y;
		s+=" ; width=" + this.width;
		s+=" ; " + "isSelected=" + this.isSelected();
		return s;
		// notice that string concatenation as performed here is a bad practice (memory consumption is massive)
		//*/
		StringBuffer sb = new StringBuffer();
		sb.append("Square : location=").append(this.x).append("|").append(this.y).append(" ; ")
			.append("width=").append(this.width).append(" ; ")
			.append(super.toString());
		return sb.toString();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
	// cas sans erreur
		// création des variables pour stocker le résultat.
		// elles doivent être initialisées pour permettre l'affichage dans les sysout à la fin.
		SSquare sGood = new SSquare(), sBad = new SSquare(); 
		try {
			System.out.println("est toujours exécuté");
			sGood = new SSquare(new Point(), new Point(4, 4));
			System.out.println("n'est executé que si la creation du carré ne fait pas d'exception");
		} catch (Exception e) {
			System.out.println("est executé si l'exception a été atrappé");
			e.printStackTrace();
		}
		
		System.out.println("est executé si l'exception a été atrappé ou qu'il n'y a pas eu d'exception");
		
		
		System.out.println("\n seconde phase (avec erreur) ");
		try {
			System.out.println("est toujours exécuté");
			sBad = new SSquare(new Point(), new Point(2, 4));
			System.out.println("n'est executé que si la creation du carré ne fait pas d'exception");
		} catch (Exception e) {
			System.out.println("est executé si l'exception a été atrappé");
			e.printStackTrace();
		}
		
		TimeUnit.SECONDS.sleep(1);
		System.out.println("est executé si l'exception a été atrappé ou qu'il n'y a pas eu d'exception");
		
		System.out.println("\nau final sGood fonctionne : ");
		System.out.println(sGood);
		System.out.println("et sbad est resté un Square par défaut () : ");
		System.out.println(sBad);
	// cas avec erreur
	}
	
}
