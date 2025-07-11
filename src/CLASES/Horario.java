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
public class Horario {
    private String DNIEmpleado;
    private Date fecha;
    private String turno;

    public Horario(String DNIEmpleado, Date fecha, String turno) {
        this.DNIEmpleado = DNIEmpleado;
        this.fecha = fecha;
        this.turno = turno;
    }

    public String getDNIEmpleado() {
        return DNIEmpleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getTurno() {
        return turno;
    }
}
