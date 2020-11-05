package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "negocio", schema = "public")
public class Negocio implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 28965007218210964L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idnegocio;
	
	@Column(name = "codnegocio", nullable = false, length = 15)
	private String codnegocio;
	
	@Column(name = "nombre", nullable = false, length = 120)
	private String nombre;
	
	@Column(name = "direccion", nullable = false, length = 255)
	private String direccion;
	
	@Column(name = "telefono", nullable = true, length = 20)
	private String telefono;
	
	@Column(name = "email", nullable = true, length = 120)
	private String email;
	
	@Column(name = "telefono2" ,nullable = true, length = 20)
	private String telefonomovil;
	
	@Column(name = "web", nullable = true, length = 120)
	private String web;
	
	private Byte[] imagen;
	
	@Column(name = "mascaracontable", nullable = true, length = 25)
	private String mascaracontable;
	
	@Column(name = "contribuyente", nullable = false, length = 2)
	private String contribuyente;
	
	@Column(name = "status", nullable = false, length = 10)
	private String status;

	
	public Long getIdnegocio() {
		return idnegocio;
	}

	public void setIdnegocio(Long idnegocio) {
		this.idnegocio = idnegocio;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonomovil() {
		return telefonomovil;
	}

	public void setTelefonomovil(String telefonomovil) {
		this.telefonomovil = telefonomovil;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public Byte[] getImagen() {
		return imagen;
	}

	public void setImagen(Byte[] imagen) {
		this.imagen = imagen;
	}

	public String getMascaracontable() {
		return mascaracontable;
	}

	public void setMascaracontable(String mascaracontable) {
		this.mascaracontable = mascaracontable;
	}

	public String getContribuyente() {
		return contribuyente;
	}

	public void setContribuyente(String contribuyente) {
		this.contribuyente = contribuyente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
