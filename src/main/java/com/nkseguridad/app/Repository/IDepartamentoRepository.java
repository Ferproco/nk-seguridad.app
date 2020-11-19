package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Departamento;

@Repository
public interface IDepartamentoRepository extends CrudRepository<Departamento, Long> {

	
}
