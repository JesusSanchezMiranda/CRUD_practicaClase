/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab02
 */
public class MySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String hostname = "127.0.0.1";
        String jdbcUrl = "jdbc:mysql://" + hostname + ":33064/db_escuela";
        String user = "root";
        String password = "jesusmiguel";

        Connection con = null;

        try {
            con = DriverManager.getConnection(jdbcUrl, user, password);
            if (con != null) {
                JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "hubo un error en la conexion, error: " + e);
        }
    }

}
