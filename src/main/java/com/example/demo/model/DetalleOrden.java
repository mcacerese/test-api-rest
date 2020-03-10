package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalle_ordenes")
public class DetalleOrden implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = 5464755340279480980L;

    // TODO: Crear llave compuesta @ClassId
    @Id
    @Column(name="ORDENID")
    private int ordenId;

    @Column(name="DETALLEID")
    private int detalleId;

    @Column(name="PRODUCTOID")
    private int productoId;

    @Column(name="CANTIDAD")
    private int cantidad;

    public int getOrdenId() {
        return ordenId;
    }

    public void setOrdenId(int ordenId) {
        this.ordenId = ordenId;
    }

    public int getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(int detalleId) {
        this.detalleId = detalleId;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}