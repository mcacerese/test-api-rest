package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Producto;
import com.example.demo.repository.IProductoRepo;

import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {

    private IProductoRepo iProductoRepo;

    @Override
    public List<Producto> findAll() 
    {
        return iProductoRepo.findAll();
    }

}