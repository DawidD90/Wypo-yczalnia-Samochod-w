<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/header.jspf" %>


<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Cars-->
    <section class="resume-section" id="cars">
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
                    <div class="subheading mb-3">Status: ${title.carStatus}</div>
                    <div class="subheading mb-3">Branch: ${title.branchModel.address}</div>
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

    <div class="card-header py-3">


        <a href='<c:url value="/cars/addCar"/>' class="btn btn-info btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-info-circle"></i>
                    </span>
            <span class="text">Add new car</span>
        </a>


    </div>




</div>
