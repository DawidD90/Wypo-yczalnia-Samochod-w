<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>
<html>
<body class="bg-gradient-primary">

<div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
        <div class="card-body p-0">
            <!-- Nested Row within Card Body -->
            <div class="row">
                <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                <div class="col-lg-7">
                    <div class="p-5">
                        <div class="text-center">
                            <h1 class="h4 text-gray-900 mb-4">Create an account!</h1>
                        </div>

                        <div class="container">
                        <form method="post" action='<c:url value="/registration"/>'>
                            <div class="form-group row">
                                <label class="col-2" for="exampleFormControlInput1">username</label>
                                <div class="col-10">
                                    <input type="text" class="form-control" id="exampleFormControlInput1" name="username" placeholder="Please provide your username">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-2" for="exampleFormControlInput1">Make</label>
                                <div class="col-10">
                                    <input type="text" class="form-control" id="exampleFormControlInput2" name="password" placeholder="please provide your password">
                                </div>
                                <input type="submit" class="btn btn-success" value="Save">
                            </div>
                            </div>



                        </form>
                        <div class="text-center">
                            <a class="small" href="<c:url value="/login"/>">already have an account?Log in!</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
</html>
