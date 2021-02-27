package com.nkseguridad.app.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Kardex;
import com.nkseguridad.app.Mapper.Mapper;
import com.nkseguridad.app.Model.MKardex;
import com.nkseguridad.app.Service.IArticuloService;
import com.nkseguridad.app.Service.IKardexService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")

public class KardexController {

	@Autowired
	private IKardexService IKardexService;
	
	@Autowired
	private IArticuloService IArticuloService;

	@GetMapping("kardex")
	public ResponseEntity<?> ListarMovimientos() {
		List<Kardex> LstKardex = IKardexService.findAll();
		List<Kardex> lstKardexOut= new ArrayList<>();
		if (LstKardex != null) {
			if (LstKardex.size() != 0) {
				List<MKardex> LstMapperKardex = new ArrayList<>();
				LstMapperKardex = Mapper.convertirKardex(LstKardex);
				return new ResponseEntity<>(LstMapperKardex, HttpStatus.OK);
			} 
			else
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} 
		else
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

}
