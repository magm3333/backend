package com.coop.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coop.model.Producto;
import com.coop.model.persistence.ProductoRepository;

@Service
public class ProductoBusiness implements IProductoBusiness {

	@Autowired
	private ProductoRepository productoDAO;

	@Override
	public Producto load(long id) throws BusinessException, NotFoundException {
		Optional<Producto> o;
		try {
			o = productoDAO.findById(id);
		} catch (Exception e) {
			throw new BusinessException(e);
		}
		if (o.isPresent())
			return o.get();
		else
			throw new NotFoundException();
	}

	@Override
	public Producto add(Producto producto) throws BusinessException {

		try {
			return productoDAO.save(producto);
		} catch (Exception e) {
			throw new BusinessException(e);
		}

	}

	@Override
	public void delete(long id) throws BusinessException {
		try {
			productoDAO.deleteById(id);
		} catch (Exception e) {
			throw new BusinessException(e);
		}
	}

	@Override
	public Producto update(Producto producto) throws BusinessException {

		try {
			return productoDAO.save(producto);
		} catch (Exception e) {
			throw new BusinessException(e);
		}

	}

	@Override
	public List<Producto> list() throws BusinessException {
		try {
			return productoDAO.findAll();
		} catch (Exception e) {
			throw new BusinessException(e);
		}
	}

}
