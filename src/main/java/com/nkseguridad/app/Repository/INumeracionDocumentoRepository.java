package com.nkseguridad.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.NumeracionDocumento;

@Repository
public interface INumeracionDocumentoRepository extends CrudRepository<NumeracionDocumento,Long> {

	List<NumeracionDocumento> findByCodtipodocumento(Long Tipo);
}
