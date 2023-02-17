<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/2/16
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>车库列表</title>
    <script src="<%=request.getContextPath()%>/js/jquery-3.6.0.min.js"></script>
    <script>
        $(function (){
            $("#insert").click(function (){
                location = "../insert.jsp";
            })
            $(".update").click(function (){
                location = "../update.jsp?id="+$(this).next().val();
            })
            $(".delete").click(function (){
                $.ajax({
                    url:"../car/delete",
                    data:{id:$(this).prev().val()},
                    dataType:"json",
                    success:function (resp){
                        if (resp){
                            location.reload();
                        }
                    }
                })
            })
        })
    </script>
</head>
<body>
    <table>
        <tr>
            <td></td>
            <td>编号</td>
            <td>型号</td>
            <td>品牌</td>
            <td>上市时间</td>
            <td>发动机</td>
            <td>马力</td>
            <td>售价</td>
            <td>
                <input type="button" id="insert" value="添加">
            </td>
        </tr>
        <c:forEach var="c" items="${list}">
            <tr>
                <td></td>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td>${c.brand}</td>
                <td>${c.date}</td>
                <td>${c.engine}</td>
                <td>${c.horsepower}</td>
                <td>${c.price}</td>
                <td>
                    <input type="button" class="update" value="修改">
                    <input type="hidden" value="${c.id}">
                    <input type="button" class="delete" value="删除">
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
