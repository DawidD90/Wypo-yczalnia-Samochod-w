<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>


<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Experience-->

    <section class="resume-section" id="empployees">
        <div class="resume-section-content">
            <h2 class="mb-5">Our Employees</h2>

            <c:forEach items="${EmployeesModel}" var="title">
<table>

            <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                <div class="flex-grow-1">
                    <h3 class="mb-0">${title.name}  ${title.surname}</h3>
                    <div class="subheading mb-3">${title.position}</div>
                    <p>${title.branchModel.address}</p>



                </div>
<%--                <form method="" action='<c:url value="/employees/${title.id}"/>'>--%>
<%--                    <input type="submit" value="usuń" class="btn btn-danger">--%>
<%--                </form>--%>
                <security:authorize access="hasAnyRole('ROLE_Admin')">


                <form method="post" action='<c:url value="/employees/${title.id}"/>'>
                    <input type="submit" value="Delete" class="btn btn-danger">
                </form>
                </security:authorize>

</table>
            </c:forEach>
            </section>


<%--                <!-- Delete Button -->--%>
<%--                <form method="post" action='<c:url value="/employees/${title.id}"/>'>--%>
<%--                    <input type="submit" value="usuń" class="btn btn-danger">--%>

<%--                </form>--%>


    <div class="card-header py-3">

<security:authorize access="hasAnyRole('ROLE_Admin')">
        <a href='<c:url value="/employees/addEmployee"/>' class="btn btn-info btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-info-circle"></i>
                    </span>
            <span class="text">Add new Employee</span>
        </a>
</security:authorize>

    </div>


</div>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="js/scripts.js"></script>
</body>
</html>
