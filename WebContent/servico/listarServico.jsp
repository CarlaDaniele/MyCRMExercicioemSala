<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
       <meta charset="utf-8">
	   <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	   <title>My CRM</title>
	   <meta name="description" content="">
	   <meta name="viewport" content="width=device-width, initial-scale=1">
	
	   <link rel="stylesheet" href="css/bootstrap.min.css">
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
		<h1>Cadastro de Serviços</h1>
			<a class="btn btn-primary" href="servico/inserirServico.jsp"><i class="fa fa-plus"></i> Novo Serviço</a>
		<hr/>
			 <form action="/MyCRM/ListarServicoServlet" method="post">              
                <c:choose>
                    <c:when test="${not empty listaServico}">
                        <table  class="table table-striped">
                            <thead>
                                <tr>
                                    <td>#</td>
                                    <td>Serviço</td>
                                    <td>Preço</td>
                                    <td>Descrição</td>
                                    <td>Dias Úteis</td>
                                </tr>
                            </thead>
                            <c:forEach var="servico" items="${listaServico}">
                                <tr>
                                    <td>${servico.id}</td>
                                    <td>${servico.servico}</td>
                                    <td>${servico.preco}</td>
                                    <td>${servico.descricao}</td>
                                    <td>${servico.diasUteis}</td>
                                </tr>
                            </c:forEach>               
                        </table>  
                    </c:when>                    
                    <c:otherwise>
                        <br>           
                        <div class="alert alert-info">
                            No people found matching your search criteria
                        </div>
                    </c:otherwise>
                </c:choose>                        
            </form>
		</main>
		<c:import url="../inc/footer.jsp"/>
	</body>
</html>