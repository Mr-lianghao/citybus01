<%@ page language="java" import="java.util.*;" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>公交列表</title>
<%--导入css --%>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/main.css" type="text/css" />
<link href="${pageContext.request.contextPath }/js/c.css" rel="stylesheet" type="text/css">
</head>
<script src="./js/jquery.js" type="text/javascript"></script>
<script type="text/javascript">
	window.onload=function(){
		var sear = document.getElementById("count").value;
		var aa = document.getElementById("aa");
		if(sear==""||sear==null||sear==0||sear=="0"){
		//alert("aa");
			aa.style.display="";
			aa.innerHTML="<font color='red'size='4'>很抱歉，沒有找到符合的路线。</font>";
			
		}
	}

</script>
<body class="main">

	<jsp:include page="../home/head.jsp" />
	<jsp:include page="../home/menu_search.jsp" />
<div>
<div class="warp2">
	<div class="left_side">
	 <div style="text-align:left; margin:5px 10px 5px 0px">
						<a href="index.jsp">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;公交查询&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;查询结果
					</div><div class="l_main">
			<div class="z_content">
				<div class="v_text v_text2"><h1>到${searchname }的公交车要怎么坐？</h1></div>

			
				<div class="clear"></div>


				<div class="futit"></div>
				<div class="z_info">



	经过<font color="red">${searchname }</font>共有

<font color="blue"> </font>、


 <font color="blue"> </font>
 等<font color="red">${count }</font>趟公交车<br>


<table class="search-table">
	<thead><tr><th> <a href="${pageContext.request.contextPath }/servlet/lineShow?lname=" style="color:green;">查看地图</a></th></tr></thead>
	<tbody>
		<tr><td>市区线路&nbsp;票价1元,A/B/C/D卡有效&nbsp;6:30-20:00</td></tr>
		<tr><td>
	上行：
	</td></tr>
		<tr><td>
	下行：
	</td></tr>
		</tbody>
</table><br>

				</div>

			</div>
		</div>
		<div class="l_bottom"></div>
	
	</div>


	

	<div class="clear"></div>

</div>



<div class="warp3">
<div class="clear"></div>
</div>
<jsp:include page="../home/foot.jsp" />


</body>
</html>
