<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/10/2022
  Time: 8:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="bootstrap4.6.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="datatables/css/datatables.bootstrap4.min.css">

    <script src="jquery/jquery-3.6.0.min.js"></script>
    <script src="bootstrap4.6.0/js/bootstrap.min.js"></script>

    <script src="datatables/js/jquery.dataTables.min.js"></script>
    <script src="datatables/js/dataTables.bootstrap4.min.js"></script>
</head>
<body>
<table id="tableStudent" class="table table-striped">
    <thead>
    <tr>
        <th>Name</th>
        <th>Birthday</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customerList}" var="customer" varStatus="status">
        <tr>
            <td>${customer.customer_name}</td>
            <td>${customer.customer_birthday}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script>
    $(document).ready(function() {
        $('#tableStudent').dataTable( {
            "dom": 'lrtip',
            "lengthChange": false,
            // lengthMenu: [[3, 5, 7, -1],[3, 5, 7, "All"]],
            "pageLength": 4
        } );
    } );
</script>
</body>
</html>
