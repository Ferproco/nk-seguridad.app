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

import com.nkseguridad.app.Entity.NumeracionDocumento;
import com.nkseguridad.app.Service.INumeracionDocumentoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class NumeracionDocumentoController {

	@Autowired
	private INumeracionDocumentoService numeraciondocumentoServicio;
	
	@GetMapping("numeraciondocumento")
	public ResponseEntity<?> ListarNumeracionDocumentos(){
		List<NumeracionDocumento> LstNumeracionDocumentos = numeraciondocumentoServicio.findAll();
		if (LstNumeracionDocumentos!=null) {
			if (LstNumeracionDocumentos.size()!=0) {
				return new ResponseEntity<>(LstNumeracionDocumentos,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	@GetMapping("numeraciondocumento/{id}")
	public ResponseEntity<?> BuscarNumeracionporID(@PathVariable(name = "id") Long id){
		NumeracionDocumento LstNumeracionDocumentos = numeraciondocumentoServicio.findByIdnumeraciondocumento(id);
		if (LstNumeracionDocumentos!=null) {
				return new ResponseEntity<>(LstNumeracionDocumentos,HttpStatus.OK);
			
		}
		else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
			
	}
	
	@PostMapping("numeraciondocumento")
	public ResponseEntity<?> GuardarNumeracionDocumentos(@RequestBody NumeracionDocumento numeraciondocumento) {
		NumeracionDocumento numeraciondocumentoOut;
		try {
			NumeracionDocumento numeraciondocumentoUpdate = numeraciondocumentoServicio.findByIdnumeraciondocumento(numeraciondocumento.getIdnumeraciondocumento());
			
			if (numeraciondocumentoUpdate != null) {
				
				numeraciondocumentoUpdate.setNombre(numeraciondocumento.getNombre());
				numeraciondocumentoUpdate.setCodtipodocumento(numeraciondocumento.getCodtipodocumento());
				numeraciondocumentoUpdate.setDesdenumero(numeraciondocumento.getDesdenumero());
				numeraciondocumentoUpdate.setHastanumero(numeraciondocumento.getHastanumero());
				numeraciondocumentoUpdate.setPrefijo(numeraciondocumento.getPrefijo());
				numeraciondocumentoUpdate.setProximonumerodocumento(numeraciondocumento.getProximonumerodocumento());
				numeraciondocumentoUpdate.setCodnegocio(numeraciondocumento.getCodnegocio());
				numeraciondocumentoUpdate.setProximonumerodocumento(numeraciondocumento.getProximonumerodocumento());
				numeraciondocumentoUpdate.setResolucion(numeraciondocumento.getResolucion());
				numeraciondocumentoUpdate.setStatus(numeraciondocumento.getStatus());
				
				numeraciondocumentoOut = numeraciondocumentoServicio.save(numeraciondocumentoUpdate);
								
			}
			else {
				numeraciondocumentoOut = numeraciondocumentoServicio.save(numeraciondocumento);
			}
			
			if (numeraciondocumentoOut!=null) {
				return new ResponseEntity<>(numeraciondocumentoOut, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
			
		}catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
	}
	@DeleteMapping("numeraciondocumento/{id}")
	public ResponseEntity<Void> BorrarNumeracionDocumento(@PathVariable(name = "id") Long id){

		try {
			NumeracionDocumento NumeracionDocumentoObj = numeraciondocumentoServicio.findByCodigo(id);
			if (NumeracionDocumentoObj!=null) {
				numeraciondocumentoServicio.eliminar(NumeracionDocumentoObj);
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
