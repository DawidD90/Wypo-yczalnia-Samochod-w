<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>



    <section>
        <div class="container">
            <form method="post" action='<c:url value="/employees"/>'>
                <div class="form-group row">
                    <label class="col-2" for="exampleFormControlInput1">Name</label>
                    <div class="col-10">
                        <input type="text" class="form-control" id="exampleFormControlInput1" name="name" placeholder="add name">
                    </div>
                </div>

                <div class="form-group row">
                    <label class="col-2" for="exampleFormControlInput2">Surname</label>
                    <div class="col-10">
                        <input type="text" class="form-control" id="exampleFormControlInput2" name="surname" placeholder="add surname">
                    </div>
                </div>

                <div class="form-group row">
                    <label class="col-2" for="exampleFormControlInput3">position</label>
                    <div class="col-10">
                        <textarea type="text" class="form-control" rows="5" id="exampleFormControlInput3" name="position" placeholder="add position"></textarea>
                    </div>
                </div>

                <div class="form-group row">
                    <label class="col-2 col-form-label">Select Branch</label>
                    <div class="col-10">
                        <select class="form-control" name="branchModel.id">
                            <option hidden>Select</option>
                            <c:forEach items="${branchModel}" var="example">
                                <option value="${example.id}">${example.address}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>


                <input class="btn btn-success pull-left" type="submit" value="Save" id="searchButton"></input>

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
