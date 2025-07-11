/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author xyw
 */
public class Empleado {
    private String DNI;
    private String nombreEmpleado;

    public Empleado(String DNI, String nombreEmpleado) {
        this.DNI = DNI;
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
}
