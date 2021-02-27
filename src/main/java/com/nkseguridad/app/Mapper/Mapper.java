package com.nkseguridad.app.Mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nkseguridad.app.Entity.Kardex;
import com.nkseguridad.app.Model.MKardex;
import com.nkseguridad.app.Service.IArticuloService;

@Component("mapper")
public class Mapper {
	
	
	public static MKardex convertirKardex(Kardex kardex){		
		return new MKardex(kardex);		
	}

}
