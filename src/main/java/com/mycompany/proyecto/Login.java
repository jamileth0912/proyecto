/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

import java.sql.Connection;
import java.sql.SQLException;

public class Login {
    
    public static void main(String[] args) {
        
        try (Connection cn = Conexion.conectar()) {
            System.out.println("Conexión correcta con Mysql");
        } catch (SQLException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
        
    }
    
}
