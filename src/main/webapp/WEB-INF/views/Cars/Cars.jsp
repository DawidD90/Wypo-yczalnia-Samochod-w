<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/header.jspf" %>


<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Education-->
    <section class="resume-section" id="education">
        <div class="resume-section-content">
            <h2 class="mb-5">Cars</h2>
<c:forEach items="${carsModel}" var="title">
            <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                <div class="flex-grow-1">
                    <h3 class="mb-0">${title.make}</h3>
                    <div class="subheading mb-3">${title.model}</div>
                    <div class="subheading mb-3">${title.bodyType}</div>
                    <div class="subheading mb-3">${title.productionYear}</div>
                    <div class="subheading mb-3">${title.color}</div>
                    <div class="subheading mb-3">${title.mileage}</div>
                    <div class="subheading mb-3">${title.status}</div>
                    <div class="subheading mb-3">${title.price}</div>
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
                <label class="col-2" for="exampleFormControlInput1">Marka</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput1" name="make" placeholder="podaj markę pojazdu">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput2">Model</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput2" name="model" placeholder="podaj model pojazdu">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput3">Rodzaj nadwozia</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput3" name="bodyType" placeholder="podaj rodzaj nadwozia pojazdu">
                </div>
            </div>

            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput4">Rok produkcji</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput4" name="ProductionYear" placeholder="podaj rok produkcji pojazdu">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput5">Kolor</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput5" name="Color" placeholder="podaj kolor pojazdu">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput6">Przebieg</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput6" name="Mileage" placeholder="podaj przebieg pojazdu">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput7">Status</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput7" name="Status" placeholder="podaj status pojazdu">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput8">Cena</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput8" name="Price" placeholder="podaj cenę pojazdu">
                </div>
            </div>

            <input type="submit" class="btn btn-success" value="Zapisz">
        </form>


    </div>



</div>
