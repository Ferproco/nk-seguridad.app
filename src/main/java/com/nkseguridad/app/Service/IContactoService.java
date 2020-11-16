package com.nkseguridad.app.Service;

import java.util.List;


import com.nkseguridad.app.Entity.Contacto;

public interface IContactoService {
	public List<Contacto> findAll();
	public Contacto findByNumeroIdentificacion(String numero);
	public Contacto save(Contacto contacto);

}
