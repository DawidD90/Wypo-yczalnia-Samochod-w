<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/header.jspf" %>


<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Cars-->
    <section class="resume-section" id="education">
        <div class="resume-section-content">
            <h2 class="mb-5">Cars</h2>
<c:forEach items="${carsModel}" var="title">
            <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                <div class="flex-grow-1">
                    <h3 class="mb-0">Marka: ${title.make}</h3>
                    <div class="subheading mb-3">Model: ${title.model}</div>
                    <div class="subheading mb-3">Body Type: ${title.bodyType}</div>
                    <div class="subheading mb-3">Production Year: ${title.productionYear}</div>
                    <div class="subheading mb-3">Color: ${title.color}</div>
                    <div class="subheading mb-3">Mileage: ${title.mileage} km</div>
<                   <div class="subheading mb-3">Status: ${title.carStatus}</div>
                    <div class="subheading mb-3">Price: ${title.price}</div>
                </div>
                <!-- Delete Button -->
                <form method="post" action='<c:url value="/cars/${title.id}"/>'>
                    <input type="submit" value="usuń" class="btn btn-danger">
                </form>

            </div>

</c:forEach>
        </div>
    </section>

    <div class="container">
        <form method="post" action='<c:url value="/cars"/>'>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput1">Make</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput1" name="make" placeholder="Please provide make of the car">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput2">Model</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput2" name="model" placeholder="Please provide model of the car">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput3">Body Type</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput3" name="bodyType" placeholder="please provide body type">
                </div>
            </div>

            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput4">Production Year</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput4" name="productionYear" placeholder="please provide production year">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput5">Color</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput5" name="color" placeholder="please provide color">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput6">Mileage</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput6" name="mileage" placeholder="please provide mileage">
                </div>
            </div>

            <div class="form-group row">
                <label class="col-2 col-form-label">Status</label>
                <div class="col-10">
                    <select class="form-control" name="carsModel.id">
                        <option hidden>wybierz</option>
                        <c:forEach items="${carStatus}" var="example">
                            <option value="${example}">${example}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>




            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput8">Price</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput8" name="price" placeholder="please provide rental fee">
                </div>
            </div>

            <input type="submit" class="btn btn-success" value="Save">
        </form>


    </div>



</div>
