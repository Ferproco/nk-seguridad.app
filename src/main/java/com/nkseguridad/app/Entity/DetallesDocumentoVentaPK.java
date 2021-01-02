package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DetallesDocumentoVentaPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7010980765757993489L;
	private Long documentoid;
	private Long detalledocumentoid;
	
	public DetallesDocumentoVentaPK() {
		
	}
	
	public DetallesDocumentoVentaPK(Long documentoid, Long detalledocumentoid) {
		this.documentoid = documentoid;
		this.detalledocumentoid = detalledocumentoid;
	}

	public Long getDocumentoid() {
		return documentoid;
	}

	public void setDocumentoid(Long documentoid) {
		this.documentoid = documentoid;
	}

	public Long getDetalledocumentoid() {
		return detalledocumentoid;
	}

	public void setDetalledocumentoid(Long detalledocumentoid) {
		this.detalledocumentoid = detalledocumentoid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((detalledocumentoid == null) ? 0 : detalledocumentoid.hashCode());
		result = prime * result + ((documentoid == null) ? 0 : documentoid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetallesDocumentoVentaPK other = (DetallesDocumentoVentaPK) obj;
		if (detalledocumentoid == null) {
			if (other.detalledocumentoid != null)
				return false;
		} else if (!detalledocumentoid.equals(other.detalledocumentoid))
			return false;
		if (documentoid == null) {
			if (other.documentoid != null)
				return false;
		} else if (!documentoid.equals(other.documentoid))
			return false;
		return true;
	}

		

}
