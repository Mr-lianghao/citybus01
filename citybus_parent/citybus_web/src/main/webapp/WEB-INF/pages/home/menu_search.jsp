<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/my.js">
	
</script>


<div id="divmenu">
	<a
		href="${pageContext.request.contextPath}/index.jsp">首页</a>
	<a
		href="${pageContext.request.contextPath}/pageAction_bus_busSearch1">公交查询</a>
		<a
		href="${pageContext.request.contextPath}/front/lineAction_list">公交列表</a>
	<a
		href="${pageContext.request.contextPath}/front/newsAction_list.action">公交新闻</a>
	<a
		href="${pageContext.request.contextPath}/front/guestBookAction_list">留言建议</a>
	<a
		href="${pageContext.request.contextPath}/servlet/showAllLost">失物招领</a>
	
	<a
		href="pageAction_login_adminLogin1">管理员登陆</a>
	<a
		href="${pageContext.request.contextPath}/pageAction_home_contractUs">联系我们</a>

</div>
<div id="divsearch">
	<form action="${pageContext.request.contextPath}/findProductBySearch"
		method="post">
		<table width="100%" border="0" cellspacing="0">
			<tr>
				<td style="text-align:right; padding-right:220px">
				&nbsp; 
				</td>
			</tr>
		</table>

	</form>
</div>
<div id="content"
	style="background-color:white;width:128px; text-align:left;margin-left:945px;color:black;float:left;margin-top: -20px;display: none">
</div>