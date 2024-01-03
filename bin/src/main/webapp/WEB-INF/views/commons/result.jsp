<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
	// '' 로 el을 감싸는 이유 String이 넘어오는데 감싸는게 없음
	let msg = '${msg}';
	alert(msg);
	location.href='${path}';
	
	</script>
	
	
	
</body>
</html>