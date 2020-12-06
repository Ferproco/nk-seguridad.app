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
@Table(name="articulo",schema="public")
public class Articulo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
    @Column(name = "codigo",length=30)
	private String codigo;
	@Column(name="nomarticulo",length=120)
	private String nomarticulo;
    @Column(name="codmarca")
	private Long codmarca;
    @Column(name="codfamilia")
	private Long codfamilia;
    @Column(name="codunidadmedida")
    private Long codunidadmedida;
    @Column(name="codimpuesto")
    private Long codimpuesto;
    private long codtipoproducto;
    @Column(name="codigobarraprincipal",length=50)
	private String codigobarraprincipal;
    @Column(name="serial",length=50)
	private String serial;
    @Column(name="referencia",length=50)
   	private String referencia;
    @Column(name="status",length=10)
    private String status;
	private Double preciosugerido;
	private Long codnegocio;
    
   
   
   
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codfamilia",  insertable = false, updatable = false)
    private Familia familia;
    
    @ManyToOne()
    @JoinColumn(name = "codmarca",  insertable = false, updatable = false, nullable = true)
    private Marca marca;
    
    @ManyToOne()
    @JoinColumn(name = "codunidadmedida",  insertable = false, updatable = false)
    private Unidadmedida unidadmedida;
    
    @ManyToOne()
    @JoinColumn(name = "codimpuesto",  insertable = false, updatable = false)
    private Impuesto impuesto;
    
    @ManyToOne()
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;
    
    
    public Long getCodunidadmedida() {
		return codunidadmedida;
	}
	public void setCodunidadmedida(Long codunidadmedida) {
		this.codunidadmedida = codunidadmedida;
	}
	public Long getCodimpuesto() {
		return codimpuesto;
	}
	public void setCodimpuesto(Long codimpuesto) {
		this.codimpuesto = codimpuesto;
	}
	
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public Impuesto getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(Impuesto impuesto) {
		this.impuesto = impuesto;
	}
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
	
	public Unidadmedida getUnidadmedida() {
		return unidadmedida;
	}
	public void setUnidadmedida(Unidadmedida unidadmedida) {
		this.unidadmedida = unidadmedida;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Familia getFamilia() {
		return familia;
	}
	public void setFamilia(Familia familia) {
		this.familia = familia;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Long getCodmarca() {
		return codmarca;
	}
	public void setCodmarca(Long codmarca) {
		this.codmarca = codmarca;
	}
	public Long getCodfamilia() {
		return codfamilia;
	}
	public void setCodfamilia(Long codfamilia) {
		this.codfamilia = codfamilia;
	}
	
	public String getNomarticulo() {
		return nomarticulo;
	}
	public void setNomarticulo(String nomarticulo) {
		this.nomarticulo = nomarticulo;
	}
	public Double getPreciosugerido() {
		return preciosugerido;
	}
	public void setPreciosugerido(Double preciosugerido) {
		this.preciosugerido = preciosugerido;
	}
	
	public String getCodigobarraprincipal() {
		return codigobarraprincipal;
	}
	public void setCodigobarraprincipal(String codigobarraprincipal) {
		this.codigobarraprincipal = codigobarraprincipal;
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public Long getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}
	

	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public long getCodtipoproducto() {
		return codtipoproducto;
	}
	public void setCodtipoproducto(long codtipoproducto) {
		this.codtipoproducto = codtipoproducto;
	}
	
	
	    

}
