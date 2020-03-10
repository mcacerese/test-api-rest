package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ordenes")
public class Orden implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = -1688893547542673011L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO )
    @Column(name="ORDENID")
    private long openId;

    @ManyToOne
    private Empleado empleado;
    
    @ManyToOne
    private Cliente cliente;
    
    @Column(name="FECHAORDEN")
    private long fechaOrden;
    
    @Column(name="DESCUENTO")
    private long descuento;

    public long getOpenId() {
        return openId;
    }

    public void setOpenId(long openId) {
        this.openId = openId;
    }
    
    public long getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(long fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public long getDescuento() {
        return descuento;
    }

    public void setDescuento(long descuento) {
        this.descuento = descuento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}