package com.example.demo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = 4286277463937229197L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO )
    @Column(name="EMPLEADOID")
    private long empleadoId;

    @Column(name="NOMBRE", length = 30)
    private String nombre;

    @Column(name="APELLIDO", length = 30)
    private String apellido;
    
    @Column(name="FECHA_NAC")
    private Date fechaNac;

    @Column(name="REPORTA_A")
    private long reportaA;
    
    @Column(name="EXTENSION")
    private long extension;

    public long getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(long empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public long getReportaA() {
        return reportaA;
    }

    public void setReportaA(long reportaA) {
        this.reportaA = reportaA;
    }

    public long getExtension() {
        return extension;
    }

    public void setExtension(long extension) {
        this.extension = extension;
    }


}