/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author xyw
 */
public class Reclamo {
    private String codigo;
    private String cliente;
    private String fecha;
    private String tipo;
    private String descripcion;

    public Reclamo(String codigo, String cliente, String fecha, String tipo, String descripcion) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }
    public String getTipo() {
        return tipo;
    }
    public String getDescripcion() {
        return descripcion;
    }
}
