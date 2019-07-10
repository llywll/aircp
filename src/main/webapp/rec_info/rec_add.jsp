<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/9
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增景点</title>
</head>
<body>
<form action="/addrec" method="post">
    <br/>城市代码：${param.cityid }<input type="hidden" name="cityid" value="${param.cityid }" />
    <br/>所属城市：${param.cityname }
    <br/>景点名称：<input type="text" name="rec_name" />
    <br/>景点介绍：<input type="text" name="rec_context" />
    <br/>景点评论：<input type="text" name="rec_comment" />
    <br/><input type="submit" value="提交" />
</form>
</body>
</html>