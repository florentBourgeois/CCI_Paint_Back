package fr.CCI.LPDAOO.java.paint_Back.web.controller;

import java.awt.Point;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonController {

	@GetMapping(value = "/hello")
	public String helloWorld() {
		return "hello world";
	}
	
	
	
	@GetMapping(value = "/hello2")
	public ArrayList<Point> helloWorld2() {
		ArrayList<Point> points = new ArrayList<>();
		
		points.add(new Point());
		points.add(new Point(10,30));
		points.add(new Point(302,12345));
		
		
		return points;
	}
	
	
	
}
