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
                    <c:forEach items="${clientModel}" var="title">
                        <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                            <div class="flex-grow-1">
                                <h3 class="mb-0">client name: ${title.name}</h3>
                                <div class="subheading mb-3">client surname: ${title.surname}</div>
                                <div class="subheading mb-3">email: ${title.email}</div>
                                <div class="subheading mb-3">address: ${title.address}</div>

                            </div>

                            <!-- Delete Button -->
                            <form method="post" action='<c:url value="/client/${title.id}"/>'>
                                <input type="submit" value="usuń" class="btn btn-danger">

                            </form>

                             </c:forEach>
                        </div>



                            <div class="container">
                                <form method="post" action='<c:url value="/client"/>'>
                                    <div class="form-group row">
                                        <label class="col-2" for="exampleFormControlInput1">NAME</label>
                                        <div class="col-10">
                                            <input type="text" class="form-control" id="exampleFormControlInput1" name="name" placeholder="add name">
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <label class="col-2" for="exampleFormControlInput2">SURNAME</label>
                                        <div class="col-10">
                                            <input type="text" class="form-control" id="exampleFormControlInput2" name="surname" placeholder="add surname">
                                        </div>
                                    </div>


                                    <div class="form-group row">
                                        <label class="col-2" for="exampleFormControlInput3">EMAIL</label>
                                        <div class="col-10">
                                            <textarea type="text" class="form-control" rows="5" id="exampleFormControlInput3" name="email" placeholder="add email"></textarea>
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <label class="col-2" for="exampleFormControlInput4">ADDRESS</label>
                                        <div class="col-10">
                                            <textarea type="text" class="form-control" rows="5" id="exampleFormControlInput4" name="address" placeholder="add address"></textarea>
                                        </div>
                                    </div>


                                    <input type="submit" class="btn btn-success" value="Zapisz">
                                </form>
                            </div>



            </section>
        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
