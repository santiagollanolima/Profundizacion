/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examen.AppExamen.dao.impl;

import co.com.examen.AppExamen.dao.IProductoDao;
import co.com.examen.AppExamen.data.ProductoData;
import co.com.examen.AppExamen.model.Producto;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aux Software
 */
@Repository
public class ProductoDaoImpl implements IProductoDao {

    @Override
    public List<Producto> obtenerProductos() {
        return ProductoData.getListado();
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        Producto producto = null;
        List<Producto> listado = ProductoData.getListado();
        for (Producto pr : listado) {
            if (pr.getCodigo().equals(codigo)) {
                producto = pr;
            }
        }

        return producto;
    }

    @Override
    public String crearProducto(Producto producto) {
        String respuesta = "El producto ya existe";
        List<Producto> listado = ProductoData.getListado();

        if (!listado.contains(producto)) {
            Double cantidadProducto = 0.0;
            cantidadProducto = producto.getExistencia();
            if (cantidadProducto > 0.0 || cantidadProducto < 0.0) {
                respuesta = "La existencia del producto debe de ser cero";
                return respuesta;
            } else {
                listado.add(producto);
                ProductoData.setListado(listado);
                respuesta = "Producto registrado";
            }
        }
        return respuesta;
    }

    @Override
    public String eliminarProducto(String codigo) {
        String respuesta = "Producto Eliminado";
        List<Producto> listado = ProductoData.getListado();
        Producto producto = new Producto(codigo, "", 0.0, 0.0);        
        listado.remove(producto);
        ProductoData.getListado();
        return respuesta;
    }

    @Override
    public String modificarTProducto(Producto producto) {
        String respuesta = "Producto Actualizado";
        List<Producto> listado = ProductoData.getListado();
        listado.set(listado.indexOf(producto), producto);
        ProductoData.setListado(listado);
        return respuesta;
    }

}
