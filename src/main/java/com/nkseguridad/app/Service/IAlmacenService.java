package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Almacen;

public interface IAlmacenService {

	public List<Almacen> findAll();
	public Almacen save(Almacen almacen);
	public boolean findByExisteCodigo(Long id);
}
