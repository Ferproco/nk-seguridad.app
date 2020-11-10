package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Contacto;

import com.nkseguridad.app.Repository.IContactoRepository;
import com.nkseguridad.app.Service.IContactoService;

@Service
public class ContactoService implements IContactoService {

	
	@Autowired
	private IContactoRepository contactoRepository;
	
	@Override
	public List<Contacto> findAll() {
		// TODO Auto-generated method stub
		return (List<Contacto>)contactoRepository.findAll();
	}

}
