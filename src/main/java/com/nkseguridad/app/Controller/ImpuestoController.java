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

import com.nkseguridad.app.Entity.FormaPago;
import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Service.IImpuestoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class ImpuestoController {
	
	@Autowired
	private IImpuestoService impuestoServicio;
	
	@GetMapping("impuesto")
	public ResponseEntity<?> ListarImpuestos(){
		List<Impuesto> LstImpuestos = impuestoServicio.findAll();
		if (LstImpuestos!=null) {
			if (LstImpuestos.size()!=0) {
				return new ResponseEntity<>(LstImpuestos,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	@PostMapping("impuesto")
	public ResponseEntity<?> GuardarImpuestos(@RequestBody Impuesto impuesto) {
		if (!impuestoServicio.findByExisteCodigo(impuesto.getIdimpuesto())) {
			Impuesto ImpuestoObj = impuestoServicio.save(impuesto);
			return new ResponseEntity<>(ImpuestoObj, HttpStatus.CREATED);
		} 
		else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

	}
	
	@DeleteMapping("impuesto/{id}")
	public ResponseEntity<Void> BorrarImpuesto(@PathVariable(name = "id") Long id){

		try {
			Impuesto ImpuestoObj = impuestoServicio.findByCodigo(id);
			if (ImpuestoObj!=null) {
				impuestoServicio.eliminar(ImpuestoObj);
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
