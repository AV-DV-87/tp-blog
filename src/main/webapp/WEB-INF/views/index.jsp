<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Premiere JSP</title>
<%--BONNE PRATIQUE CHEMIN ABSOLU  --%>
<%-- <base href="/blog/"> --%>
<%-- chemin relatif --%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/index.css">


</head>
<body>
	<div class="container">
		
		<%-- Utilisation du tag for each pour parcourir une collection.
	Cela permet de générer les éléments html à l'intérieur du tag --%>
		<div class="row">
			<!-- route absolue pour ajouter -->
			<c:url value="/add-article" var="add" />
			<!-- route absolue de suppr -->
			<c:url value="/delete?id=" var="del" />
			
			<a class="badge badge-pill badge-success p-2" href="${add}">Ajouter
			un article</a>
			<c:forEach var="article" items="${sessionScope.listArticle}">
				<div class="article col-12 card">
					<h2 class="card-title">${article.title}</h2>
					<p class="card-text">${article.description}</p>
					<a class="badge badge-pill badge-danger p-2" href="${del}${article.id}">Supprimer</a>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>