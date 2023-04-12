<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="dynamic/header.jspf"%>


        <!-- Page Content-->
        <div class="container-fluid p-0">
            <!-- About-->
            <section class="resume-section" id="about Us">
                <div class="resume-section-content">
                    <h1 class="mb-0">

                        <span class="text-primary">RentoCars</span>
                    </h1>
                    <p class="lead mb-5">Do you need a car for a day, a week or maybe for longer? With us you can rent cars from many different global brands. Check out our offers!</p>
                    <div class="subheading mb-5">
                        <h2 class="mb-5">Our Branches</h2>
                        <div>
                        <c:forEach items="${branchModel}" var="title">
                        <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                            <div class="flex-grow-1">
                                <h3 class="mb-0">Branch address: ${title.address}</h3>
                            </div>

                            </div>



                            </c:forEach>
                        </div>

                    </div>


                </div>
            </section>
        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
