package tn.esprit.spring.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerlog4j {
	private static final Logger LOG =LogManager.getLogger(Controllerlog4j.class);
	@GetMapping(value="/greeting")
	public String Greeting() {
		LOG.debug("Debbuging log ");
		LOG.info("info log");
		LOG.warn("warning log");
		LOG.error("error log");
		LOG.fatal("fatal error. Please fix me");
		return "hello!!";
	}
	

}
