/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examen.AppExamen.business.impl;

import co.com.examen.AppExamen.business.IMovimientoBusiness;
import co.com.examen.AppExamen.dao.IMovimientoDao;
import co.com.examen.AppExamen.model.Movimiento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Aux Software
 */
public class MovimientoBusinessImpl implements IMovimientoBusiness{

    @Autowired
    private IMovimientoDao movimientoDao;
    
    @Override
    public List<Movimiento> obtenerMovimientos() {
        return movimientoDao.obtenerMovimientos();
    }

    @Override
    public Movimiento obtenerMovimiento(String idmovimiento) {
        return movimientoDao.obtenerMovimiento(idmovimiento);
    }

    @Override
    public String crearMovimiento(Movimiento movimiento) {
        return movimientoDao.crearMovimiento(movimiento);
    }

    @Override
    public String eliminarMovimiento(String idmovimiento) {
        return movimientoDao.eliminarMovimientto(idmovimiento);
    }

    @Override
    public String modificarMovimiento(Movimiento movimiento) {
        return movimientoDao.modificarMovimiento(movimiento);
    }
    
}
