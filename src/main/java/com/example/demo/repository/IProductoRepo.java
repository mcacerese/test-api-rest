package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepo  extends JpaRepository<Producto, Long>
{
    abstract List<Producto> findAll();

    abstract Producto findById(long productoId);
}