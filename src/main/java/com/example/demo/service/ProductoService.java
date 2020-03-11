package com.example.demo.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.model.Producto;
import com.example.demo.repository.IProductoRepo;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class ProductoService implements IProductoService
{
    private static final Logger LOG = Logger.getLogger("ProductoService");
    @Autowired
    private IProductoRepo iProductoRepo;
    
    @Value("${urlUf}")
    private String urlUf;
    static String json = "...";

    @Override
    public List<Producto> findAll()
    {
        return iProductoRepo.findAll(sortByIdAsc());
    }

    private Sort sortByIdAsc()
    {
        return new Sort(Sort.Direction.ASC, "productoId");
    }

    @Override
    public Map<String,String> updatePrecioUnitUf(long productoId)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        final HashMap <String, String> map = new HashMap<>();
        try
        {
            Double valorUf = 1.0;
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> result = restTemplate.getForEntity(urlUf, String.class);
            JSONObject obj = new JSONObject(result.getBody());
            JSONArray arr = obj.getJSONArray("serie");
            String today = formatter.format(calendar.getTime());
        
            for (int i = 0; i < arr.length(); i++)
            {
                String fecha = arr.getJSONObject(i).getString("fecha").substring(0, 10);
                if(fecha.equals(today))
                {
                    valorUf = arr.getJSONObject(i).getDouble("valor");
                    break;
                }
            }
            Producto producto = iProductoRepo.findById(productoId);
            Double precioUnitUf = producto.getPrecioUnit() * valorUf;
            producto.setPrecioUnitUf(precioUnitUf);
            iProductoRepo.save(producto);
            
            map.put("Result", "Ok");
            map.put("Message", "Valor precioUnitUf actualizado correctamente.");
            map.put("ProductoID", producto.getProductoId().toString());
            map.put("Descripción", producto.getDescripcion());
            map.put("Existencia", producto.getExistencia().toString());
            map.put("PrecioUnit", producto.getPrecioUnit().toString());
            map.put("PrecioUnitUf", producto.getPrecioUnitUf().toString());
            map.put("Categoria", producto.getCategoria().getNombreCat());
            map.put("Proveedor", producto.getProveedor().getNombreProv());
            return map;
        }
        catch(Exception e)
        {
            LOG.warning(e.getMessage());
            map.put("Result", "Error");
            map.put("Message", "Ha ocurrido un error al intentar actualizar el valor en UF");
            return map;
        }
    }
}