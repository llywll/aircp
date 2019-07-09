<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/7
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>景点管理</title>
</head>
<body>
-------------------------------------------------------------------
<%--新增城市--%>
<form action="/addcity" method="post">
    城市名字：<input type="text" name="cityName" />
    <input type="submit" value="增加"/>
</form>
<br>
-------------------------------------------------------------------<br>
<%--查询城市表到下拉列表--%>
<a href="/getallcity"  method="post">刷新城市列表</a><br>${citylist }

    <c:forEach items="${citylist }" var="contactInfo">
        ${contactInfo.cityName}
    </c:forEach>

<select id="citytype" name="citytype">
    <option value="">==请选择==</option>
    <c:forEach items="${citylist }" var="citylist1">
        <option value="${citylist1.id}">${citylist1.cityName}</option>
    </c:forEach>
</select>

<br><a href="/reclistbycity?cityid="  >刷新景点列表</a><br>
<!--查询城市景点-->
<c:forEach items="${reclist }" var="reclista">
    <c:out value="${reclista.id }"  />
    <c:out value="${reclista.cityRecName }" />
    <c:out value="${reclista.cityRecContext }" />
    <c:out value="${reclista.cityComment }" />
    <a href="/updaterec?recid=${reclista.id}" >修改</a>
    <a href="/deleterec?recid=${reclista.id}" >删除</a>
</c:forEach>


</body>
</html>
