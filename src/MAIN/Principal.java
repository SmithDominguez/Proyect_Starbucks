/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MAIN;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
   
import FORMULARIOS.Frm_Principal;
import FORMULARIOS.Frm_InicioSesion;
import FORMULARIOS.Frm_Encargado;
import CLASES.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
/**
 *
 * @author PC
 */
public class Principal {
    
    public static Frm_Principal pantallaPrincipal = new Frm_Principal();
    public static Frm_InicioSesion pantallaSesion = new Frm_InicioSesion();
    public static Frm_Encargado pantallaEncargado = new Frm_Encargado();
    public static List<Usuario> listaUsuarios = new ArrayList<>();
    
    
    public static void main(String[] args) {
        //Abrir pantalla Principal
        // Proyecto Starbucks
        // Comentario Prueba
        // Comentario del Domingo
        
        listaUsuarios.add(new Usuario("encargadoAlmacen@starbucks.com", "1234", "Encargado"));
        listaUsuarios.add(new Usuario("gerente@starbucks.com", "4321", "Gerente"));
        listaUsuarios.add(new Usuario("cajero@starbucks.com", "9876", "Cajero"));
        listaUsuarios.add(new Usuario("supervisor@starbucks.com", "6789", "Supervisor"));
        
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setSize(610, 510);
    }
}
