package com.coop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coop.business.BusinessException;
import com.coop.business.IProductoBusiness;
import com.coop.model.Producto;

@RestController
public class ProductosRestService {

	@Autowired
	private IProductoBusiness productoBusiness;
	@GetMapping("/productos")
	public ResponseEntity<List<Producto>> list() {
		try {
			return new ResponseEntity<List<Producto>>
				(productoBusiness.list(), HttpStatus.OK);
		} catch (BusinessException e) {
			return new ResponseEntity<List<Producto>>
				( HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
