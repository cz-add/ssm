<%--
  Created by IntelliJ IDEA.
  User: chenz
  Date: 2019/8/19
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>文件上传<%=System.currentTimeMillis()%></h1>
<form method="post" action="<%=request.getContextPath()%>/upload" enctype="multipart/form-data">
    <input name="img" type="file">
    <input type="submit" value="ok">
</form>

<h1>文件上传2<%=System.currentTimeMillis()%></h1>
<form method="post" action="<%=request.getContextPath()%>/uploads" enctype="multipart/form-data">
    <input name="imgs" type="file" >
    <input type="submit" value="ok">
</form>

<h1>文件上传3<%=System.currentTimeMillis()%></h1>
<form method="post" action="<%=request.getContextPath()%>/uploadal" enctype="multipart/form-data">
    <input name="imgs" type="file" >
    <input type="submit" value="ok">
</form>
</body>
</html>
