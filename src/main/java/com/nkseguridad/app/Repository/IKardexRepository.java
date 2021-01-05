package com.nkseguridad.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Kardex;

@Repository
public interface IKardexRepository extends CrudRepository<Kardex, Long> {

}
