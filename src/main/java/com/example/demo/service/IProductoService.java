package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.model.Producto;

public interface IProductoService
{
    List<Producto> findAll();

    public Map<String,String> updatePrecioUnitUf(long productoId);
}