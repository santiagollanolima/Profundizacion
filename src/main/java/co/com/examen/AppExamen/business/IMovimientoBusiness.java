/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examen.AppExamen.business;

import co.com.examen.AppExamen.model.Movimiento;
import java.util.List;

/**
 *
 * @author Aux Software
 */
public interface IMovimientoBusiness {
    List<Movimiento> obtenerMovimientos();
    Movimiento obtenerMovimiento(String idmovimiento);
    String crearMovimiento(Movimiento movimiento);
    String eliminarMovimiento(String idmovimiento);
    String modificarMovimiento(Movimiento movimiento);
    
}
