package com.example.demo.model;

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
@Table(name="productos")
public class Producto implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = 5130701555221949034L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="PRODUCTOID")
    private long productoId;

    @ManyToOne
	@JoinColumn(name = "PROVEEDORID", nullable = false)
    private Proveedor proveedor;
    
    @ManyToOne
	@JoinColumn(name = "CATEGORIAID", nullable = false)
    private Categoria categoria;

    @Column(name="DESCRIPCION", length = 50)
    private String descripcion;

    @Column(name="PRECIOUNIT")
    private Double precioUnit;

    @Column(name="PRECIOUNITUF", columnDefinition = "int default 0")
    private Double precioUnitUf;

    @Column(name="EXISTENCIA")
    private long existencia;

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(Double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public Long getExistencia() {
        return existencia;
    }

    public void setExistencia(Long existencia) {
        this.existencia = existencia;
    }

    public Double getPrecioUnitUf() {
        return precioUnitUf;
    }

    public void setPrecioUnitUf(Double precioUnitUf) {
        this.precioUnitUf = precioUnitUf;
    }

    @Override
    public String toString() {
        return "{ productoId=" + productoId+
                        ", descripcion=" + descripcion + 
                        ", existencia=" + existencia +
                        ", precioUnit=" + precioUnit + 
                        ", precioUnitUf=" + precioUnitUf + 
                        ", categoria=" + categoria.getNombreCat() +
                        ", proveedor=" + proveedor.getNombreProv() + "}";
    }

}
