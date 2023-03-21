<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/header.jspf" %>


<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Education-->
    <section class="resume-section" id="education">
        <div class="resume-section-content">
            <h2 class="mb-5">Education</h2>
<c:forEach items="${educationModel}" var="title">
            <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                <div class="flex-grow-1">
                    <h3 class="mb-0">${title.title}</h3>
                    <div class="subheading mb-3">${title.subTitle}</div>
                    <p>${title.description}</p>
                </div>
                <div class="flex-shrink-0"><span class="text-primary">${title.dateFrom} - ${title.dateTo}</span></div>
            </div>
</c:forEach>
        </div>
    </section>

    <div class="container">
        <form method="post" action='<c:url value="/education"/>'>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput1">Tytuł</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput1" name="title" placeholder="uzupełnij tytuł">
                </div>
            </div>

            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput2">Podtytuł</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput2" name="subTitle" placeholder="uzupełnij podtytuł">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput3">Treść</label>
                <div class="col-10">
                    <textarea type="text" class="form-control" rows="5" id="exampleFormControlInput3" name="description" placeholder="uzupełnij treść"></textarea>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2 col-form-label">Od kiedy</label>
                <div class="col-10">
                    <input class="form-control" type="date" name="dateFrom" max="3000-12-31"
                           min="<fmt:formatDate pattern = "yyyy-MM-dd" value = "${now}" />">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-2 col-form-label">Do kiedy</label>
                <div class="col-10">
                    <input class="form-control" type="date" name="dateTo" max="3000-12-31"
                           min="<fmt:formatDate pattern = "yyyy-MM-dd" value = "${now}" />">
                </div>
            </div>


            <input type="submit" class="btn btn-success" value="Zapisz">
        </form>
    </div>


</div>
