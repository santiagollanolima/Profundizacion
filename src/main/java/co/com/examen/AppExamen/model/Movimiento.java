/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.examen.AppExamen.model;

import java.util.Objects;

/**
 *
 * @author giovanny
 */
public class Movimiento {
    
    private String idMovimiento;
    private Producto producto;
    private Double cantidad;
    private String tipo;
    private Double precio;

    public Movimiento() {
    }

    public Movimiento(String idMovimiento, Producto producto, Double cantidad, String tipo, Double precio) {
        this.idMovimiento = idMovimiento;
        this.producto = producto;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(String idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.idMovimiento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movimiento other = (Movimiento) obj;
        if (!Objects.equals(this.idMovimiento, other.idMovimiento)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
