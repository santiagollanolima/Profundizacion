/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examen.AppExamen.dao.impl;

import co.com.examen.AppExamen.dao.IMovimientoDao;
import co.com.examen.AppExamen.dao.impl.ProductoDaoImpl;
import co.com.examen.AppExamen.data.MovimientoData;
import co.com.examen.AppExamen.data.ProductoData;
import co.com.examen.AppExamen.model.Movimiento;
import co.com.examen.AppExamen.model.Producto;
import java.util.List;

/**
 *
 * @author Aux Software
 */
public class MovimientoDaoImpl implements IMovimientoDao {

    @Override
    public List<Movimiento> obtenerMovimientos() {
        return MovimientoData.getListado();
    }

    @Override
    public Movimiento obtenerMovimiento(String idmovimiento) {
        Movimiento movimiento = null;
        List<Movimiento> listado = MovimientoData.getListado();
        for (Movimiento mo : listado) {
            if (mo.getIdMovimiento().equals(idmovimiento)) {
                movimiento = mo;
            }
        }

        return movimiento;
    }

    @Override
    public String crearMovimiento(Movimiento movimiento) {
        String respuesta = "El movimiento ya existe";
        List<Producto> listado = ProductoData.getListado();
        List<Movimiento> listadoMovi = MovimientoData.getListado();
        
        if (!listadoMovi.contains(movimiento)) {
            Producto producto = null;
            if (!listado.contains(producto)) {
                for (int i = 0; i <= listado.size(); i = i + 1) {
                    if (listado.get(i).getCodigo() == movimiento.getProducto().getCodigo()) {
                        producto = new Producto(movimiento.getProducto().getCodigo(), movimiento.getProducto().getNombre(),
                                movimiento.getProducto().getStock(), movimiento.getProducto().getExistencia());
                    }
                }
                if (producto == null) {
                    respuesta = "No existe el producto";
                    return respuesta;
                } else {
                    if (movimiento.getTipo() == "Entrada") {
                        if (movimiento.getPrecio() > 0) {
                            producto.setExistencia(producto.getExistencia() + movimiento.getCantidad());
                            ProductoDaoImpl producton = new ProductoDaoImpl();
                            producton.modificarTProducto(producto);
                        } else {
                            respuesta = "El precio del movimiento debe de ser mayor a cero";
                            return respuesta;
                        }
                    } else {
                        if(movimiento.getCantidad() > 0) {
                            if (movimiento.getCantidad() < producto.getExistencia()){
                                producto.setExistencia(producto.getExistencia() - movimiento.getCantidad());
                                movimiento.setPrecio(0.0);
                                ProductoDaoImpl producton = new ProductoDaoImpl();
                                producton.modificarTProducto(producto);
                            }else{
                                respuesta = "La cantidad no puede ser mayor a la existencia";
                                return respuesta;
                            }
                        
                        }else {
                            respuesta = "La cantidad del movimiento debe de ser mayor a cero";
                            return respuesta;
                        }
                        
                        
                    }

                }
            }

        }
        return respuesta;
    }

    @Override
    public String eliminarMovimientto(String idmovimiento) {
        Producto producto = new Producto();
        String respuesta = "Movimiento Eliminado";
        List<Movimiento> listado = MovimientoData.getListado();
        Movimiento movimiento = new Movimiento(idmovimiento, producto, 0.0, "", 0.0);        
        listado.remove(movimiento);
        MovimientoData.getListado();
        return respuesta;
    }

    @Override
    public String modificarMovimiento(Movimiento movimiento) {
        String respuesta = "Movimiento Actualizado";
        List<Movimiento> listado = MovimientoData.getListado();
        listado.set(listado.indexOf(movimiento), movimiento);
        MovimientoData.setListado(listado);
        return respuesta;
    }

}
