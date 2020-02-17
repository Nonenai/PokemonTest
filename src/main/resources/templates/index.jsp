<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome page</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.6/cosmo/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<form:form action="insert" method="post" modelAttribute="trainer">
		<span>nombre del entrenador:</span>
		<form:input type="text" path="name" />
		<input type="submit" value="Guardar nombre entrenador" />
	</form:form>
	<br />
	<br /> El nombre del entrenador/a es:
	<span><c:out value="${trainer.name}"/></span>
	<br />
	<br />
	<br />


	<!--<form:form action="insert" method="post" modelAttribute="trainer">
		<span>nuevo pokemon:</span>
		<span>nombre:</span>
		<form:input type="text" path="item.name" />
		<span>Nivel:</span>
		<form:input type="text" path="item.level" />
		<span>Salud:</span>
		<form:input type="text" path="item.health" />
		<input type="submit" value="guardar Pokemon" />
	</form:form>
	
	<br />
	<br />
	-->




</body>
</html>