/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examen.AppExamen.data;

import co.com.examen.AppExamen.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aux Software
 */
public class ProductoData {
    private static List<Producto> listado;    
    static {        
        listado = new ArrayList<Producto>(){
            {
                add(new Producto("10", "Agua", 2D, 10D));
                add(new Producto("20", "Gaseosa", 3D,5D));
                add(new Producto("30", "Malta", 4D, 2D));
            }
        };
    }
    public static List<Producto> getListado() {
        return listado;
    }

    public static void setListado(List<Producto> aListado) {
        listado = aListado;
    }
}
