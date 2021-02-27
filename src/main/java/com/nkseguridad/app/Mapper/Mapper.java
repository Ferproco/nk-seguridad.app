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
	
	
	
	public static List<MKardex> convertirKardex(List<Kardex> kadexList, IArticuloService IarticuloService){
		
		List<MKardex> lstKardexMapper = new ArrayList<>();
		for (Kardex kardex: kadexList) {
			try {
				kardex.setArticulo(IarticuloService.findById(kardex.getArticulo_id()));
			}
			catch(Exception e){
				System.out.print(e);
			}
			lstKardexMapper.add(new MKardex(kardex));
		}
		return lstKardexMapper;
		
	}

}
