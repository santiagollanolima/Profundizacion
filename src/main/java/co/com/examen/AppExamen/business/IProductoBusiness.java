/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examen.AppExamen.business;

import co.com.examen.AppExamen.model.Producto;
import java.util.List;

/**
 *
 * @author Aux Software
 */
public interface IProductoBusiness {
    List<Producto> obtenerProductos();
    Producto obtenerProducto(String codigo);
    String crearProducto(Producto producto);
    String eliminarProducto(String codigo);
    String modificarTProducto(Producto producto);
}
