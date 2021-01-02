package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DetallesDocumentoVentaPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7010980765757993489L;
	private Long DocumentoVentaId;
	private Long DetalleDocumentoVentaId;
	
	public DetallesDocumentoVentaPK() {
		
	}
	
	public DetallesDocumentoVentaPK(Long DocumentoVentaId, Long DetalleDocumentoVentaId) {
		this.DocumentoVentaId = DocumentoVentaId;
		this.DetalleDocumentoVentaId = DetalleDocumentoVentaId;
	}

	public Long getDocumentoVentaId() {
		return DocumentoVentaId;
	}

	public void setDocumentoVentaId(Long documentoVentaId) {
		DocumentoVentaId = documentoVentaId;
	}

	public Long getDetalleDocumentoVentaId() {
		return DetalleDocumentoVentaId;
	}

	public void setDetalleDocumentoVentaId(Long detalleDocumentoVentaId) {
		DetalleDocumentoVentaId = detalleDocumentoVentaId;
	}
	

}
