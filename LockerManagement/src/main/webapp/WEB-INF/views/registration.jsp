<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login.jsp</title>
</head>
<body>
	<h1>Login</h1>
	<form method="GET" action="${pageContext.request.contextPath}/registrationSubmit" >
        <h2>Log in</h2>

        <div>
            <input name="firstName" type="text" placeholder="First Name" autofocus="true"/>
            <input name="lastName" type="text" placeholder="Password"/>
            <input name="mobileNo" type="text" placeholder="Password"/>
            <input name="emailId" type="text" placeholder="Password"/>
            <input name="dob" type="text" placeholder="Password"/>
            <input name="gender" type="text" placeholder="Password"/>
            <input name="password" type="text" placeholder="Password"/>
            <input name="password" type="text" placeholder="Password"/>
            <input name="password" type="text" placeholder="Password"/>
            <input name="password" type="password" placeholder="Password"/>

            <button type="submit">Log In</button>
        </div>
      </form>
      
      <form method="GET" action="${pageContext.request.contextPath}/loginsubmit11" >
        <h2>Log in</h2>

        <div>
            <input name="name" type="text" placeholder="Username" autofocus="true"/>
            <input name="password" type="password" placeholder="Password"/>

            <button type="submit">Register</button>
        </div>
      </form>
	
		
</body>
</html>