package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Articulo;

@Repository
public interface IArticuloRepository extends CrudRepository<Articulo,Long> {

}
