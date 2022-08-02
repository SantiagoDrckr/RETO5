/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ansab
 */
public class Conexion {
// crear nstancia de connection
    Connection connection;
    //atributos
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto4";
    String usuario = "root";
    String contrasena = "";
// añadir constructor sin argumentos de la clase
public Conexion(){
    
        //generar conexion base datos
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(cadenaConexion, usuario, contrasena);
            //verificsar conexion
            if(connection!= null ){
                System.out.println("conexion exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("fallo al conectar");
        }
        
    }
    // funcion de retorno clase de conexion 
    public Connection getConnetion(){
        return  connection;
    }

    
}
