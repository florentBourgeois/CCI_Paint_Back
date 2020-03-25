package fr.CCI.LPDAOO.java.paint_Back.web.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapesController {

	
	
    @GetMapping(value = "/test")
    public String getHello() {
    	return "hello world how are you ?  ";
    }
}
