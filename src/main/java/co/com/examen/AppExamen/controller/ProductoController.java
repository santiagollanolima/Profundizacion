/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examen.AppExamen.controller;
import co.com.examen.AppExamen.business.IProductoBusiness;
import co.com.examen.AppExamen.model.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Aux Software
 */
@RestController
@RequestMapping(value = "/")
public class ProductoController {
    @Autowired
    private IProductoBusiness productoBusiness;
    
    @GetMapping("/producto")
    public List<Producto> obtenerProductos(HttpServletResponse hsr){
        return productoBusiness.obtenerProductos();
    }
    
    @GetMapping("/producto/{codigo}")
    public Producto obtenerProducto(@PathVariable String codigo,
                                        HttpServletResponse hsr) {
    return productoBusiness.obtenerProducto(codigo);
    }
    
    
    @PostMapping("/producto")
    public String crearProducto(@RequestBody Producto producto,
                                    HttpServletResponse hsr){
    return productoBusiness.crearProducto(producto);
    }
    
    @PutMapping("/producto")
    public String modificarProducto(@RequestBody Producto producto,
                                      HttpServletResponse hsr){
    return productoBusiness.modificarTProducto(producto);
    
    }
}
