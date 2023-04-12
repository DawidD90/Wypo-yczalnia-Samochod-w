<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>


<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Experience-->

    <section class="resume-section" id="branches">
        <div class="resume-section-content">
            <h2 class="mb-5">Our Branches</h2>
            <div>
            <c:forEach items="${branchModel}" var="title">

            <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                <div class="flex-grow-1">
                    <h3 class="mb-0">Branch address: ${title.address}</h3>
<%--                    <div class="subheading mb-3">Cars available in branch: ${title.availableCars}</div>--%>

                </div>
                </div>

                <!-- Delete Button -->
                <form method="post" action='<c:url value="/branch/${title.id}"/>'>
                    <input type="submit" value="usuń" class="btn btn-danger">

                </form>

                </c:forEach>
            </div>



            <div class="container">
                <form method="post" action='<c:url value="/branch"/>'>
                    <div class="form-group row">
                        <label class="col-2" for="exampleFormControlInput1">address</label>
                        <div class="col-10">
                            <input type="text" class="form-control" id="exampleFormControlInput1" name="address" placeholder="add address">
                        </div>
                    </div>

<%--                    <div class="form-group row">--%>
<%--                        <label class="col-2" for="exampleFormControlInput2">availableCars</label>--%>
<%--                        <div class="col-10">--%>
<%--                            <input type="text" class="form-control" id="exampleFormControlInput2" name="availableCars" placeholder="add availableCars">--%>
<%--                        </div>--%>
                    </div>

                    <input type="submit" class="btn btn-success" value="Zapisz">
                </form>
            </div>





    </section>
</div>

