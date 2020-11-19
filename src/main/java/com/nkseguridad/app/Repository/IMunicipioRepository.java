package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Municipio;

@Repository
public interface IMunicipioRepository extends CrudRepository<Municipio, Long> {

}
