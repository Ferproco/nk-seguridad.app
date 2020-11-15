package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "formapago", schema = "public")

public class FormaPago implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "codnegocio")
	private Long codnegocio;
	@Column(name="nombre",length=120)
    private String nombre;
    private Long numero;
    @Column(name="aplicara",length=120)
    private String aplicara;
    @Column(name="tipo",length=120)
    private String tipo;    
    private Double limitecredito;
    private Double dias;
    private Double porcinteres;
    private Double numerogiros;
    private Double diasxgiro;
    @Column(name="status",length=10)
    private String status;
	


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;
	
	public Negocio getNegocio() {
		return negocio;
	}
	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getAplicara() {
		return aplicara;
	}
	public void setAplicara(String aplicara) {
		this.aplicara = aplicara;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getLimitecredito() {
		return limitecredito;
	}
	public void setLimitecredito(Double limitecredito) {
		this.limitecredito = limitecredito;
	}
	public Double getDias() {
		return dias;
	}
	public void setDias(Double dias) {
		this.dias = dias;
	}
	public Double getPorcinteres() {
		return porcinteres;
	}
	public void setPorcinteres(Double porcinteres) {
		this.porcinteres = porcinteres;
	}
	public Double getNumerogiros() {
		return numerogiros;
	}
	public void setNumerogiros(Double numerogiros) {
		this.numerogiros = numerogiros;
	}
	public Double getDiasxgiro() {
		return diasxgiro;
	}
	public void setDiasxgiro(Double diasxgiro) {
		this.diasxgiro = diasxgiro;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

	
}
