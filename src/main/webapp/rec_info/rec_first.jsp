<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/7
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!--输出,条件,迭代标签库-->
<%@ page isELIgnored="false"%> <!--支持EL表达式，不设的话，EL表达式不会解析-->
<html>
<head>
    <title>景点管理</title>
</head>
<script>
    function citylist() {
        var obj = document.getElementById("citytype"); //定位id
        var index = obj.selectedIndex; // 选中索引
        var text = obj.options[index].text; // 选中文本     输出张三等汉字信息
        var value = obj.options[index].value;

        window.location.href="/reclistbycity?cityid="+value;
    }
    function addrec() {
        var obj = document.getElementById("citytype"); //定位id
        var index = obj.selectedIndex; // 选中索引
        var text = obj.options[index].text; // 选中文本     输出张三等汉字信息
        var value = obj.options[index].value;
        var url="/rec_info/rec_add.jsp?cityname="+text+"&cityid="+value
        window.location.href=url;

    }

</script>
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
<a href="/getallcity"  method="post">刷新城市列表</a><br>


<select id="citytype" >
    <c:forEach items="${citylist }" var="citylist1">
        <option value="${citylist1.id}">${citylist1.cityName}</option>
    </c:forEach>
</select>

<br><br><input type="button" value="刷新景点列表" onclick="citylist()"  /><input type="button" value="新增" onclick="addrec()"  /><br>
<!--查询城市景点-->
<table width="90%" id="mytab" border="1" class="style1">
    <thead>
    <th width="10%">ID</th>
    <th width="8%">景点名称</th>
    <th width="25%">景点介绍</th>
    <th width="25%">热点评论</th>
    <th width="15%">操作</th>
    </thead>
    <c:forEach items="${reclist }" var="reclista">
    <tr>
        <td><c:out value="${reclista.id }"  /></td>
        <td><c:out value="${reclista.cityRecName }" /></td>
        <td><c:out value="${reclista.cityRecContext }" /></td>
        <td><c:out value="${reclista.cityComment }" /></td>

        <td><a href="/rec_info/rec_update.jsp?recid=${reclista.id}&recname=${reclista.cityRecName }&reccontext=${reclista.cityRecContext }&reccomment=${reclista.cityComment }" >修改</a>
            <a href="/deleterec?recid=${reclista.id }" >删除</a></td>
    </tr>
</c:forEach>

</body>
</html>
