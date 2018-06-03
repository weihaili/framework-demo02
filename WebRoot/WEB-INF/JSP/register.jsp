<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
</head>
<body>
<form action="user.do">
	<table>
		<tr>
			<td><span>name:</span></td>
			<td>
				<input type="text" name="uname">
			</td>
		</tr>
		<tr>
			<td><span>password:</span></td>
			<td>
				<input type="password" name="upassword">
			</td>
		</tr>
		
		<tr>
			<td>
				<span>
					<input type="submit" value="register">
				</span>
			</td>
		</tr>
	</table>
	<input type="hidden" name="method" value="reg">
</form>
</body>
</html>