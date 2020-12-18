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
@Table(name = "documentoventa", schema = "public")
public class DocumentoVenta implements Serializable {

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
    private Date fechaemision;
    private Date fechavencimiento;
    private String tipoiva;
    private Long codformapago;
    private String codcliente;
    private String referencia;
    private Long codvendedor;
    private String tarifa;
    private Date fecha;
    private String status;
    private Double baseimp;
    private Double baseimp_a;
    private Double baseimp_b;
    private Double baseimp_c;
    private Double baseimp_d;
    private Double baseimp_x;
    private Double baseimp_y;
    private Double isrl ;
    private String observacion;
    private String numcontrol;
    private Double numretencion;
    private Double pctiva_a ;
    private Double pctiva_b;
    private Double pctiva_c;
    private Double pctiva_d;
    private String status_cobro;
    private String tipodocumento;
    private String contable;
    private String numeroz;
    private String status_impresion;
    private String codruta;
   
    public Long getCodformapago() {
		return codformapago;
	}
	public void setCodformapago(Long codformapago) {
		this.codformapago = codformapago;
	}
	public String getCodruta() {
		return codruta;
	}
	public void setCodruta(String codruta) {
		this.codruta = codruta;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Negocio getNegocio() {
		return negocio;
	}
	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}
	public FormaPago getFormapago() {
		return formapago;
	}
	public void setFormapago(FormaPago formapago) {
		this.formapago = formapago;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	private Negocio negocio;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigoforma", insertable = false, updatable = false)
    private FormaPago formapago;
    
    
	public String getNumerodocumento() {
		return numerodocumento;
	}
	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
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
	public String getTipoiva() {
		return tipoiva;
	}
	public void setTipoiva(String tipoiva) {
		this.tipoiva = tipoiva;
	}
	
	public String getCodcliente() {
		return codcliente;
	}
	public void setCodcliente(String codcliente) {
		this.codcliente = codcliente;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getTarifa() {
		return tarifa;
	}
	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
	public Double getBaseimp_a() {
		return baseimp_a;
	}
	public void setBaseimp_a(Double baseimp_a) {
		this.baseimp_a = baseimp_a;
	}
	public Double getBaseimp_b() {
		return baseimp_b;
	}
	public void setBaseimp_b(Double baseimp_b) {
		this.baseimp_b = baseimp_b;
	}
	public Double getBaseimp_c() {
		return baseimp_c;
	}
	public void setBaseimp_c(Double baseimp_c) {
		this.baseimp_c = baseimp_c;
	}
	public Double getBaseimp_d() {
		return baseimp_d;
	}
	public void setBaseimp_d(Double baseimp_d) {
		this.baseimp_d = baseimp_d;
	}
	public Double getBaseimp_x() {
		return baseimp_x;
	}
	public void setBaseimp_x(Double baseimp_x) {
		this.baseimp_x = baseimp_x;
	}
	public Double getBaseimp_y() {
		return baseimp_y;
	}
	public void setBaseimp_y(Double baseimp_y) {
		this.baseimp_y = baseimp_y;
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
	public Double getPctiva_c() {
		return pctiva_c;
	}
	public void setPctiva_c(Double pctiva_c) {
		this.pctiva_c = pctiva_c;
	}
	public Double getPctiva_d() {
		return pctiva_d;
	}
	public void setPctiva_d(Double pctiva_d) {
		this.pctiva_d = pctiva_d;
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
	
	


}
