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
                        <form method="post" action='<c:url value="registration.jsp"/>'>
                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                    <input type="text" class="form-control form-control-user" id="exampleFirstName" placeholder="Name">
                                </div>

                                <div class="col-sm-6">
                                    <input type="text" class="form-control form-control-user" id="exampleLastName" placeholder="Surname">
                                </div>

                            </div>
                            <br>
                            <div class="form-group">
                                <input type="email" class="form-control form-control-user" id="exampleInputEmail" placeholder="Enter e-mail address">
                            </div>
                            <br>
                            <div class="col-sm-6">
                                <input type="Username" class="form-control form-control-user" id="exampleUsername" placeholder="please provide your username">
                            </div>
                            <br>
                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                    <input type="password" class="form-control form-control-user" id="exampleInputPassword" placeholder="Password">
                                </div>

                                <div class="col-sm-6">
                                    <input type="password" class="form-control form-control-user" id="exampleRepeatPassword" placeholder="Repeat password">
                                </div>
                            </div>
                            <br>

                            <a href="login.jsp" class="btn btn-primary btn-user btn-block">
                                Register
                            </a>
                            <hr>

                        </form>
                        <div class="text-center">
                            <a class="small" href="login.jsp">already have an account?Log in!</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
</html>
