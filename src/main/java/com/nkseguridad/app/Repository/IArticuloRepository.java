package com.nkseguridad.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Contacto;

@Repository
public interface IArticuloRepository extends CrudRepository<Articulo,Long> {
	
	List<Articulo> findByCodtipoproducto(Long Tipo);

}
