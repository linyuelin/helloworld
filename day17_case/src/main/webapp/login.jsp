<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>管理员登录</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
        function refreshCode(){
            var vcode = document.getElementById("vcode");
            vcode.src="${pageContext.request.contextPath}/checkCode?"+new Date().getTime();
        }
    </script>
</head>
<body>
<div class="container" style="width: 400px;">
    <h3 style="text-align: center;">管理人登録</h3>
    <form action="${pageContext.request.contextPath}/loginServlet" method="post">
        <div class="form-group">
            <label for="user">ユーザー：</label>
            <input type="text" name="username" class="form-control" id="user" placeholder="ユーザーの氏名ご入力ください"/>
        </div>

        <div class="form-group">
            <label for="password">密码：</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="パスワードご入力ください"/>
        </div>

        <div class="form-inline">
            <label for="vcode">検証コード：</label>
            <input type="text" name="verifycode" class="form-control" id="verifycode" placeholder="検証コードご入力ください"
                   style="width: 120px;"/>
            <a href="javascript:refreshCode()"><img src="${pageContext.request.contextPath}/checkCode"
                                                    title="もう一回読み込む" id="vcode"/></a>
        </div>

        <hr/>
        <div class="form-group" style="text-align: center;">
            <input class="btn btn btn-primary" type="submit" value="確認済み">
        </div>
    </form>

    <!-- 出错显示的信息框 -->
    <div class="alert alert-warning alert-dismissible" role="alert">
        <button type="button" class="close" data-dismiss="alert">
            <span>&times;</span></button>
        <strong>${error_mes}</strong>
    </div>
</div>
</body>
</html>