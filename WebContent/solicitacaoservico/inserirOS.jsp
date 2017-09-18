<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
       <meta charset="utf-8">
	   <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	   <title>My CRM</title>
	   <meta name="description" content="">
	   <meta name="viewport" content="width=device-width, initial-scale=1">
	
	   <link rel="stylesheet" href="../css/bootstrap.min.css">
	   <style>
	        body {
	            padding-top: 50px;
	            padding-bottom: 20px;
	        }
	   </style>
	   <link rel="stylesheet" href="../css/style.css">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.2/css/font-awesome.min.css">     
    </head>
	<body>
		<c:import url="../inc/header.jsp"/>
	
		<!-- Conteúdo principal da página -->
		<main class="container">
		<h1>Dashboard</h1>
		<hr/>
			<form action="/MyCRM/InserirSolicitacaoServicoServlet" method="post">
			  <div class="form-group">
			      <label for="campo1">Cliente:</label>
			      <c:choose>
					<c:when test="${not empty listaClientes}">
						<select name="idCliente" id="idCliente">
					     <c:forEach var="cliente" items="${listaClientes}">
					     	<option value="${cliente.id}">${cliente.nomeCompleto}</option>
					     </c:forEach>
					     </select>
				     </c:when>
				   </c:choose>
			  </div>
			  
			   <div class="form-group">
			      <label for="campo1">Serviço:</label>
			      <c:choose>
					<c:when test="${not empty listaServicos}">
						<select name="idServico" id="idServico">
					     <c:forEach var="servico" items="${listaServicos}">
					     	<option value="${servico.id}">${servico.descricao}</option>
					     </c:forEach>
					     </select>
				     </c:when>
				   </c:choose>
			  </div>
			  
			  <div class="form-group">
			      <label for="campo3">Descrição:</label>
			      <input type="text" class="form-control" name="descricao">
			    </div>
			   
			  <div class="form-group">
			      <label for="campo3">Data OS:</label>
			      <input type="text" class="form-control" name="dataos">
			    </div>
			    
			    
			  
			  <div id="actions" class="row">
			    <div class="col-md-12">
			      <button type="submit" class="btn btn-primary">Salvar</button>
			      <a href="/MyCRM/index.jsp" class="btn btn-default">Cancelar</a>
			    </div>
			  </div>
			</form>
		</main>
		<c:import url="../inc/footer.jsp"/>
	</body>
</html>

