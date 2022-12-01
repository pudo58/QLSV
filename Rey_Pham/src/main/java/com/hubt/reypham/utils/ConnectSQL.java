/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hubt.reypham.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tho.lv
 */
public class ConnectSQL {
    public static Connection conn = null ;
    static {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://18.143.34.109:5432/QLSV?sslmode=require","dbmasteruser","lavantho0508");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        
    }
}
