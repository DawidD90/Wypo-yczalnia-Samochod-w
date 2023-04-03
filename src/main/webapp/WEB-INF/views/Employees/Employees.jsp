<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>


<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Experience-->

    <section class="resume-section" id="experience">
        <div class="resume-section-content">
            <h2 class="mb-5">Our Employees</h2>

            <c:forEach items="${EmployeesModel}" var="title">
<table>

            <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                <div class="flex-grow-1">
                    <h3 class="mb-0">${title.name}  ${title.surname}</h3>
                    <div class="subheading mb-3">${title.position}</div>
                    <p>${title.workplace}</p>



                </div>
<%--                <form method="" action='<c:url value="/employees/${title.id}"/>'>--%>
<%--                    <input type="submit" value="usuń" class="btn btn-danger">--%>
<%--                </form>--%>
                <form method="post" action='<c:url value="/employees/${title.id}"/>'>
                    <input type="submit" value="usuń" class="btn btn-danger">
                </form>

</table>
            </c:forEach>
            </section>


<%--                <!-- Delete Button -->--%>
<%--                <form method="post" action='<c:url value="/employees/${title.id}"/>'>--%>
<%--                    <input type="submit" value="usuń" class="btn btn-danger">--%>

<%--                </form>--%>



            <section3>
                <div class="container">
                    <form method="post" action='<c:url value="/employees"/>'>
                        <div class="form-group row">
                            <label class="col-2" for="exampleFormControlInput1">Imie</label>
                            <div class="col-10">
                                <input type="text" class="form-control" id="exampleFormControlInput1" name="name" placeholder="uzupełnij name">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-2" for="exampleFormControlInput2">Nazwisko</label>
                            <div class="col-10">
                                <input type="text" class="form-control" id="exampleFormControlInput2" name="surname" placeholder="uzupełnij surname">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-2" for="exampleFormControlInput3">position</label>
                            <div class="col-10">
                                <textarea type="text" class="form-control" rows="5" id="exampleFormControlInput3" name="position" placeholder="uzupełnij position"></textarea>
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-2" for="exampleFormControlInput3">workplace</label>
                            <div class="col-10">
                                <textarea type="text" class="form-control" rows="5" id="exampleFormControlInput4" name="workplace" placeholder="uzupełnij workplace"></textarea>
                            </div>
                        </div>


                        <input type="submit" class="btn btn-success" value="Zapisz">
                    </form>
                </div>
            </section3>



</div>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="js/scripts.js"></script>
</body>
</html>
