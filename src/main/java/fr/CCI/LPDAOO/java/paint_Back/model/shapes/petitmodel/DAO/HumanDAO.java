package fr.CCI.LPDAOO.java.paint_Back.model.shapes.petitmodel.DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import fr.CCI.LPDAOO.java.paint_Back.model.shapes.petitmodel.Human;


public interface HumanDAO extends JpaRepository<Human, Long> {
	
	
}
