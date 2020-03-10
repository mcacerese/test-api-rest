package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = -4089041086794723390L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO )
    @Column(name="CLIENTEID")
    private long clienteId;

    @Column(name="CEDULA_RUC", length = 10)
    private String cedulaRuc;

    @Column(name="NOMBRECIA", length = 30)
    private String nombreCia;

    @Column(name="NOMBRECONTACTO", length = 50)
    private String nombreContacto;

    @Column(name="DIRECCIONCLI", length = 50)
    private String direccionCli;

    @Column(name="FAX", length = 12)
    private String fax;

    @Column(name="EMAIL", length = 50)
    private String email;

    @Column(name="CELULAR", length = 12)
    private String celular;

    @Column(name="FIJO", length = 12)
    private String fijo;

    public long getClienteId() {
        return clienteId;
    }

    public void setClienteId(long clienteId) {
        this.clienteId = clienteId;
    }

    public String getCedulaRuc() {
        return cedulaRuc;
    }

    public void setCedulaRuc(String cedulaRuc) {
        this.cedulaRuc = cedulaRuc;
    }

    public String getNombreCia() {
        return nombreCia;
    }

    public void setNombreCia(String nombreCia) {
        this.nombreCia = nombreCia;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getDireccionCli() {
        return direccionCli;
    }

    public void setDireccionCli(String direccionCli) {
        this.direccionCli = direccionCli;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }
    
    
}