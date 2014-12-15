package com.jc.controladores; 

 
 import com.jc.model.DAOCliente; 
 import java.io.IOException; 
 import java.io.PrintWriter; 
 import javax.servlet.ServletException; 
 import javax.servlet.http.HttpServlet; 
 import javax.servlet.http.HttpServletRequest; 
 import javax.servlet.http.HttpServletResponse; 
 

 
 
 public class ServletGuardarLibros extends HttpServlet { 
 
 
     
     protected void doGet(HttpServletRequest request, HttpServletResponse response) 
           throws ServletException, IOException { 
       response.setContentType("text/html;charset=UTF-8"); 
        PrintWriter out = response.getWriter(); 
          
        //pedimos datos al cliente         String nombre= request.getParameter("nombre_Libro"); 
        String direccion= request.getParameter("direccion"); 
        String nombre= request.getParameter("nombre");
          
       try{ 
          //se invoca el procedimiento 
         //     out.println(DAOCliente.guardarLibro(nombre,direccion)); 
           out.println("nmamsnakshakshais");
              
         }catch(Exception e){} 
     } 
 } 
