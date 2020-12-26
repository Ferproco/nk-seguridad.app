package com.nkseguridad.app.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "documentocompra", schema = "public")
public class DocumentoCompra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "numerodocumento",length=10)
	private String numerodocumento; 
	
	private Long codnegocio;
	private Long codformapago;
	private String codcontacto;
    private Long codvendedor;
    private Date fechaemision;
    private Date fechavencimiento;
    private Date fecha;    
    private String referencia;   
    private String status;
    private Double baseimp;
    private Double isrl ;
    private String observacion;
    private String numcontrol;
    private Double numretencion;
    private Double pctiva_a ;
    private Double pctiva_b;
    private Double descuento;
    private Double subtotal;
    private Double total;
    private Double montoretenido;
	private String status_cobro;
    private String tipodocumento;
    private String contable;
    private String numeroz;
    private String status_impresion;
    private String codruta;
    
    @ManyToOne()
    @JoinColumn(name = "codformapago",  insertable = false, updatable = false)
    private FormaPago formapago;
    
    @ManyToOne()
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;
    
    @ManyToOne()
	@JoinColumn(name = "codvendedor", insertable = false, updatable = false)
	private Vendedor vendedor;
    
    
    @ManyToOne()
	@JoinColumn(name = "codcontacto", insertable = false, updatable = false)
	private Contacto contacto;

    
    
    //  @OneToMany(mappedBy = "documentoventa")
    
     //private List<DetallesDocumentoVenta> lstdetallesdocumentoventas;

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNumerodocumento() {
		return numerodocumento;
	}


	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}


	public Long getCodnegocio() {
		return codnegocio;
	}


	public void setCodnegocio(Long codnegocio) {
		this.codnegocio = codnegocio;
	}


	public Long getCodformapago() {
		return codformapago;
	}


	public void setCodformapago(Long codformapago) {
		this.codformapago = codformapago;
	}


	public String getCodcontacto() {
		return codcontacto;
	}


	public void setCodcontacto(String codcontacto) {
		this.codcontacto = codcontacto;
	}


	public Long getCodvendedor() {
		return codvendedor;
	}


	public void setCodvendedor(Long codvendedor) {
		this.codvendedor = codvendedor;
	}


	public Date getFechaemision() {
		return fechaemision;
	}


	public void setFechaemision(Date fechaemision) {
		this.fechaemision = fechaemision;
	}


	public Date getFechavencimiento() {
		return fechavencimiento;
	}


	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Double getBaseimp() {
		return baseimp;
	}


	public void setBaseimp(Double baseimp) {
		this.baseimp = baseimp;
	}


	public Double getIsrl() {
		return isrl;
	}


	public void setIsrl(Double isrl) {
		this.isrl = isrl;
	}


	public String getObservacion() {
		return observacion;
	}


	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	public String getNumcontrol() {
		return numcontrol;
	}


	public void setNumcontrol(String numcontrol) {
		this.numcontrol = numcontrol;
	}


	public Double getNumretencion() {
		return numretencion;
	}


	public void setNumretencion(Double numretencion) {
		this.numretencion = numretencion;
	}


	public Double getPctiva_a() {
		return pctiva_a;
	}


	public void setPctiva_a(Double pctiva_a) {
		this.pctiva_a = pctiva_a;
	}


	public Double getPctiva_b() {
		return pctiva_b;
	}


	public void setPctiva_b(Double pctiva_b) {
		this.pctiva_b = pctiva_b;
	}


	public Double getDescuento() {
		return descuento;
	}


	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}


	public Double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}


	public Double getMontoretenido() {
		return montoretenido;
	}


	public void setMontoretenido(Double montoretenido) {
		this.montoretenido = montoretenido;
	}


	public String getStatus_cobro() {
		return status_cobro;
	}


	public void setStatus_cobro(String status_cobro) {
		this.status_cobro = status_cobro;
	}


	public String getTipodocumento() {
		return tipodocumento;
	}


	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}


	public String getContable() {
		return contable;
	}


	public void setContable(String contable) {
		this.contable = contable;
	}


	public String getNumeroz() {
		return numeroz;
	}


	public void setNumeroz(String numeroz) {
		this.numeroz = numeroz;
	}


	public String getStatus_impresion() {
		return status_impresion;
	}


	public void setStatus_impresion(String status_impresion) {
		this.status_impresion = status_impresion;
	}


	public String getCodruta() {
		return codruta;
	}


	public void setCodruta(String codruta) {
		this.codruta = codruta;
	}


	public FormaPago getFormapago() {
		return formapago;
	}


	public void setFormapago(FormaPago formapago) {
		this.formapago = formapago;
	}


	public Negocio getNegocio() {
		return negocio;
	}


	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}


	public Vendedor getVendedor() {
		return vendedor;
	}


	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


	public Contacto getContacto() {
		return contacto;
	}


	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
  
}
