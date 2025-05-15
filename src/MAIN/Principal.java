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
import java.util.List;
import javax.swing.SwingUtilities;
/**
 *
 * @author PC
 */
public class Principal {
    
    public static Frm_Principal pantallaPrincipal = new Frm_Principal();
    public static Frm_InicioSesion pantallaSesion = new Frm_InicioSesion();
 
    public static void main(String[] args) {
        //Abrir pantalla Principal
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setSize(610, 510);
    }
}
