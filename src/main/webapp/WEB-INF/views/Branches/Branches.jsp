<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>


<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Experience-->

    <section class="resume-section" id="experience">
        <div class="resume-section-content">
            <h2 class="mb-5">Our Clients</h2>
            <c:forEach items="${branchModel}" var="title">
            <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                <div class="flex-grow-1">
                    <h3 class="mb-0">client name: ${title.address}</h3>
                    <div class="subheading mb-3">client surname: ${title.availableCars}</div>


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

                    <div class="form-group row">
                        <label class="col-2" for="exampleFormControlInput2">availableCars</label>
                        <div class="col-10">
                            <input type="text" class="form-control" id="exampleFormControlInput2" name="availableCars" placeholder="add availableCars">
                        </div>
                    </div>





                    <input type="submit" class="btn btn-success" value="Zapisz">
                </form>
            </div>


            <!-- Begin Page Content -->
            <div class="container-fluid">
                <form method="post" action='<c:url value="/branch"/>'>
                    <!-- Content Row -->
                    <div class="row">
                        <div class="col-xl-12 col-md-12 mb-12">
                            <div class="card shadow mb-4">
                                <div class="card-header py-3">


                                    <div class="form-group row">
                                        <label class="col-2 col-form-label">Wybierz oddział</label>
                                        <div class="col-10">
                                            <select class="form-control" name="branchModel.id">
                                                <option hidden>wybierz</option>
                                                <c:forEach items="${BranchModel}" var="example">
                                                    <option value="${example.id}">${example.address} ${example.availableCars}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>


                                </div>
                            </div>
                        </div>
                    </div>


                    <input class="btn btn-success pull-left" type="submit" value="Zapisz" id="searchButton"></input>
                </form>



            </div>
            <!-- /.container-fluid -->


    </section>
</div>

