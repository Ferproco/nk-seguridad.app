package com.nkseguridad.app.Service;

import java.util.List;

import com.nkseguridad.app.Entity.Caja;

public interface ICajaService {

	public List<Caja> findAll();
	public Caja findById(Long codigo);
	public Caja save(Caja caja);
	public Caja updaCaja(Caja caja);
	public boolean findByExisteId(Long codigo);
}
