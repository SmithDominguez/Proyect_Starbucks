/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author xyw
 */
public class Cliente {
    private String DNI;
    private String nombreCliente;

    public Cliente(String DNI, String nombreCliente) {
        this.DNI = DNI;
        this.nombreCliente = nombreCliente;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    
}
