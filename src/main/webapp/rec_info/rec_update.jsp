@@ -0,0 +1,22 @@
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
<form action="/addrec" method="post">
    <br>景点代码：${param.rec_id }
    <br/>景点名称：<input type="text" name="rec_name" value="${param.rec_name }" />
    <br/>景点介绍：<input type="text" name="rec_context"  value="${param.rec_context }"/>
    <br/>景点评论：<input type="text" name="rec_comment" value="${param.rec_comment }" />
    <br/><input type="submit" value="提交" />
</form>
</body>
</html>