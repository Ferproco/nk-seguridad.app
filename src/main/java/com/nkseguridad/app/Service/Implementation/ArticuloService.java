package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Cliente;
import com.nkseguridad.app.Repository.IArticuloRepository;
import com.nkseguridad.app.Service.IArticuloService;

@Service
public class ArticuloService implements IArticuloService {

	@Autowired
	private IArticuloRepository articuloRepository;
	
	@Override
	public List<Articulo> findAll() {
		// TODO Auto-generated method stub
		return (List<Articulo>)articuloRepository.findAll();
	}

	@Override
	public Articulo save(Articulo articulo) {
		// TODO Auto-generated method stub
		return articuloRepository.save(articulo);
	}

	@Override
	public boolean findByExisteCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Articulo findByCodigo(Long id) {
		// TODO Auto-generated method stub
		return articuloRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Articulo articulo) {
		// TODO Auto-generated method stub
		articuloRepository.delete(articulo);
		
	}

}
