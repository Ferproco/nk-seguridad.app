package com.nkseguridad.app.Mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nkseguridad.app.Entity.Kardex;
import com.nkseguridad.app.Model.MKardex;

@Component("mapper")
public class Mapper {
	
	public static List<MKardex> convertirKardex(List<Kardex> kadexList){
		
		List<MKardex> lstKardexMapper = new ArrayList<>();
		for (Kardex kardex: kadexList) {
			lstKardexMapper.add(new MKardex(kardex));
		}
		return lstKardexMapper;
		
	}

}
