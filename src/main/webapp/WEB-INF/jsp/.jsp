<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
<div style="text-align:center;border:1px solid black;with:400px" >
                 <form action="${pageContext.request.contextPath}/userServelet?method=login" method="post" style="margin:20px 0">
                        <div class="yh">
                            <label for="logname" class="p1">手机号码：</label>
                            <Input type=text id="logname" autofocus name="cellPhone" autocomplete="off" placeholder="手机号码" class="k">
                        </div>

                       <div class="mm">
                            <label for="password" class="p2">密码：</label>
                            <Input type=password id="password" name="pwd" autocomplete="off" placeholder="请输入密码" class="m">
                        </div>
                            <input type="submit" value="登录" class="dl">
                           <%-- <a name="ddnav_register" href="${pageContext.request.contextPath}/manage/ZhuCe.jsp"  class="zc">免费注册</a> --%>
        <%--   <input type="button" href="${pageContext.request.contextPath}/adminuser?method=zhuceUI" value="注册" class="zc">--%> 
                 </form>
</div>
</body>
</html>