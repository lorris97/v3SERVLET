<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
             <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    
    <body>
        <table class="table table-striped table-dark">
            <tr>
                <td>Voici la liste des méthodes </td>
            </tr>
               <c:forEach items="${liste}" var="element">
                   <tr>
                       <td>
                           ${element}
                       </td>
                   </tr>
               </c:forEach>
            
            
            
        </table>
    </body>
</html>
