package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Almacen;

@Repository
public interface IAlmacenRepository extends CrudRepository<Almacen,Long>{

	
}
