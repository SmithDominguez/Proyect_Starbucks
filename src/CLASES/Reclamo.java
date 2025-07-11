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
public class Reclamo {
    private int codigo;
    private String dniCliente;
    private Date fecha;
    private String tipo;
    private String observacion;

    public Reclamo(int codigo, String dniCliente, Date fecha, String tipo, String observacion) {
        this.codigo = codigo;
        this.dniCliente = dniCliente;
        this.fecha = fecha;
        this.tipo = tipo;
        this.observacion = observacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDNICliente() {
        return dniCliente;
    }

    public Date getFecha() {
        return fecha;
    }
    public String getTipo() {
        return tipo;
    }
    public String getObservacion() {
        return observacion;
    }
}
