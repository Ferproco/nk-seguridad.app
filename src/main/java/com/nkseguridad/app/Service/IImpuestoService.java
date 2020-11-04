package com.nkseguridad.app.Service;

import java.util.List;


import com.nkseguridad.app.Entity.Impuesto;

public interface IImpuestoService {
	public List<Impuesto> findAll();
	public Impuesto save(Impuesto impuesto);
	public boolean findByExisteCodigo(Long codigo);
}
