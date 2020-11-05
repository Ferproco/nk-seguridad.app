 package com.nkseguridad.app.Entity;


import java.io.Serializable;
import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="caja",schema ="public")
public class Caja implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1150861150732733713L;
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="codigocaja", length = 3, nullable = false)
	private String codigocaja;
	
	@Column(name="codnegocio", length = 15)
	private String codnegocio;
	
	@Column(name="nombrecaja", nullable = false, length = 120)
	private String nombrecaja;
	
	@Column(name="tipocaja", nullable = false, length = 30)
	private String tipocaja;
	
	@Column(name="status", nullable = false, length = 10)
	private String status; 
	
	@Column(name="codigocontable", nullable = true, length = 15)
	private String codigocontable;
	
	@Column(name="facturable", nullable = false, length = 2)
	private String facturable;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="codigocaja",referencedColumnName ="codigocaja")
	List<MovimientosCaja> lstmovimientoscaja=new ArrayList<MovimientosCaja>();
	
	public List<MovimientosCaja> getLstmovimientoscaja() {
		return lstmovimientoscaja;
	}

	public void setLstmovimientoscaja(List<MovimientosCaja> lstmovimientoscaja) {
		this.lstmovimientoscaja = lstmovimientoscaja;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigocaja() {
		return codigocaja;
	}

	public void setCodigocaja(String codigocaja) {
		this.codigocaja = codigocaja;
	}

	public String getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}

	public String getNombrecaja() {
		return nombrecaja;
	}

 	public void setNombrecaja(String nombrecaja) {
		this.nombrecaja = nombrecaja;
	}

	public String getTipocaja() {
		return tipocaja;
	}

	public void setTipocaja(String tipocaja) {
		this.tipocaja = tipocaja;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCodigocontable() {
		return codigocontable;
	}

	public void setCodigocontable(String codigocontable) {
		this.codigocontable = codigocontable;
	}

	public String getFacturable() {
		return facturable;
	}

	public void setFacturable(String facturable) {
		this.facturable = facturable;
	}

	
}
