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
	<span><c:out value="${trainer.name}" /></span>
	<br />
	<br />
	<br />
	<form:form action="insert" method="post" modelAttribute="trainer">
		<span>nuevo pokemon:</span>
		<span>nombre:</span>
		<form:input type="text" path="pokemon.name" />
		<span>Nivel:</span>
		<form:input type="text" path="pokemon.level" />
		<span>Salud:</span>
		<form:input type="text" path="pokemon.health" />
		<form:checkbox path="pokemon.savage"/>
		<input type="submit" value="guardar Pokemon" />
	</form:form>
	<form:form action="insert" method="post" modelAttribute="trainer">
		<span>nuevo Ataque:</span>
		<span>nombre:</span>
		<form:input type="text" path="attackAux.name" />
		<span>Daño:</span>
		<form:input type="text" path="attackAux.damage" />
		<input type="submit" value="guardar ataque" />
		
	</form:form>
	<span><c:out value="${trainer.pokemonTeam.mainPokemon.name}"></c:out> </span>
	<span><c:out value="${trainer.pokemonTeam.mainPokemon.health}"></c:out> </span>
	<br><br><br>
	<span><c:out value="${trainer.savagePokemon.name}"></c:out> </span>
	<span><c:out value="${trainer.savagePokemon.health}"></c:out> </span>
	<span>Listea de ataques |||</span>
	<span>Ataque principal: <c:out value="${trainer.pokemonTeam.mainPokemon.mainAttack.name}"></c:out></span>
	<table border="1">
		<thead>
			<tr>
				<td>Nombre</td>
				<td>Daño:</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="attack" items="${trainer.pokemonTeam.mainPokemon.attackList}">
				<tr>
					<td><c:out value="${attack.name}" /></td>
					<td><c:out value="${attack.damage}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<table border="1">
		<thead>
			<tr>
				<td>Nombre</td>
				<td>Nivel</td>
				<td>Salud</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="pokemon" items="${trainer.pokemonTeam.pokemons}">
				<tr>
					<td><c:out value="${pokemon.name}" /></td>
					<td><c:out value="${pokemon.level}" /></td>
					<td><c:out value="${pokemon.health}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form:form action="switchPokemon" method="post">
		<input type="submit" value="Establecer Pokemon principal" />
	</form:form>
	<form:form action="switchAttack" method="post">
		<input type="submit" value="Establecer Ataque principal" />
	</form:form>


	<br />
	<br />





</body>
</html>