package com.nkseguridad.app.Mapper;

import org.springframework.stereotype.Component;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Model.MArticuloKardex;

@Component("mapper")
public class MapperArticuloKardex {

	public static MArticuloKardex convertirArticuloKardex(Articulo articulo){		
		return new MArticuloKardex(articulo);		
	}
}
