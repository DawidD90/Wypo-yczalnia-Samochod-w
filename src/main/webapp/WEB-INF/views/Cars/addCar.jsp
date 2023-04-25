<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/header.jspf" %>


    <section>
    <div class="container">
        <form method="post" action='<c:url value="/cars/addCar"/>'>
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
                    <select class="form-control" name="carStatus">
                        <option hidden>Select</option>
                        <c:forEach items="${carStatus}" var="example">
                            <option value="${example}">${example}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group row">
                <label class="col-2 col-form-label">Branch</label>
                <div class="col-10">
                    <select class="form-control" name="branchModel.id">
                        <option hidden>Select</option>
                        <c:forEach items="${branchModel}" var="example">
                            <option value="${example.id}">${example.address}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>


            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput7">Price</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput7"
                           name="price" placeholder="please provide rental fee">
                </div>
            </div>

            <input type="submit" class="btn btn-success" value="Save">
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
