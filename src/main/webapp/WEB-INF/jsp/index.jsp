<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<html>
<body>
<h2>首页</h2>
<div>
    ${message}
    <%=System.currentTimeMillis()%>
    <a href="<%=request.getContextPath()%>/student/toAdd">学生增加</a>
    <a href="<%=request.getContextPath()%>/student/toedit?sid=21">学生修改</a>
</div>
<a href="<%=request.getContextPath()%>/i18n/change"><t:message code="language"/></a>
<div>
    <t:message code="yhzh.label"/><input><br>
    <t:message code="yhmm.label"/><input><br>
</div>
</body>
</html>
