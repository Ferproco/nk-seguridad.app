package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.TipoIdentificacion;

@Repository
public interface ITipoIdentificacionRepository  extends CrudRepository<TipoIdentificacion,Long>{

}
