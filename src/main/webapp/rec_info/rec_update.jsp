<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/10
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新</title>
</head>
<body>
<form action="/updaterec" method="post">
    <br>景点代码：${param.recid }<input type="hidden" name="recid" value="${param.recid }" />
    <br/>景点名称：<input type="text" name="recname" value="${param.recname }" />
    <br/>景点介绍：<input type="text" name="reccontext"  value="${param.reccontext }"/>
    <br/>景点评论：<input type="text" name="reccomment" value="${param.reccomment }" />
    <br/><input type="submit" value="提交" />
</form>
</body>
</html>