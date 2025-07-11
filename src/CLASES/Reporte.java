/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import java.util.Date;

/**
 *
 * @author xyw
 */
public class Reporte {
    private String cliente;
    private Date fecha;
    private String empleado;
    private String producto;
    private String tipoPago;

    public Reporte(String cliente, Date fecha, String empleado, String producto, String tipoPago) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.empleado = empleado;
        this.producto = producto;
        this.tipoPago = tipoPago;
    }

    public String getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getEmpleado() {
        return empleado;
    }

    public String getProducto() {
        return producto;
    }

    public String getTipoPago() {
        return tipoPago;
    }
}
