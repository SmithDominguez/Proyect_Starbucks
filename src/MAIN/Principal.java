/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MAIN;

import CLASES.Cliente;
<<<<<<< HEAD
import CLASES.Pedido;
=======
import CLASES.Empleado;
import CLASES.Horario;
import CLASES.Inventario;
>>>>>>> 94f84d8f57cd2a48743240025d9257af15646579
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
   
import FORMULARIOS.Frm_Principal;
import FORMULARIOS.Frm_Gerente;
import FORMULARIOS.Frm_Encargado;
import FORMULARIOS.Frm_Cajero;
import CLASES.Usuario;
import CLASES.Reclamo;
<<<<<<< HEAD
import CLASES.Pedido;
import CLASES.Producto;
=======
import CLASES.Reporte;
import CLASES.SolicitudCompra;
import java.text.SimpleDateFormat;
>>>>>>> 94f84d8f57cd2a48743240025d9257af15646579
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.SwingUtilities;
/**
 *
 * @author PC
 */
public class Principal {
    
    public static Frm_Principal pantallaPrincipal;
    public static Frm_Gerente pantallaGerente;
    public static Frm_Encargado pantallaEncargado;
    public static Frm_Cajero pantallaCajero;
    
    public static List<Usuario> listaUsuarios = new ArrayList<>();
    public static List<Reclamo> listaReclamos = new ArrayList<>();
    public static List<Cliente> listaClientes = new ArrayList<>();
    public static List<Empleado> listaEmpleados = new ArrayList<>();
    public static List<Horario> listaHorarios = new ArrayList<>();
    public static List<Reporte> listaReportes = new ArrayList<>();
    public static List<Inventario> listaInventario = new ArrayList<>();
    public static List<SolicitudCompra> listaSolicitudCompra = new ArrayList<>();
    
    public static List<Pedido> listaPedidos = new ArrayList<>();
    public static List<Producto> listaProductos = new ArrayList<>();

    
    public static void main(String[] args) {
        //Abrir pantalla Principal
        // Proyecto Starbucks
        // Comentario Prueba
        // Comentario del Domingo
        pantallaPrincipal = new Frm_Principal();
        pantallaGerente = new Frm_Gerente();
        pantallaEncargado = new Frm_Encargado();
        pantallaCajero = new Frm_Cajero();
        
        listaEmpleados.add(new Empleado("12345", "Alberto Doriban"));
        listaEmpleados.add(new Empleado("54321", "Juan Granjero"));
        
        listaClientes.add(new Cliente("12345", "Josesito Marcino"));
        listaClientes.add(new Cliente("54321", "Jabo Jorge"));
        
        listaUsuarios.add(new Usuario("encargadoAlmacen@starbucks.com", "1234", "Encargado"));
        listaUsuarios.add(new Usuario("gerente@starbucks.com", "4321", "Gerente"));
        listaUsuarios.add(new Usuario("cajero@starbucks.com", "9876", "Cajero"));
        listaUsuarios.add(new Usuario("supervisor@starbucks.com", "6789", "Supervisor"));
        
<<<<<<< HEAD
        cargarProductosStarbucks(); // Carga los productos primero
        pantallaCajero = new Frm_Cajero(); 
=======
        //Reportes de prueba
        listaReportes.add(new Reporte("Josesito Marcino", new Date(2025,6,10), "Alberto Doriban", "Cafe", "Efectivo"));
        listaReportes.add(new Reporte("Jabo Jorge", new Date(2025,6,8), "Alberto Doriban", "Pan", "Efectivo"));
        listaReportes.add(new Reporte("Josesito Marcino", new Date(2025,6,9), "Juan Granjero", "Cafe", "Tarjeta"));
        listaReportes.add(new Reporte("Josesito Marcino", new Date(2025,6,10), "Juan Granjero", "Cafe", "Efectivo"));
        listaReportes.add(new Reporte("Jabo Jorge", new Date(2025,6,10), "Juan Granjero", "Pan", "Tarjeta"));
        
        //Inventario de prueba
>>>>>>> 94f84d8f57cd2a48743240025d9257af15646579
        
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setSize(610, 510);
        
        
        
        
        
    }
    public static void cargarProductosStarbucks() {
    listaProductos.add(new Producto("Frappuccino", 12.50));
    listaProductos.add(new Producto("Café Latte", 8.00));
    listaProductos.add(new Producto("Capuccino", 9.50));
    listaProductos.add(new Producto("Mocha", 10.00));
    listaProductos.add(new Producto("Americano", 7.00));
    listaProductos.add(new Producto("Espresso", 6.50));
    listaProductos.add(new Producto("Cold Brew", 11.00));
    listaProductos.add(new Producto("Chocolate Caliente", 8.50));
    listaProductos.add(new Producto("Té Chai Latte", 9.00));
    listaProductos.add(new Producto("Té Verde Matcha", 9.50));
}

}
