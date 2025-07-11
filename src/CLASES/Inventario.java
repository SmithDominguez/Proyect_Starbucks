/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author xyw
 */
public class Inventario {
    private int Codigo;
    private String Producto;
    private int Cantidad;

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Inventario(int Codigo, String Producto, int Cantidad) {
        this.Codigo = Codigo;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getProducto() {
        return Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }
    
}
