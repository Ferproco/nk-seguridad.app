package com.nkseguridad.app.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkseguridad.app.Entity.Kardex;
import com.nkseguridad.app.Repository.IKardexRepository;
import com.nkseguridad.app.Service.IKardexService;

@Service
public class KardexService implements IKardexService {

	@Autowired
	private IKardexRepository KardexRepository;
	
	@Override
	public List<Kardex> findAll() {
		// TODO Auto-generated method stub
		return (List<Kardex>)KardexRepository.findAll();
	}

}
