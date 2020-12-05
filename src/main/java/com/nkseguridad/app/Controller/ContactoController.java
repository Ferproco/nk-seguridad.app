package com.nkseguridad.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.nkseguridad.app.Entity.Contacto;
import com.nkseguridad.app.Entity.FormaPago;
import com.nkseguridad.app.Service.IContactoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class ContactoController {
	@Autowired
	private IContactoService ContactoServicio;
	
	@GetMapping("contacto")
	public ResponseEntity<?> ListarContactos(){
		List<Contacto> LstContactos = ContactoServicio.findAll();
		if (LstContactos!=null) {
			if (LstContactos.size()!=0) 
				return new ResponseEntity<>(LstContactos,HttpStatus.OK);			
			else 
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}
	
	@GetMapping("contacto/{id}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "id") Long id) {

		Contacto contacto = ContactoServicio.findByCodigo(id);
		if (contacto != null) {
			return new ResponseEntity<>(contacto, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("contacto")
	public ResponseEntity<?> GuardarContacto(@RequestBody Contacto contacto){
		if (ContactoServicio.findByNumeroIdentificacion(contacto.getNumeroidentificacion())==null) {
			Contacto ContactoObj = ContactoServicio.save(contacto);
			return new ResponseEntity<>(ContactoObj, HttpStatus.CREATED);
		}
		else
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	}
	
	@DeleteMapping("contacto/{id}")
	public ResponseEntity<Void> BorrarContacto(@PathVariable(name = "id") Long id){

		try {
			Contacto contactoUpdate = ContactoServicio.findByCodigo(id);
			if (contactoUpdate!=null) {
				ContactoServicio.eliminar(contactoUpdate);
				return new ResponseEntity<Void>(HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}			
		}
		catch(Exception m) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}

}
