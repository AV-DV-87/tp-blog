<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
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
	href="<%=request.getContextPath()%>/css/index.css">


</head>
<body>
	<div class="main">
	<%-- Utilisation du tag for each pour parcourir une collection.
	Cela permet de générer les éléments html à l'intérieur du tag --%>
		<c:forEach var="article" items="${listArticle}">
			<div class="article">
				<h2>${article.title}</h2>
				<p>${article.description}</p>
			</div>
			
		</c:forEach>
	</div>
</body>
</html>