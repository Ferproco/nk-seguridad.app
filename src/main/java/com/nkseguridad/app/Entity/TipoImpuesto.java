package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipoimpuesto",schema="public")
public class TipoImpuesto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nombretipoimpuesto",length=120)
	private String nombretipoimpuesto;
	
	private Long codnegocio;
	
	@Column(name="status",length=10)
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;
	
	/*@OneToMany(mappedBy = "tipoimpuestos")
	private List<Impuesto> LstImpuestos;*/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombretipoimpuesto() {
		return nombretipoimpuesto;
	}
	public void setNombretipoimpuesto(String nombretipoimpuesto) {
		this.nombretipoimpuesto = nombretipoimpuesto;
	}
	public Long getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}
	public Negocio getNegocio() {
		return negocio;
	}
	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	/*public List<Impuesto> getLstImpuestos() {
		return LstImpuestos;
	}
	public void setLstImpuestos(List<Impuesto> lstImpuestos) {
		LstImpuestos = lstImpuestos;
	}*/
	
	

}
