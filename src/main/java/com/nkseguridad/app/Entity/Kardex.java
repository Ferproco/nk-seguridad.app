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
@Table(name="kardex",schema="public")
public class Kardex implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "id")
	  private Long id;
	  @Column(name = "codarticulo")
	  private Long codarticulo;
	  @Column(name="tipo",length=5)
	  private String tipo;
	  @Column(name="fecha")
	  private Date fecha;
	  @Column(name="documentoasociado",length=10)
	  private String documentoasociado;
	  @Column(name="cantidad")
	  private Double cantidad;
	  @Column(name="montoxunidad")
	  private Double montoxunidad;
	  @Column(name="codunidadmedida")
	  private Long codunidadmedida;
	  @Column(name="codunidadalterna")
	  private Long codunidadalterna;
	  @Column(name="cantidadalterna")
	  private Double cantidadalterna;
	  @Column(name="montoxunidadalterna")
	  private Double montoxunidadalterna;
	  @Column(name="montototal")
	  private Double montototal;
	  @Column(name="codalmacen")
	  private Long codalmacen;
	  
	  @Column(name="concepto",length=120)
	  private String concepto;
	  @Column(name="origen",length=120)
	  private String origen;
	  @Column(name="codnegocio")
	  private Long codnegocio;
	  @Column(name="numerocontrol",length=10)
	  private String numerocontrol;
	  
	  @ManyToOne()
	  @JoinColumn(name = "codunidadmedida",  insertable = false, updatable = false)
	  private Unidadmedida unidadmedida;
	    		    
	  @ManyToOne()
      @JoinColumn(name = "codnegocio", insertable = false, updatable = false)
	  private Negocio negocio;
	 
	  @ManyToOne()
	  @JoinColumn(name = "codalmacen",  insertable = false, updatable = false)
	  private Almacen almacen;
	  
	  @ManyToOne()
	  @JoinColumn(name = "codarticulo",  insertable = false, updatable = false)
	  private Articulo articulo;
	  
	  @ManyToOne()
	  @JoinColumn(name = "codunidadalterna",  insertable = false, updatable = false)
	  private UnidadMedidaAlterna unidadmedidaalterna;
	  
	  
}
