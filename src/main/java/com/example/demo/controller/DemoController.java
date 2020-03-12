package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.example.demo.model.Producto;
import com.example.demo.service.IProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping(path = "/productos", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoController
{
    @Autowired
    IProductoService iProductoService;
    
    @GetMapping("")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Producto> getProducts() 
    {
        return iProductoService.findAll();
    }

    @PostMapping(path="/actualizar-precio-uf/{productoId}")
    @ResponseBody
    public Map<String, String> updatePrecioUnitUf(@PathVariable long productoId, HttpServletResponse response)
    {
        Map<String, String> map = iProductoService.updatePrecioUnitUf(productoId);
        if("Error".equals(map.get("Result")))
        {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
        return map;
    }
    

    
}