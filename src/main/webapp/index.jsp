<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="person/update" method="post">
<div class="row">
    <span>id：</span>  
    <input type="text" name="id" >
</div>
<div class="row">
    <span>name：</span>  
    <input type="text" name="name"> 
</div>
<div class="row">
    <button type="submit">提交</button>
</div>
</form>

<form action="person/add" method="post">
<div class="row">
    <span>name：</span>  
    <input type="text" name="name"> 
</div>
<div class="row">
    <span>age：</span>  
    <input type="text" name="age"> 
</div>
<div class="row">
    <button type="submit">提交</button>
</div>
</form>
</body>
</html>