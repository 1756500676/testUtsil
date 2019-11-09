<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<!-- Required meta tags -->
<title>Hello, world!</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/index3.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery-1.8.3.js"></script>
</head>
<body>
<div class="form-group">
	<table >
	 	<tr>
	 		<td>
	 			<input type="checkbox" >
	 		</td>
	  		<td>商品</td>
	  		<td>商品价格</td>
	  		<td>已售百分比</td>
	  		<td>操作</td>
	 	</tr>
	 	<c:forEach items="${goodsList }" var="goods">
		 	<tr>
		 		<td>
		 			<input type="checkbox" name="ids" value="${goods.id }">
		 		</td>
		  		<td>${goods.name }</td>
		  		<td>${goods.price }</td>
		  		<td>${goods.sells }</td>
		  		<td>操作</td>
		 	</tr>
	 	</c:forEach>
	 	<tr>
	 		<td colspan="5" style="text-align: center" >
	 			${page.pageStyle }
	 		</td>
	 	</tr>
	</table>
</div>
</body>
</html>