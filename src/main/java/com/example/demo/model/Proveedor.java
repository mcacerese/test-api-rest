package com.example.demo.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="proveedores")
public class Proveedor implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = -1626098447954549407L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO )
    @Column(name="PROVEEDORID")
    private long proveedorId;

    @Column(name="NOMBREPROV", length = 50)
    private String nombreProv;

    @Column(name="CONTACTO", length = 50)
    private String contacto;

    @Column(name="CELUPROV", length = 12)
    private String celuProv;

    @Column(name="FIJOPROV", length = 12)
    private String fijoProv;

    @OneToMany(mappedBy="proveedor", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Producto> productos = new HashSet<Producto>(0);


    public long getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(long proveedorId) {
        this.proveedorId = proveedorId;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCeluProv() {
        return celuProv;
    }

    public void setCeluProv(String celuProv) {
        this.celuProv = celuProv;
    }

    public String getFijoProv() {
        return fijoProv;
    }

    public void setFijoProv(String fijoProv) {
        this.fijoProv = fijoProv;
    }
    
}