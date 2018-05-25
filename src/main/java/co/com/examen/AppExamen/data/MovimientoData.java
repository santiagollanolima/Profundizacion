/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examen.AppExamen.data;

import co.com.examen.AppExamen.model.Movimiento;
import co.com.examen.AppExamen.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aux Software
 */
public class MovimientoData {
   private static List<Movimiento> listado;    
    static {        
        Producto producto = new Producto();
        listado = new ArrayList<Movimiento>(){
            {
                add(new Movimiento("1", producto, 10D, "Entrada", 100D));
                add(new Movimiento("2", producto, 10D, "Entrada", 100D));

            }
        };
    }
    public static List<Movimiento> getListado() {
        return listado;
    }

    public static void setListado(List<Movimiento> aListado) {
        listado = aListado;
    } 
}
