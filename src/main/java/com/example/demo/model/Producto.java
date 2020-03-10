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
    private long precioUnit;

    @Column(name="PRECIOUNITUF", columnDefinition = "int default 0")
    private long precioUnitUf;

    @Column(name="EXISTENCIA")
    private long existencia;

    public long getProductoId() {
        return productoId;
    }

    public void setProductoId(long productoId) {
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

    public long getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(long precioUnit) {
        this.precioUnit = precioUnit;
    }

    public long getExistencia() {
        return existencia;
    }

    public void setExistencia(long existencia) {
        this.existencia = existencia;
    }

    public long getPrecioUnitUf() {
        return precioUnitUf;
    }

    public void setPrecioUnitUf(long precioUnitUf) {
        this.precioUnitUf = precioUnitUf;
    }

}
