<%-- 
    Document   : reg
    Created on : 30-Apr-2024, 4:39:09 PM
    Author     : Ruthra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registration Form</h1>
         <%
            String f1=request.getParameter("f1");
             String f2 =request.getParameter("f2"); 
             String f3=request.getParameter("f3");
             String f4=request.getParameter("f4");
             String f5=request.getParameter("f5");


out.print("Name:" +f1+"");
out.print("Father Name:" +f2+"");
out.print("Gender:" +f3+"");
out.print("Address:" +f4+"");
out.print("Country:" +f5+"");

            %>
    </body>
</html>
