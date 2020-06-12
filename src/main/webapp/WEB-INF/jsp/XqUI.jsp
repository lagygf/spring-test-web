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
 <caption>顺丰搬家预约信息查询——顺丰搬家，一路顺风</caption>
	<form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/list">
		
		
		<div class="form-group">
			<label for="inputEmail3" class="col-sm-2 control-label">起始地区</label>
			<div class="col-sm-10">
				<input type="text" name="area" class="form-control" id="inputEmail3"
					placeholder="请输入视频名称" readonly="readonly" value="${moveBookingList.area }">
			</div>
		</div>
		<div class="form-group">
			<label for="inputPassword3" class="col-sm-2 control-label">所用车型</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="cartype" id="inputPassword3"
					placeholder="视频描述" readonly="readonly" value="${moveBookingList.cartype }">
			</div>
		</div>
		<div class="form-group">
			<label for="inputPassword3" class="col-sm-2 control-label">搬家日期</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="movedate" id="inputPassword3"
					placeholder="背景音乐名"  readonly="readonly" value='<fmt:formatDate value="${moveBookingList.movedate }" pattern="yyyy'-'MM'-'dd HH:mm:ss"/>'>
			</div>
		</div>
		
		<div class="form-group">
			<label for="inputPassword3" class="col-sm-2 control-label">联系人</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="contate" id="inputPassword3"
					placeholder="视频类型" readonly="readonly" value="${moveBookingList.contate }">
			</div>
		</div>
		
		<div class="form-group" hidden>
			<label for="inputPassword3" class="col-sm-2 control-label">联系电话</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="phone" id="inputPassword3"
					placeholder="用户id"  value="${moveBookingList.area }" readonly="phone">
			</div>
		</div>
		
		<div class="form-group" >
			<label for="inputPassword3" class="col-sm-2 control-label">状态</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="staus" id="inputPassword3"
					placeholder="用户id"  value=
					<c:if test="${moveBookingList.staus==0}">未处理</c:if>
	                <c:if test="${moveBookingList.staus==1}">已处理</c:if>
	                <c:if test="${moveBookingList.staus==2}">已结束</c:if> readonly="readonly">
			</div>
		</div>
		
		<div class="form-group" >
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default" >返回</button>
			</div>
		</div>
	</form>
</body>
</html>