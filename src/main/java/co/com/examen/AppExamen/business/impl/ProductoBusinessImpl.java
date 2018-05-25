/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.examen.AppExamen.business.impl;
import co.com.examen.AppExamen.business.IProductoBusiness;
import co.com.examen.AppExamen.dao.IProductoDao;
import co.com.examen.AppExamen.model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Aux Software
 */
@Service
public class ProductoBusinessImpl implements IProductoBusiness{

    @Autowired
    private IProductoDao productoDao;
    
    @Override
    public List<Producto> obtenerProductos() {
        return productoDao.obtenerProductos();
      }

    @Override
    public Producto obtenerProducto(String codigo) {
        return productoDao.obtenerProducto(codigo);
    }

    @Override
    public String crearProducto(Producto producto) {
        return productoDao.crearProducto(producto);
    }

    @Override
    public String eliminarProducto(String codigo) {
        return productoDao.eliminarProducto(codigo);
    }

    
    @Override
    public String modificarTProducto(Producto producto) {
        return productoDao.modificarTProducto(producto);
    }
    
}
