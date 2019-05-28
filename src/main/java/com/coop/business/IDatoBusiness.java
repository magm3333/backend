package com.coop.business;

import java.util.List;

import com.coop.model.Dato;

public interface IDatoBusiness {
	public Dato save(Dato dato) throws BusinessException;

	public Dato load(long id) throws BusinessException, NotFoundException;

	public void delete(long id) throws BusinessException;

	public List<Dato> listByTopic(String topico) throws BusinessException;

}
