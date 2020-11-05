package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="almacen",schema="public")
public class Almacen implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idalmacen")
	private Long idalmacen;
	private String codalmacen;
	private String codnegocio;
	private String nombre;
	private Boolean principal;
	private String tipoalmacen;
	private String direccion;
	private String status;  
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getIdalmacen() {
		return idalmacen;
	}
	public void setIdalmacen(Long idalmacen) {
		this.idalmacen = idalmacen;
	}
	public String getCodalmacen() {
		return codalmacen;
	}
	public void setCodalmacen(String codalmacen) {
		this.codalmacen = codalmacen;
	}
	public String getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getPrincipal() {
		return principal;
	}
	public void setPrincipal(Boolean principal) {
		this.principal = principal;
	}
	public String getTipoalmacen() {
		return tipoalmacen;
	}
	public void setTipoalmacen(String tipoalmacen) {
		this.tipoalmacen = tipoalmacen;
	}
}
