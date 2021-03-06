package fr.CCI.LPDAOO.java.paint_Back.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.CCI.LPDAOO.java.paint_Back.model.shapes.SPixel;
import fr.CCI.LPDAOO.java.paint_Back.model.shapes.petitmodel.Human;

@RestController
public class PixelController {

	
	@GetMapping(value = "/pouik")
	public Human nimporteQuoiCommeNom() {
		Human p = new Human();
		p.setAge(20);
		p.setName("fred");
		System.out.println(p);
		return p;
	}

	
	@PostMapping(value = "/pouik")
	public ResponseEntity<Human> postPouik(@RequestBody Human p) {
		if(p.getAge() > 20) {
			 return ResponseEntity.badRequest().build();
		}
		else {
			System.out.println(p);
			p.setAge(p.getAge()+1);
			p.setName("posted" + p.getName());
			
			return ResponseEntity.ok().body(p);
		}
	}
	
	
}
