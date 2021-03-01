<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<title>rank | main</title>
<%-- <link rel="stylesheet" type="text/css" href='${pageContext.request.contextPath}/assets/css/main.css'/> --%>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>
	<div id ='container' style="width: 100%; height:100%">
	</div>
	
	<div>
	<form  action="/rank/login" method="post">
		<input type='text' name='id' />
		<input type='password' name='password' />
		<input type='submit' />
	</form>	
	</div>
	
<%-- 	  <script src="http://${pageContext.request.localAddr}:8090/bundle.js"></script>  --%>
    	 <%-- <script src="${pageContext.request.contextPath}/assets/js/bundle.js"></script> --%>
</body>
