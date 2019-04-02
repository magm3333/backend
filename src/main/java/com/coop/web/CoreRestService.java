package com.coop.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constantes.URL_CORE)
@PropertySource({"classpath:version.properties"})
public class CoreRestService {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Value("${app.version}")
	private String version;
	
	@GetMapping("/version")
	public ResponseEntity<String> version() {
		return new ResponseEntity<String>(version,HttpStatus.OK);
	}
}
