/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanyEXAMEN.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Christian
 */
public class conexion {
   private static final String URL="jdbc:oracle:thin:@35.153.143.158:ORCL";
	private static final String USER="PRODUCTOEX";
	private static final String PASS="123";
	private static final String DRIVER="oracle.jdbc.OracleDriver";
	private static Connection cx = null;
	
	public static Connection getConexion() {
		try {
			Class.forName(DRIVER);
			if(cx==null) {
				cx = DriverManager.getConnection(URL, USER, PASS);
			}
		} catch (Exception e) {
			//TODO: handle exception
			System.out.println("Error: "+e);
		}
		
		return cx;
	}
	public void desconectar() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

    
    
    
    
    
    
    
    
    
    
    
    

