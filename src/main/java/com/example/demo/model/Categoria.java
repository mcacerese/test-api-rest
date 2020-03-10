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


@Entity
@Table(name="categorias")
public class Categoria implements Serializable
{
    private static final long serialVersionUID = -8003926673533043488L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO )
    @Column(name="CATEGORIAID")
    private long categoriaId;

    @Column(name="NOMBRECAT", length = 50)
    private String nombreCat;

    @OneToMany(mappedBy="categoria", fetch = FetchType.LAZY)
    private Set<Producto> productos = new HashSet<Producto>(0);

    public long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }

}