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

import com.nkseguridad.app.Entity.Departamento;
import com.nkseguridad.app.Service.IDepartamentoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("api")
public class DepartamentoController {
	
	@Autowired
	private IDepartamentoService departamentoServicio;
	
	@GetMapping("departamento")
	public ResponseEntity<?> ListarDepartamentos(){
		List<Departamento> LstDepartamentos = departamentoServicio.findAll();
		if (LstDepartamentos!=null) {
			if (LstDepartamentos.size()!=0) {
				return new ResponseEntity<>(LstDepartamentos,HttpStatus.OK);
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
