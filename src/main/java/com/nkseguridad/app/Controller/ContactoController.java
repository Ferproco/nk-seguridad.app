package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.nkseguridad.app.Entity.Contacto;

import com.nkseguridad.app.Service.IContactoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("api")
public class ContactoController {
	@Autowired
	private IContactoService contactoServicio;
	
	@GetMapping("contacto")
	public ResponseEntity<?> ListarContactos(){
		List<Contacto> LstContactos = contactoServicio.findAll();
		if (LstContactos!=null) {
			if (LstContactos.size()!=0) {
				return new ResponseEntity<>(LstContactos,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}

}
