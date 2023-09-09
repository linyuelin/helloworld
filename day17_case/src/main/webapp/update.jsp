<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>ユーザ情報編集</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</head>
<body>
<div class="container" style="width: 400px;">
    <h3 style="text-align: center;">ユーザー情報編集</h3>
    <form action="${pageContext.request.contextPath}/updateServlet" method="post">
　　　　　　<%--        隠し区域--%>
         <input type="hidden" name="id" value="${user.id}">
        <div class="form-group">
            <label for="name">氏名：</label>
            <input type="text" class="form-control" id="name" name="name" value="${user.name}" readonly="readonly"
                   placeholder="请输入姓名"/>
        </div>

        <div class="form-group">
            <label>性别：</label>

            <c:if test="${user.gender == '男'}">
                <input type="radio" name="gender" value="男" checked/>男
                <input type="radio" name="gender" value="女"/>女
            </c:if>
            <c:if test="${user.gender == '女'}">
                <input type="radio" name="gender" value="男"/>男
                <input type="radio" name="gender" value="女" checked/>女
            </c:if>

        </div>

        <div class="form-group">
            <label for="age">年齢：</label>
            <input type="text" class="form-control" id="age" value="${user.age}" name="age"
                   placeholder="年齢ご入力ください"/>
        </div>

        <div class="form-group">
            <label for="address" id="address">出身地：</label>
            <select name="address" class="form-control">
                <c:if test="${user.address == '广东'}">
                    <option value="广东" selected>广东</option>
                    <option value="广西">广西</option>
                    <option value="北京" >北京</option>
                    <option value="湖南">湖南</option>
                </c:if>
                <c:if test="${user.address == '广西'}">
                    <option value="广东">广东</option>
                    <option value="广西" selected>广西</option>
                    <option value="湖南">湖南</option>
                    <option value="北京" >北京</option>

                </c:if>
                <c:if test="${user.address == '湖南'}">
                    <option value="广东">广东</option>
                    <option value="广西">广西</option>
                    <option value="北京" >北京</option>
                    <option value="湖南" selected>湖南</option>
                </c:if>
                <c:if test="${user.address == '北京'}">
                    <option value="广东">广东</option>
                    <option value="广西">广西</option>
                    <option value="湖南" >湖南</option>
                    <option value="北京" selected>北京</option>

                </c:if>

            </select>
        </div>

        <div class="form-group">
            <label for="qq">QQ：</label>
            <input type="text" class="form-control" name="qq" id="qq" value="${user.qq}" placeholder="QQご入力ください"/>
        </div>

        <div class="form-group">
            <label for="email">Email：</label>
            <input type="text" class="form-control" name="email" id="email" value="${user.email}"
                   placeholder="メールご入力ください"/>
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="確認済み"/>
            <input class="btn btn-default" type="reset" value="リセット"/>
            <input class="btn btn-default" type="button" value="キャンセル"/>
        </div>
    </form>
</div>
</body>
</html>