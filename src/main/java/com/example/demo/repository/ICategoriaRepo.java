package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaRepo extends JpaRepository<Categoria, Long>{

    List<Categoria> findByNombreCat(String nombreCat);
    List<Categoria> findAll();
}