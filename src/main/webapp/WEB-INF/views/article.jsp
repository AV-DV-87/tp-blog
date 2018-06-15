<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajouter un article</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/index.css">
</head>
<body>
	<div class="container-fluid">
    <div class="row">
        <div class="col-6 mx-auto">
            <form method="POST">
            	<!-- l'attribut name sera le paramètre récupéré coté JAVA -->
                <div class="form-group">
                  <label for="title">Titre</label>
                  <input name="title" type="text" class="form-control" id="title" placeholder="Veuillez saisir un titre">
                </div>
                <div class="form-group">
                  <label for="desc">Description</label>
                  <input name="description" type="text" class="form-control" id="desc" placeholder="Description">
                </div>
                <button type="submit" class="btn btn-primary">Envoyer</button>
              </form>
        </div>
    </div>
</div>
</body>
</html>