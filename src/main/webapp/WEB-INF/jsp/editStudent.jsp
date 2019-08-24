<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/WEB-INF/jsp/head.jsp"%>
    <title>学生修改</title>
</head>
<body>
<h1>学生修改</h1>
<div>${requestScope.className}</div>

<%=System.currentTimeMillis()%>
<div>springmvc表单</div>
        <f:form modelAttribute="student" action="${ctx}/student/edit" method="post">
        学号：<f:input path="sid"></f:input><f:errors path="sid" /><br>
        姓名：<f:input path="sname"></f:input><f:errors path="sname" /><br>
        年龄：<f:input path="age"></f:input><br>
        备注：<f:textarea path="remark"></f:textarea><br>
        <input type="submit" value="确定">
    </f:form>

</body>
</html>
