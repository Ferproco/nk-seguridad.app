package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="unidadmedidaalterna",schema="public")
public class UnidadMedidaAlterna implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
     private Long id;
	 private Long codunidadmedida;
	 private Long codarticulo;
	 private Double valorcoversion;
	 private Long codnegocio;
	 private Long codunidadminima;
	 
	    @ManyToOne()
	    @JoinColumn(name = "codunidadmedida",  insertable = false, updatable = false)
	    private Unidadmedida unidadmedida;
	    
	    @ManyToOne()
	    @JoinColumn(name = "codarticulo",  insertable = false, updatable = false)
	    private Articulo articulo;
	    
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getCodunidadmedida() {
			return codunidadmedida;
		}

		public void setCodunidadmedida(Long codunidadmedida) {
			this.codunidadmedida = codunidadmedida;
		}

		public Long getCodarticulo() {
			return codarticulo;
		}

		public void setCodarticulo(Long codarticulo) {
			this.codarticulo = codarticulo;
		}

		public Double getValorcoversion() {
			return valorcoversion;
		}

		public void setValorcoversion(Double valorcoversion) {
			this.valorcoversion = valorcoversion;
		}

		public Long getCodnegocio() {
			return codnegocio;
		}

		public void setCodnegocio(Long codnegocio) {
			this.codnegocio = codnegocio;
		}

		public Long getCodunidadminima() {
			return codunidadminima;
		}

		public void setCodunidadminima(Long codunidadminima) {
			this.codunidadminima = codunidadminima;
		}

		public Unidadmedida getUnidadmedida() {
			return unidadmedida;
		}

		public void setUnidadmedida(Unidadmedida unidadmedida) {
			this.unidadmedida = unidadmedida;
		}

		public Articulo getArticulo() {
			return articulo;
		}

		public void setArticulo(Articulo articulo) {
			this.articulo = articulo;
		}

		public Negocio getNegocio() {
			return negocio;
		}

		public void setNegocio(Negocio negocio) {
			this.negocio = negocio;
		}

		@ManyToOne()
		@JoinColumn(name = "codnegocio", insertable = false, updatable = false)
		private Negocio negocio;
}
