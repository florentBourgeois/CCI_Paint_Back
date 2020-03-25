package fr.CCI.LPDAOO.java.paint_Back;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;

import fr.CCI.LPDAOO.java.paint_Back.model.shapes.petitmodel.Human;
import fr.CCI.LPDAOO.java.paint_Back.model.shapes.petitmodel.DAO.HumanDAO;

@SpringBootApplication
public class PaintBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaintBackApplication.class, args);
	}
	
	
	
	@Bean
	CommandLineRunner createHumans(HumanDAO repo) {
		return args -> {
			Faker f = new Faker();
			
			for(int i = 0; i<100; i++) {
				String name = f.harryPotter().character();
				Human h = new Human();
				h.setAge((int) (Math.random()*100));
				h.setName(name);
				repo.save(h);
			}	
		};
	}
}
