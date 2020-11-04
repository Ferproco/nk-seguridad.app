package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Almacen;
import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Service.IAlmacenService;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("api")
public class AlmacenController {
	@Autowired
	private IAlmacenService almacenServicio;
	
	@GetMapping("almacen")
	public ResponseEntity<?> ListarAlmacenes(){
		List<Almacen> LstAlmacenes = almacenServicio.findAll();
		if (LstAlmacenes!=null) {
			if (LstAlmacenes.size()!=0) {
				return new ResponseEntity<>(LstAlmacenes,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	@PostMapping("almacen")
	public ResponseEntity<?> GuardarAlmacen(@RequestBody Almacen almacen) {
		if (!almacenServicio.findByExisteCodigo(almacen.getIdalmacen())) {
			Almacen AlmacenObj = almacenServicio.save(almacen);
			return new ResponseEntity<>(AlmacenObj, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

	}

}
