<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="js/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="bootstrap/js/bootstrap-datetimepicker.js"></script>
</head>
<body>
	<form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/add">
		
		<div class="form-group">
          <label  class="col-sm-2 control-label">起始地</label>
            <div class="col-sm-4">
            <select class="form-control" id="selecDate" name="area" >
                <option value="西城区">西城区</option>
                <option value="湖南">湖南</option>
                <option value="长沙">长沙</option>
                <option value="岳阳">岳阳</option>
                <option value="深圳">湖南</option>
                <option value="广东">广东</option>
            </select>
           </div>
        </div>
		<div class="form-group" >
			<label for="inputPassword3" class="col-sm-2 control-label">所用车型</label>
			<div class="col-sm-10">
			    <label><input name="cartype" type="radio" value="金杯 " />金杯 </label>
				<label><input name="cartype" type="radio" value="皮卡" />皮卡 </label> 
                 <label><input name="cartype" type="radio" value="箱式货车" />箱式货车 </label> 
                <label><input name="cartype" type="radio" value="1041货车" />1041货车</label>
			</div>
		</div>
		
		<div class="form-group">
			<label for="inputEmail3" class="col-sm-2 control-label">搬家日期</label>
			<div class="col-sm-10">
				<input type="text" name="movedate" class="form-control" id="inputEmail3"
					placeholder="请输入搬家日期">
			</div>
		</div>
		
		<div class="form-group">
			<label for="inputPassword3" class="col-sm-2 control-label">联系人</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="contate" id="inputPassword3"
					placeholder="联系人">
			</div>
		</div>
		
		<div class="form-group">
			<label for="inputPassword3" class="col-sm-2 control-label">联系电话</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="phone" id="inputPassword3"
					placeholder="联系电话">
			</div>
		</div>
		        
		
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-primary">预约登记 </button>
			</div>
		</div>
	</form>

</body>


</html>