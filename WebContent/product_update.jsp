<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>更新页面</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/ProductUpdateServlet" method="post">
	<table>
		<tr>
			<td>商品id</td>
			<td>${product.pid }
			<input type="hidden" name="pid" value="${product.pid }"/>
			</td>
			
		</tr>
		
		<tr>
			<td>商品名称</td>
			<td><input type="text" name="pname" value="${product.pname }"/></td>
		</tr>
		<tr>
			<td>国际条码</td>
			<td><input type="text" name="ean" value="${product.ean }"/></td>
		</tr>
		<tr>
			<td>商品价格</td>
			<td><input type="text" name="price" value="${product.price }"/></td>
		</tr>
		<tr>
			<td><input type="submit"  value="更新"/></td>
			
		</tr>
	</table>
</form>
</body>
</html>