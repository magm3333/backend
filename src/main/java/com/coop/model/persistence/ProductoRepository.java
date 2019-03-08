package com.coop.model.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coop.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

	public List<Producto> findByProductoLike(String parteDelNombre);

	public List<Producto> findByPrecioBetween(double precioDesde, double precioHasta);

}
