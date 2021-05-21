<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/user/join" method="post">
		<div>
			아이디 : <input type="text" name="uid" placeholder="id">
		</div>
		<div>
			비밀번호 : <input type="password" name="upw" placeholder="password">
		</div>
		<div>
			이름 : <input type="text" name="unm" placeholder="name">
		</div>
		<div>
			남<input type="radio" name="gender" checked> 여<input
				type="radio" name="gender" >
		</div>
		<div>
			<input type="submit" value="회원가입">
		</div>
	</form>
</body>
</html>