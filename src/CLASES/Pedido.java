/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author sofia
 */
public class Pedido {
    
    private String cliente;
    private String producto;
    private String tipoPago;
    private double total;
    
    public Pedido(String cliente, String producto, String tipoPago, double total) {
        
        this.cliente = cliente;
        this.producto = producto;
        this.tipoPago = tipoPago;
        this.total = total;
        
    }
     
    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setProducto(String producto) { this.producto = producto; }
    public void setTipoPago(String tipoPago) { this.tipoPago = tipoPago; }
    public void setTotal(double total) { this.total = total; }
    
    // Getters
public String getCliente() { return cliente; }
public String getProducto() { return producto; }
public String getTipoPago() { return tipoPago; }
public double getTotal() { return total; }

  
}
