<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="js/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
  
  
    <div class="table-responsive" >
	<table class="table table-condensed" >
     <caption>顺丰搬家预约信息查询——顺丰搬家，一路顺风</caption>
      <thead>
        <tr>
          <th>起始地区</th>
          <th>所用车型</th>
          <th>半价日期</th>
          <th>联系人</th>
          <th>联系电话</th>
          <th>状态</th>
          <th>操作</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${moveBookingList }" var="v">
	        
	        <tr>
	          <td>${v.area }</td>
	          <td>${v.cartype }</td>
	          <td><fmt:formatDate value="${v.movedate }" pattern="yyyy'年'MM'月'dd'日' HH:mm:ss"/></td>
	          <td>${v.contate }</td>
	          <td>${v.phone }</td>
	          <td>
	          <c:if test="${v.staus==0}">未处理</c:if>
	          <c:if test="${v.staus==1}">已处理</c:if>
	          <c:if test="${v.staus==2}">已结束</c:if>
	          </td>
	          
	          <td>
	             <a href="${pageContext.request.contextPath}/XgUI?id=${v.id}" class="btn btn-info">处理</a>
                 <a href="${pageContext.request.contextPath}/XqUI?id=${v.id}" class="btn btn-info">详情</a>
	          </td>
	        </tr>
       </c:forEach>
      </tbody>
      <a href="${pageContext.request.contextPath}/addUI" class="btn btn-info">添加</a>
      </table>
   
   </div>
</body>
</html>