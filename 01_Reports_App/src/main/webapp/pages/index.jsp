<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Report App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">

</head>
<body>


<div class="container">
 <h3 class = "pb-3 pt-3">Report Application</h3>
 
 <form:form action="search " method="post" modelAttribute="Search">
    
   <table>
          <tr>
                 <td> Plan Name : </td>
                 <td>
                <form:select path="planName">
                 <form:option value="">-- Select Report Type --</form:option>
                 <form:options items = "${names}"/>
                </form:select>
                 </td> 
                 
                 <td> Plan Status : </td>
                 <td>
                <form:select path="planStatus">
                 <form:option value="">-- Select Report Type --</form:option>
                  <form:options items = "${status}"/>
                </form:select>
                 </td>
                 
                 <td> Gender : </td>
                 <td>
                <form:select path="gender">
                 <form:option value="">-- Select Report Type --</form:option>
                  <form:option value="Male">Male</form:option>
                   <form:option value="Femal">Female</form:option>
                </form:select>
                 </td>
                 <tr>
                  <td> Start Date : </td>
                 <td>
               
                <form:input path="startDate" type = "date" data-date-format="mm/dd/yyyy"/>
                 </td>
                
                  <td>  End Date : </td>
                 <td>
               <form:input path="endDate" type = "date" data-date-format="mm/dd/yyyy"/>
               
                 </td>
                 </tr>
                 
                 <tr>
                 <td>
                 <input type ="submit" value = "Search" class ="btn btn-primary" />
                 </td>
                 </tr>
   
   </tr>
   </table>

</form:form>

<hr/>



<hr/>

   Export : <a href="">Excel</a>  <a href="">Pdf</a>
</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>

</body>
</html>