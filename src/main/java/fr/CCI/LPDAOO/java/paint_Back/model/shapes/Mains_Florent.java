package fr.CCI.LPDAOO.java.paint_Back.model.shapes;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;

public class Mains_Florent {

	public static void main(String[] args) {

		Shape s = new SPixel();
		s.print();
		s.translate(10, 40);
		s.select();
		s.print();
		
		s = new SCircle();
		s.print();
		s = new SRectangle();
		s.print();
		
		Collection<Shape> shapes = new ArrayList<>();
		shapes.add(new SPixel());
		shapes.add(new SRectangle());
		shapes.add(new SRectangle(987, 12, 30, 1));
		shapes.add(new SPixel(20, 20));

		
		shapes.add(new SCircle());
		shapes.add(new SPixel(10, 10));
		shapes.add(new SCircle(new Point(100,20), 20));
		
		shapes.add(new SSquare(new Point(30, 30), 100));
		shapes.add(new SSquare());
		shapes.add(new SPixel(100, 10));


		System.out.println("\n\n");

		for (Shape shape : shapes) {
			shape.print();
		}
		
		
		System.out.println("\n\nOnly loc.x > 30");
		shapes.stream().filter(x -> x.getLoc().x > 30 ).forEach(y -> y.print());

		System.out.println("\n\nOnly pixels");
		shapes.stream().filter(x -> x.getClass() == SPixel.class ).forEach(y -> y.print());

	}

}
