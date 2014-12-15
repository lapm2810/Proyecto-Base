package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author Brenda
 */
public class DAOCliente {
    public static String guardarCliente(String nombre,String direccion)throws Exception{
         Conexion c=new Conexion();
        Connection con=c.conectarse();
     CallableStatement callate=con.prepareCall("{call guardarCliente(?,?,?,?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.registerOutParameter(2,java.sql.Types.INTEGER);
        callate.registerOutParameter(3,java.sql.Types.INTEGER);
        callate.registerOutParameter(4,java.sql.Types.INTEGER);
        callate.setString(5,nombre);
        callate.setString(6,direccion);
 
        
      
        callate.execute();
        int pk=callate.getInt(1);
        return "GuardarCliente "+pk;
    }
    
}

    
    

