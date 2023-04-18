<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>

        <!-- Page Content-->
        <div class="container-fluid p-0">

            <form method="get" action='<c:url value="/Rentacar/RentAvailableCar/${id}"/>'>
            <!-- Interests-->
            <section class="resume-section" id="rentACar">
                <div class="resume-section-content">
                    <h1 class="mb-5">Rent a car</h1>

                    <div class="container-fluid p-0">
                        <!-- Cars-->
                                <c:forEach items="${carsByBranch}" var="title">
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


                                    </div>

                                </c:forEach>



                </div>
            </section>
            </form>
        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
