package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Producto;
import com.example.demo.repository.IProductoRepo;
import com.example.demo.service.IProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoController
{
    @Autowired
    IProductoService iProductoService;
    
    @GetMapping("/")
    public List<Producto> getProducts() 
    {
        List<Producto> productos = iProductoRepo.findAll(); 
        return productos;
    }
}