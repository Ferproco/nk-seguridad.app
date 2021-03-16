package com.nkseguridad.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Contacto;
import com.nkseguridad.app.Entity.Kardex;

@Repository
public interface IArticuloRepository extends CrudRepository<Articulo,Long> {
	
	List<Articulo> findByCodtipoproducto(Long Tipo);
	Articulo findByCodigo(String codigo);
	
	//SELECT DISTINCT p FROM Department d JOIN d.employees e JOIN e.projects p
	//@Query("select ar from Articulo a JOIN a.lstmovimientoskardex ar")
	@Query("Select DISTINCT a from Articulo a inner join Kardex k on a.id=k.articulo_id")
	public List<Articulo> findAllFilterProducto();
	
}
