<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户信息管理系统</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
    <script>
        function deleteUser(id) {
            if (confirm("連絡先を削除")) {
                location.href = "${pageContext.request.contextPath}/deleteServlet?id=" + id;
            }
        }

        window.onload = function () {
            document.getElementById("delSelected").onclick = function () {

                if (confirm("選んだユーザー全て削除しますか")) {
                    var uids = document.getElementsByName("uid");
                    var flag = false;
                    for (var i = 0; i < uids.length; i++) {
                        if (uids[i].checked) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        document.getElementById("form").submit();
                    }
                }

            }

            document.getElementById("firstCheck").onclick = function () {
                var uids = document.getElementsByName("uid");
                for (var i = 0; i < uids.length; i++) {
                    uids[i].checked = this.checked
                }
            }
        }


    </script>

</head>
<body>
<div class="container">
    <h3 style="text-align: center">顧客情報リスト</h3>
    <hr>
    <div style="float: left" >
        <form class="form-inline" action="${pageContext.request.contextPath}/findUserByPage" method="post">
            <div class="form-group">
                <label for="exampleInputName2">氏名</label>
                <input type="text" class="form-control" value="${condition.name[0]}" name="name" id="exampleInputName2">
            </div>
            <div class="form-group">
                <label for="exampleInputAdresss2">出身地</label>
                <input type="text" class="form-control" value="${condition.address[0]}" name="address" id="exampleInputAdresss2">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail3">メール</label>
                <input type="text" class="form-control" value="${condition.email[0]}" name="email" id="exampleInputEmail3">
            </div>
            <button type="submit" class="btn btn-default">探す</button>
        </form>
    </div>
    <div style="float: right ; margin: 5px">
        <a class="btn btn-primary" href="add.jsp">ユーザー追加</a>
        <a class="btn btn-primary" href="javascript:void(0);" id="delSelected">削除</a>

    </div>
    <form action="${pageContext.request.contextPath}/delSelectedServlet" method="post" id="form">
        <table border="1" class="table table-bordered table-hover">
            <tr class="success">
                <th><input type="checkbox" id="firstCheck"></th>
                <th>番号</th>
                <th>氏名</th>
                <th>性别</th>
                <th>年齢</th>
                <th>出身地</th>
                <th>QQ</th>
                <th>メール</th>
                <th>編集</th>
            </tr>
            <c:forEach items="${pb.list}" var="user" varStatus="s">
                <tr>
                    <th><input type="checkbox" name="uid" value="${user.id}"></th>
                    <td>${s.index}</td>
                    <td>${user.name}</td>
                    <td>${user.gender}</td>
                    <td>${user.age}</td>
                    <td>${user.address}</td>
                    <td>${user.qq}</td>
                    <td>${user.email}</td>
                    <td><a class="btn btn-default btn-sm"
                           href="${pageContext.request.contextPath}/findUserServlet?id=${user.id}">編集</a>&nbsp;
                        <a class="btn btn-default btn-sm" href="javascript:deleteUser(${user.id});">削除</a></td>
                </tr>
            </c:forEach>


        </table>
    </form>
    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <c:if test="${pb.currentPage == 1}">
            <li class="disabled">
                </c:if>
                <c:if test="${pb.currentPage != 1}">
            <li>
                </c:if>

                <a class="page-link"
                   href="${pageContext.request.contextPath}/findUserByPage?currentPage=${pb.currentPage-1}&rows=5&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}"
                   aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>

            <c:forEach begin="1" end="${pb.totalPage}" var="i">
                <c:if test="${pb.currentPage == i}">
                    <li class="active"><a class="page-link"
                                          href="${pageContext.request.contextPath}/findUserByPage?currentPage=${i}&rows=5&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}">${i}</a>
                    </li>
                </c:if>
                <c:if test="${pb.currentPage != i}">
                    <li class="page-item"><a class="page-link"
                                             href="${pageContext.request.contextPath}/findUserByPage?currentPage=${i}&rows=5&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}">${i}</a>
                    </li>
                </c:if>

            </c:forEach>


            <c:if test="${pb.currentPage ==pb.totalPage }">
            <li class="disabled">
                </c:if>
                <c:if test="${pb.currentPage !=pb.totalPage}">
            <li>
                </c:if>
                <a class="page-link"
                   href="${pageContext.request.contextPath}/findUserByPage?currentPage=${pb.currentPage+1}&rows=5&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}"
                   aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>

            <span style="font-size: 20px">全部で${pb.totalCount}件、${pb.totalPage}ページ</span>
        </ul>
    </nav>
</div>
</body>
</html>
