package com.coop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BackendApplication extends SpringBootServletInitializer implements CommandLineRunner{

	public static void main(String[] args) {
		
		SpringApplication.run(BackendApplication.class, args);
		
	}

	//@Autowired
	//private ProductoRepository productoDAO;
	@Override
	public void run(String... args) throws Exception {
	/*
		Producto p1=new Producto();
		p1.setId(97);
		p1.setPrecio(45.56);
		p1.setProducto("Arroz");
		p1.setFechaVencimiento(new Date());
		System.out.println(p1.getId());
	
		p1=productoDAO.save(p1);
	
	
		System.out.println(p1.getId());
		*/
	}

}
