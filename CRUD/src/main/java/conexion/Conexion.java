/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    String hostname = "127.0.0.1";
    String jdbcUrl = "jdbc:mysql://"+hostname+":33064/db_escuela";
    String user = "root";
    String password = "jesusmiguel";
    
    Connection con;
    
    
    public Conexion(){
        try {
            con = DriverManager.getConnection(jdbcUrl, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al conectar con la DB" +e);
        }
    }
    
    public Connection getConexion(){
        return con;
    }
}
