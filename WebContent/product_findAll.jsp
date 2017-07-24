<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>显示所有商品</title>
</head>
<body>
	<h3>商品列表如下：</h3>
	<table border="1">
		<tr>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>国际编码</td>
			<td>商品价格</td>
			<td>操作</td>	
		</tr>
			<c:forEach items="${productListFromServlet }" var="product">
			
		<tr>
			<td>${product.pid }</td>
			<td>${product.pname }</td>
			<td>${product.ean }</td>
			<td>${product.price }</td>
			<td>
				<a href="${pageContext.request.contextPath }/ProductDeleteServlet?pid=${product.pid }" onclick="return confirm ('确认删除？');">删除</a>
				<a href="${pageContext.request.contextPath }/ProductFindByIdServlet?pid=${product.pid }&option=update">修改</a>
			</td>	
		</tr>
			</c:forEach>
	</table>
		<br/>
		<br/>
		<a href="${pageContext.request.contextPath }/product_save.jsp">添加新商品</a>
		<br/>
		<br/>
	<form action="${pageContext.request.contextPath }/ProductFindByIdServlet" method="post" > 
		pid:<input type="text" name="pid" value="1"><br/>
		<input type="submit" value="查找">	
	</form>
	
	<form action="${pageContext.request.contextPath }/ProductFindByNameServlet" method="post" > 
		pname:<input type="text" name="pname" value=""><br/>
		<input type="submit" value="查找">	
	</form>
</body>
</html>