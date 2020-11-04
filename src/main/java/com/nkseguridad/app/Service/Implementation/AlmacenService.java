package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Almacen;
import com.nkseguridad.app.Repository.IAlmacenRepository;
import com.nkseguridad.app.Service.IAlmacenService;



@Service
public class AlmacenService implements IAlmacenService {
	
	@Autowired
	private IAlmacenRepository almacenRepository;
	
	@Override
	public List<Almacen> findAll() {
		// TODO Auto-generated method stub
		return (List<Almacen>)almacenRepository.findAll();
	}

	@Override
	public Almacen save(Almacen almacen) {
		// TODO Auto-generated method stub
		return almacenRepository.save(almacen);
	}

	@Override
	public boolean findByExisteCodigo(Long id) {
		// TODO Auto-generated method stub
		return false;
	}


}
