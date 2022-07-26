package ar.edu.davinci.dvds20211cg9.controller.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.davinci.dvds20211cg9.controller.TiendaAppRest;
import ar.edu.davinci.dvds20211cg9.domain.Prenda;
import ar.edu.davinci.dvds20211cg9.service.PrendaService;

@RestController
public class PrendaControllerRest extends TiendaAppRest {
	
	private final Logger LOGGER = LoggerFactory.getLogger(PrendaControllerRest.class);	

	@Autowired
	private PrendaService service;
	
	/**
	 * Listar todos
	 */
	@GetMapping(path = "/prendas/all")
	public List<Prenda> getList() {
		LOGGER.info("Lista todas las prendas");
		
		return service.list();
		
	}

}
