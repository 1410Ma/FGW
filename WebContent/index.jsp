<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/datePicker.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.date_input.pack.js"></script> 
</head>
<body>
<script type="text/javascript">
$(function(){
	$('#datePicker').date_input();
	$('#datePicker2').date_input();
	})
onback()=
</script>
 <form action="/createHY" method="get">
 	<table align="center" border="1">
 		<tr>
 			<td>名称</td>
 			<td><input type="text" name="HYname"></td>
 		</tr>
 		<tr>
 			<td>时间</td>
 			<td><input type="text" id="datePicker" name="HYtime" class="date_picker" placeholder="点击选择日期"/></td>
 		</tr>
 		<tr>
 			<td>地点</td>
 			<td><input type="text" name="HYadress"></td>
 		</tr>
 		<tr>
 			<td>内容</td>
 			<td><textarea rows="4" ></textarea></td>
 		</tr>
 		<tr>
 			<td>FY</td>
 			<td>
 				<select>
 					<option>1</option>
 					<option>2</option>
 					<option>3</option>
 					<option>4</option>
 					<option>5</option>
 				</select>
 			</td>
 		</tr>
 		<tr>
 			<td><input type="submit" value="确认"></td>
 			<td><input type="button" value="取消" onclick="javascript:window.location.href('/FGW/main.jsp')"></td>
 			
 		</tr>
 		
 	</table>
 </form>
</body>
</html>