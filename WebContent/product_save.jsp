<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>增加商品</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/ProductSaveServlet" method="post">
	<table>
		<tr>
			<td>商品名称</td>
			<td><input type="text" name="pname" value=""/></td>
		</tr>
		<tr>
			<td>国际条码</td>
			<td><input type="text" name="ean" value=""/></td>
		</tr>
		<tr>
			<td>商品价格</td>
			<td><input type="text" name="price" value=""/></td>
		</tr>
		<tr>
			<td><input type="submit"  value="提交"/></td>
			<td><input type="reset" value="重置"/></td>
		</tr>
	</table>
</form>
</body>
</html>