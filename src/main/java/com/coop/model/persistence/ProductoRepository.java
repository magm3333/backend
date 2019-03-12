package com.coop.model.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coop.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

	
	//https://docs.spring.io/spring-data/jpa/docs/2.1.3.RELEASE/reference/html/#repositories.query-methods.details (ver Table 3. Supported keywords inside method names)
	public List<Producto> findByProductoLike(String parteDelNombre);

	public List<Producto> findByPrecioBetween(double precioDesde, double precioHasta);

}
