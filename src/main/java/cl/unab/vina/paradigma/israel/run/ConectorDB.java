/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.unab.vina.paradigma.israel.run;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Alumno
 */
public class ConectorDB {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    public void conectarse(){
        String base_de_datos = "paradigma";
        
        try {
            this.connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/paradigma","root","Unab.2023");
            System.out.println("Conexion Correcto");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //test para git//            
                   
    }
}
