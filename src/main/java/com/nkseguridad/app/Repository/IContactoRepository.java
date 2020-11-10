package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Contacto;

@Repository
public interface IContactoRepository extends CrudRepository<Contacto,Long>{

}
