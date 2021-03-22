package com.nkseguridad.app.Model;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

public class ArticuloFilterKardex {

	private Long tipo;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, pattern = "yyyy-MM-dd")
	private LocalDateTime fechadesde;	
	 
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, pattern = "yyyy-MM-dd")
	private LocalDateTime fechahasta;
	
	public Long getTipo() {
		return tipo;
	}
	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}
	public LocalDateTime getFechadesde() {
		return fechadesde;
	}
	public void setFechadesde(LocalDateTime fechadesde) {
		this.fechadesde = fechadesde;
	}
	public LocalDateTime getFechahasta() {
		return fechahasta;
	}
	public void setFechahasta(LocalDateTime fechahasta) {
		this.fechahasta = fechahasta;
	}
	
	
}
