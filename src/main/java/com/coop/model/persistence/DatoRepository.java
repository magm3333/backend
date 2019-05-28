package com.coop.model.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coop.model.Dato;

@Repository
public interface DatoRepository extends JpaRepository<Dato, Long> {
	public List<Dato> findByTopicoOrderByTiempoDesc(String topico);
}
