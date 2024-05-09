<%-- 
    Document   : newjsp
    Created on : 30-Apr-2024, 4:01:13 PM
    Author     : Ruthra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

        <title>Registration Form</title>
    </head>
    <body>
        <div class="container">
            <h1>Registration Form</h1>
            <div class="row" style="margin-top: 10px" >
                <div class="col-6">
                    <form action="reg.jsp">
                        <div class="row " style="margin-top: 10px" >
                            <div class="col-12">
                                Student Name : <input type="text" id="f1" name="name">
                            </div>
                        </div>
                        <div class="row" style="margin-top: 10px">
                            <div class="col-12">
                                Father Name : <input type="text" id="f2" name="fname">
                            </div>
                        </div>
                        
                        <div class="row" style="margin-top: 10px">
                            <div class="col-12">
                                Gender :
                                <select name="gender" id="f3">
                                    <option>Female</option>
                                    <option>Male</option>
                                     <option>Other</option>
                                </select>
                                
                                Address: <input type="text" name="add" id="f4" >
                            </div>
                        </div>
                        
                        <div class="row" style="margin-top: 10px">
                            <div class="col-12">
                                Country:
                                <select id="f5" name="country">
                                    <option>India</option>
                                     <option>Other</option>
                                </select>
                            </div>
                        </div>
                        
                    <div class="row" style="margin-top: 10px">
                            <div class="col-12">      
             <button>Submit</button>
                         </div>
                        </div>
                    </form>
                </div>
            </div>

        </div>
        
         
    </body>
</html>
