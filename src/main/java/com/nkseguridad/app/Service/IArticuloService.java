package com.nkseguridad.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Impuesto;

public interface IArticuloService {
 
	public List<Articulo> findAll();
	public Articulo save(Articulo articulo);
	public boolean findByExisteCodigo(Long codigo);
}
