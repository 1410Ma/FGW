<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆界面</title>
</head>
<body>
<div style="height: 100px;">

</div>
<form action="/FGW/login" method="post">
<table border=1 align="center" >
	<tr><td><input type="text" name="name" value="">name</td></tr>
	<tr><td><input type="password" name="psd">psd</td></tr>
	<tr><td><center><input type="submit" value="sign in" ></center>
			<div id="vv" align="center">
				<%
					String name = "";
					name = (String)request.getAttribute("flag");
					if(name==null){
					}else{
						out.print("信息错误！");
					}
				%>
			</div></td></tr>
</table>

</form>
</body>
</html>