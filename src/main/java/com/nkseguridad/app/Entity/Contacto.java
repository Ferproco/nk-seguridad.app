package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "contacto", schema = "public")
public class Contacto  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;	
	
    private Long codgrupo;
    
    @Column(name="codvendedor")
    private Long codvendedor;
    
    @Column(name="codnegocio")
    private Long codnegocio;      

    @Column(name="numeroidentificacion")
    private String numeroidentificacion; 
    
	@Column(name="codtipoidentificacion")
    private Long codtipoidentificacion; 
   
    @Column(name = "nombre", nullable = false, length = 120)
    private String nombre;
    
    @Column(name = "razonsocial", nullable = true, length = 120)
    private String razonsocial;
    
    @Column(name = "telefonomovil", nullable = true, length = 15)
    private String telefonomovil;
    
    @Column(name = "telefonofijo1", nullable = true, length = 15)
    private String telefonofijo1;
    
    @Column(name = "telefonofijo2", nullable = true, length = 15)
    private String telefonofijo2;  
   
    @Column(name = "telefonofax", nullable = true, length = 15)
    private String telefonofax;
    
    @Column(name = "direccionfiscal", nullable = false, length = 120)
    private String direccionfiscal;
    
    @Column(name = "correoe", nullable = true, length = 120)
    private String correoe;    
   
    @Column(name="codtipocontacto")
    private Long codtipocontacto;
   
    @Column(name="codformapago")
    private Long codformapago;   

    @Column(name="codtipocontibuyente")
    private Long codtipocontibuyente;
   
    @Column(name = "status", nullable = true, length = 10)
    private String status;    
    
    private String regimeniva;
   
    private Date fecharegistro;
    
    private Long codcontable;
    
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;    
    
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codtipoidentificacion", insertable = false, updatable = false)
	private TipoIdentificacion tipoidentificacion;
    
    @ManyToOne(cascade = CascadeType.ALL)
   	@JoinColumn(name = "codvendedor", insertable = false, updatable = false)
   	private Vendedor vendedor;    
    
    @ManyToOne(cascade = CascadeType.ALL)
  	@JoinColumn(name = "codformapago", insertable = false, updatable = false)
  	private FormaPago formapago;   
    
    @ManyToOne(cascade = CascadeType.ALL)
  	@JoinColumn(name = "codtipocontacto", insertable = false, updatable = false)
  	private TipoContacto tipocontacto;    

    @ManyToOne(cascade = CascadeType.ALL)
  	@JoinColumn(name = "codtipocontibuyente", insertable = false, updatable = false)
  	private TipoContribuyente tipocontribuyente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodgrupo() {
		return codgrupo;
	}

	public void setCodgrupo(Long codgrupo) {
		this.codgrupo = codgrupo;
	}

	public Long getCodvendedor() {
		return codvendedor;
	}

	public void setCodvendedor(Long codvendedor) {
		this.codvendedor = codvendedor;
	}

	public Long getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}

	public String getNumeroidentificacion() {
		return numeroidentificacion;
	}

	public void setNumeroidentificacion(String numeroidentificacion) {
		this.numeroidentificacion = numeroidentificacion;
	}

	public Long getCodtipoidentificacion() {
		return codtipoidentificacion;
	}

	public void setCodtipoidentificacion(Long codtipoidentificacion) {
		this.codtipoidentificacion = codtipoidentificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getTelefonomovil() {
		return telefonomovil;
	}

	public void setTelefonomovil(String telefonomovil) {
		this.telefonomovil = telefonomovil;
	}

	public String getTelefonofijo1() {
		return telefonofijo1;
	}

	public void setTelefonofijo1(String telefonofijo1) {
		this.telefonofijo1 = telefonofijo1;
	}

	public String getTelefonofijo2() {
		return telefonofijo2;
	}

	public void setTelefonofijo2(String telefonofijo2) {
		this.telefonofijo2 = telefonofijo2;
	}

	public String getTelefonofax() {
		return telefonofax;
	}

	public void setTelefonofax(String telefonofax) {
		this.telefonofax = telefonofax;
	}

	public String getDireccionfiscal() {
		return direccionfiscal;
	}

	public void setDireccionfiscal(String direccionfiscal) {
		this.direccionfiscal = direccionfiscal;
	}

	public String getCorreoe() {
		return correoe;
	}

	public void setCorreoe(String correoe) {
		this.correoe = correoe;
	}

	public Long getCodtipocontacto() {
		return codtipocontacto;
	}

	public void setCodtipocontacto(Long codtipocontacto) {
		this.codtipocontacto = codtipocontacto;
	}

	public Long getCodformapago() {
		return codformapago;
	}

	public void setCodformapago(Long codformapago) {
		this.codformapago = codformapago;
	}

	public Long getCodtipocontibuyente() {
		return codtipocontibuyente;
	}

	public void setCodtipocontibuyente(Long codtipocontibuyente) {
		this.codtipocontibuyente = codtipocontibuyente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRegimeniva() {
		return regimeniva;
	}

	public void setRegimeniva(String regimeniva) {
		this.regimeniva = regimeniva;
	}

	public Date getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}	

	public Long getCodcontable() {
		return codcontable;
	}

	public void setCodcontable(Long codcontable) {
		this.codcontable = codcontable;
	}

	public Negocio getNegocio() {
		return negocio;
	}

	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}

	public TipoIdentificacion getTipoidentificacion() {
		return tipoidentificacion;
	}

	public void setTipoidentificacion(TipoIdentificacion tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public FormaPago getFormapago() {
		return formapago;
	}

	public void setFormapago(FormaPago formapago) {
		this.formapago = formapago;
	}

	public TipoContacto getTipocontacto() {
		return tipocontacto;
	}

	public void setTipocontacto(TipoContacto tipocontacto) {
		this.tipocontacto = tipocontacto;
	}

	public TipoContribuyente getTipocontribuyente() {
		return tipocontribuyente;
	}

	public void setTipocontribuyente(TipoContribuyente tipocontribuyente) {
		this.tipocontribuyente = tipocontribuyente;
	}
}
