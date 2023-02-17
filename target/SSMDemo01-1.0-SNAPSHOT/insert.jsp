<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/2/16
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.6.0.min.js"></script>
    <script>
      $(function (){
          $("#btn").click(function (){
            $.ajax({
              url:"car/insert",
              data:$("#f").serialize(),
              type:"post",
              dataType:"json",
              success:function (resp){
                console.log(resp);
                if (resp){
                  location = "<%=request.getContextPath()%>/car/query";
                }
              }
            })
          })
      })
    </script>
</head>
<body>
    <form id="f">
          <table>
            <tr>
              <td>型号</td>
              <td>
                <input type="hidden" id="id" name="id">
                <input type="text" id="name" name="name">
              </td>
            </tr>
            <tr>
              <td>品牌</td>
              <td>
                <input type="text" id="brand" name="brand">
              </td>
            </tr>
            <tr>
              <td>上市时间</td>
              <td>
                <input type="text" id="date" name="date">
              </td>
            </tr>
            <tr>
              <td>发动机</td>
              <td>
                <input type="text" id="engine" name="engine">
              </td>
            </tr>
            <tr>
              <td>马力</td>
              <td>
                <input type="text" id="horsepower" name="horsepower">
              </td>
            </tr>
            <tr>
              <td>售价</td>
              <td>
                <input type="text" id="price" name="price">
              </td>
            </tr>
            <tr>
              <td colspan="2">
                <input type="submit" value="确定" id="btn">
              </td>
            </tr>
        </table>
    </form>
</body>
</html>
