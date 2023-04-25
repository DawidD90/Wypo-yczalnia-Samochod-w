<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>

        <!-- Page Content-->
        <div class="container-fluid p-0">

           <form method="get" action='<c:url value="/Rentacar/reservation"/>'>
            <!-- Interests-->
            <section class="resume-section" id="reservation">
                <div class="resume-section-content">
                    <h1 class="mb-5">Reservation</h1>

                    <div class="container-fluid p-0">
                        <!-- Cars-->
                        <c:forEach items="${reservationList}" var="reservation">
                                    <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                                        <div class="flex-grow-1">
                                            <h3 class="mb-0">Marka: ${reservation.carsModel.make}</h3>
                                            <div class="subheading mb-3">Model: ${reservation.carsModel.model}</div>
                                            <div class="subheading mb-3">Body Type: ${reservation.carsModel.bodyType}</div>
                                            <div class="subheading mb-3">Production Year: ${reservation.carsModel.productionYear}</div>
                                            <div class="subheading mb-3">Color: ${reservation.carsModel.color}</div>
                                            <div class="subheading mb-3">Mileage: ${reservation.carsModel.mileage} km</div>
                                            <div class="subheading mb-3">Status: ${reservation.carsModel.carStatus}</div>
                                            <div class="subheading mb-3">Price: ${reservation.carsModel.price}</div>
                                            <div class="subheading mb-3">Rent branch: ${reservation.carsModel.branchModel.address}</div>
                                            <div class="subheading mb-3">Booking period: ${dateFrom} - ${dateTo}</div>
                                            <div class="subheading mb-3">Date of reservation: ${reservation.reservationDate}</div>

                                        </div>

                                        <!-- Reservation Button -->
                                        <form method="post" action='<c:url value="/Rentacar/reservation"/>'>
                                            <input type="submit" value="make" class="btn btn-success">
                                        </form>
                                    </div>
                        </c:forEach>




                </div>
            </section>
            <!--</form>-->
        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
