<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>

        <!-- Page Content-->
        <div class="container-fluid p-0">

            <form method="post" action='<c:url value="/Rentacar"/>'>
            <!-- Interests-->
            <section class="resume-section" id="rentACar">
                <div class="resume-section-content">
                    <h1 class="mb-5">Rent a car</h1>



                    <!DOCTYPE html>
                    <html>

                    <head>
                        <title>Nice Looking Form</title>
                        <style>

                            body {
                                font-family: Arial, sans-serif;
                                background-color: #f1f1f1;
                            }
                            form {
                                background-color: #fff;
                                padding: 20px;
                                border-radius: 5px;
                                box-shadow: 0 2px 5px rgba(0,0,0,0.3);
                                max-width: 500px;
                                margin: 0 auto;
                            }
                            label {
                                display: block;
                                margin-bottom: 5px;
                                font-weight: bold;
                            }
                            input[type=text], input[type=datetime-local], textarea {
                                width: 100%;
                                padding: 10px;
                                border: 1px solid #ccc;
                                border-radius: 4px;
                                box-sizing: border-box;
                                margin-bottom: 15px;
                                font-size: 16px;
                            }
                            button[type=submit] {
                                background-color: #4CAF50;
                                color: #fff;
                                padding: 10px 20px;
                                border: none;
                                border-radius: 4px;
                                cursor: pointer;
                                font-size: 16px;
                            }
                            button[type=submit]:hover {
                                background-color: #45a049;
                            }
                        </style>
                    </head>
                    <body>
                    <form action="process-form.jsp" method="post">
                        <label for="dateFrom">Date from:</label>
                        <input type="date" id="dateFrom" name="dateFrom" required>

                        <label for="dateFrom">Date to:</label>
                        <input type="date" id="dateTo" name="dateTo" required>

                        <div class="form-group row">

                             <label for="dateFrom">Select a branch:</label>
                                    <select id="branchAddress" class="form-control" name="branchModel.id">


                                      <option hidden>Select a branch </option>
                                      <c:forEach items="${branchModel}" var="example">
                                        <option value="${example.id}">${example.address}</option>
                                      </c:forEach>
                                    </select>

                                <section>
                                 <a id="carsLink" type="submit" class="btn btn-success">
                                <span class="icon text-white-50">
                                 <i class="fas fa-info-circle"></i>
                                 </span>
                                <span class="text">Submit</span>
                            </a>
                             </section>
                            <script>
                                var select = document.getElementById("branchAddress");
                                var link = document.getElementById("carsLink");


                                select.addEventListener("change", function() {
                                    var selectedOption = select.options[select.selectedIndex];
                                    var url = "<c:url value='/Rentacar/RentAvailableCar/" + selectedOption.value + "'/>";
                                    link.href = url;
                                });
                            </script>

                         </form>

                </div>
            </section>


                <div class="container-fluid p-0">


                    <section class="resume-section" id="reservationList">
                        <div class="resume-section-content">
                            <h2 class="mb-5">Our reservation list</h2>

                            <c:forEach items="${reservationModels}" var="reservation">
                            <table>

                                <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                                    <div class="flex-grow-1">
                                        <h3 class="mb-0">Date of reservation: ${reservation.reservationFrom}  ${reservation.reservationTo}</h3>
                                        <div class="subheading mb-3">Client: ${reservation.client}</div>
                                        <div class="subheading mb-3">Car: ${reservation.car}</div>
                                        <div class="subheading mb-3">Production Year: ${reservation.branchmodel}</div>

                                    </div>

                            </table>
                            </c:forEach>
                    </section>
                </div>
                </form>


        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
