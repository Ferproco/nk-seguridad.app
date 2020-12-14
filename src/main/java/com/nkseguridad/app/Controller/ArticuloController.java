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

import com.nkseguridad.app.Entity.Almacen;
import com.nkseguridad.app.Entity.Articulo;
import com.nkseguridad.app.Entity.Cliente;
import com.nkseguridad.app.Entity.Contacto;
import com.nkseguridad.app.Entity.Impuesto;
import com.nkseguridad.app.Service.IArticuloService;

 @RestController
 @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
 @RequestMapping("api")

 public class ArticuloController {

	@Autowired
	private IArticuloService articuloServicio;
	
	@GetMapping("articulo")
	public ResponseEntity<?> ListarArticulos(){
		List<Articulo> LstArticulos = articuloServicio.findAll();
		if (LstArticulos!=null) {
			if (LstArticulos.size()!=0) {
				return new ResponseEntity<>(LstArticulos,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("articulo/tipo/{tipo}")
	public ResponseEntity<?> ListarArticulosPorTipo(@PathVariable(name = "tipo") Long tipo){
		List<Articulo> LstArticulos = articuloServicio.findAllTipoProducto(tipo);
		if (LstArticulos!=null) {
			if (LstArticulos.size()!=0) 
				return new ResponseEntity<>(LstArticulos,HttpStatus.OK);			
			else 
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	}
	
	
	@PostMapping("articulo")
	public ResponseEntity<?> GuardarArticulos(@RequestBody Articulo articulo) {
		Articulo articuloOut;
		try {
			Articulo articuloUpdate = articuloServicio.findByCodigo(articulo.getId());
			
			if (articuloUpdate != null) {
				
				articuloUpdate.setNomarticulo(articulo.getNomarticulo());
				articuloUpdate.setPreciosugerido(articulo.getPreciosugerido());
				articuloUpdate.setCodfamilia(articulo.getCodfamilia());
				articuloUpdate.setCodimpuesto(articulo.getCodimpuesto());
				articuloUpdate.setCodmarca(articulo.getCodmarca());
				articuloUpdate.setCodnegocio(articulo.getCodnegocio());
				articuloUpdate.setCodigo(articulo.getCodigo());
				articuloUpdate.setAlto(articulo.getAlto());
				articuloUpdate.setAncho(articulo.getAncho());
				articuloUpdate.setCodigobarraprincipal(articulo.getCodigobarraprincipal());
				articuloUpdate.setCodtipoproducto(articulo.getCodtipoproducto());
				articuloUpdate.setCodunidadmedida(articulo.getCodunidadmedida());
				articuloUpdate.setColor(articulo.getColor());
				articuloUpdate.setDescripcionlarga(articulo.getDescripcionlarga());
				articuloUpdate.setReferencia(articulo.getReferencia());
				articuloUpdate.setSerial(articulo.getSerial());
				articuloOut=articuloServicio.save(articuloUpdate);
				
				
				
			}
			else {
				articuloOut = articuloServicio.save(articulo);
			}
			if (articuloOut!=null) {
				return new ResponseEntity<>(articuloOut, HttpStatus.OK);
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
			
		}catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
	}
	
	@GetMapping("articulo/{id}")
	public ResponseEntity<?> BuscarPorCodigo(@PathVariable(name = "id") Long id) {

		Articulo articulo = articuloServicio.findByCodigo(id);
		if (articulo != null) {
			return new ResponseEntity<>(articulo, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("articulo/{id}")
	public ResponseEntity<Void> BorrarArticuloo(@PathVariable(name = "id") Long id){

		try {
			Articulo articuloUpdate = articuloServicio.findByCodigo(id);
			if (articuloUpdate!=null) {
				articuloServicio.eliminar(articuloUpdate);
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
