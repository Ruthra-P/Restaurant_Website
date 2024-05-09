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
public class AddRestaurantServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String r1=request.getParameter("r1");
        String r2=request.getParameter("r2");
        String r3=request.getParameter("r3");
        String r4=request.getParameter("r4");
        String r5=request.getParameter("r5");
        String r6=request.getParameter("r6");
        
        try{
           Class.forName("org.postgresql.Driver");
                Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_db", "postgres", "redleaf");
                java.sql.Statement stm=con.createStatement();
                
            String sql="INSERT INTO public.rest_book(name, email, date, time_, people_count, special)"+ 
                       "VALUES('"+r1+"', '"+r2+"', '"+r3+"', '"+r4+"', '"+r5+"', '"+r6+"');";
    
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
