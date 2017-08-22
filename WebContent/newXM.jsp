<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/styles.css" media="all">
<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script type="text/javascript" src="js/moment.js"></script>
<script type="text/javascript" src="js/bootstrap-datetimepicker.js"></script>
<script type="text/javascript">
$(document).ready(function(){
    // date time picker
    if($(".iDate.date").length>0){
        $(".iDate.date").datetimepicker({
            locale:"zh-cn",
            format:"YYYY-MM-DD",
            dayViewHeaderFormat:"YYYY年 MMMM"
        });
    }
})
</script>
<title>Insert title here</title>
</head>
<body>
	<form action="/FGW/newXM" method="post">
		<table border="1" cellspacing="0" width="80%" align="center">
			<tr>
				<td width="10%">Name</td>
				<td width="20%"><input type="text" id="name" name="name" width="20%"></td>
			
				<td width="10%">Time</td>
				<td width="20%" style="padding-left: 10px"><div class="iDate date">
					<input type="text" name="time">
	 				<button type="button" class="addOn"></button>
					</div>
				</td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" id="address" name="address" width="20%"></td>
			</tr>
			<tr>
				<td>Content</td>
				<td colspan="3"><textarea rows="3" cols="100%" name="content"></textarea>
			</tr>
			<tr>
				<td>Cp</td>
				<td><input type="text" id="cp" name="cp" width="20%"></td>
				<td>select</td>
				<td>
					<select name="select">
						<option selected value="A">请选择</option>
						<option value="B">选项1</option>
						<option value="C">选项2</option>
						<option value="D">选项3</option>
						<option value="E">选项4</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="4" align="center">
				<input type="reset" onclick="#" style="padding-left: 10px;padding-right: 10px;">
				<input type="submit" onclick="#" style="padding-left: 10px;padding-right: 10px;">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>