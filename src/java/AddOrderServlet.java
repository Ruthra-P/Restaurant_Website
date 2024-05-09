/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ruthra
 */
public class AddOrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String m1=request.getParameter("m1");
        String m2=request.getParameter("m2");
        String m3=request.getParameter("m3");
        String m4=request.getParameter("m4");
        String m5=request.getParameter("m5");
         
        try{
           Class.forName("org.postgresql.Driver");
                Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_db", "postgres", "redleaf");
                java.sql.Statement stm=con.createStatement();
                
            String sql="INSERT INTO public.order_book(name, email, mobile, address,  food)"+ 
                       "VALUES('"+m1+"', '"+m2+"', '"+m3+"', '"+m4+"', '"+m5+"');";
    
            if(stm.executeUpdate(sql)>0)
                  {
                    out.write("Success");
                }
                else{
                    out.write("Unable to Add");
                }
                 
                 con.close();
                    
        }
        catch(Exception e)
                    {
                        out.write("Error"+e);
                    }

     }

    

}
