<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/images/css.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" type="text/css" />
<SCRIPT language=JavaScript src="images/css/Common.js"></SCRIPT>
<script type="text/javascript">
 window.onload=function(){
 	var user_img = document.getElementsByName("user_img");
 	var req_msg=document.getElementById("req_msg");
 	var replaycontent = document.getElementsByName("replaycontent");
 	var replay = document.getElementsByName("replay");
 	for(var i=0;i<replay.length;i++){
 		//alert(replay[i].value);
 		if(replay[i].value!=""){
 		//alert("ture");
 		replaycontent[i].style.display="";
 		} 
 	}
 	//alert(req_msg.value);
 	if(req_msg.value=="�����ɹ���"){
 		alert(req_msg.value);
 	}
 	if(req_msg.value=="�����Ƚ��е�½������ɸò�����"){
 		
 		if(confirm("�����������ȵ�½���Ƿ�������½��")){
 			window.location.href="${pageContext.request.contextPath }/login.jsp"
 		}
 	}
 	
 	/* if(replay==null){
 		replaycontent.style="display:none;";
 	} */
 	
 
 }

	function checkGUEST(){
		//alert("aaa");
		var form1 =document.getElementById("form1");
		//var nickname = document.getElementById("nickname").value;
		var email = document.getElementById("email1").value;
		var qq = document.getElementById("qq").value;
		var content1 = document.getElementById("content1").value;
		var today = document.getElementById("today").value;
		if(email==""||qq==""||content1==""){
			alert("����д������Ϣ��");
		}else{
			form1.submit();
		}
		
	}
	
	
  
</script>
<script type="text/javascript" src="./js/jquery.js"></script>
	    <script type="text/javascript" src="./js/jquery.form.js"></script>
	    <script type="text/javascript" src="./js/ajaxfileupload.js"></script>
        <script type="text/javascript">
			function uploadImage() {
				$.ajaxFileUpload({
					url: "${pageContext.request.contextPath}/servlet/upload1",
					secureuri:false,
					fileElementId:"user_img",
					dataType:"content",
					error: function(data, status, e) {
						alert(e);
					},
					success: function(data, textStatus) {
					//alert("data="+data);
					var start = data.indexOf(">");  
			            if(start != -1) {  
			              var end = data.indexOf("<", start + 1);  
			              if(end != -1) {  
			                data = data.substring(start + 1, end);  
			               }  
			            } 
			          // alert("data:"+data);
						$("#touxiang").attr('src',"${pageContext.request.contextPath}/upload/"+data); 
						
					}
				});
			}
  
		</script>

</head>

<title>����</title>

<body class="main">
<jsp:include page="../home/head.jsp" />
<jsp:include page="../home/menu_search.jsp" />
<DIV align=center id="divpagecontent">
<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        <TR>
          <TD >
<TABLE class=dragTable height=28 cellSpacing=0 cellPadding=0 width=100% align=center background=images/head1.gif border=0>
  <TBODY>
  <TR>
    <TD> 
    <div style="text-align:left; margin:5px 10px 5px 0px">
						<a href="index.jsp">��ҳ</a>&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;����Ͷ��
					</div>
	</TD>
	</TR>
  </TBODY>
</TABLE>
</TD>
</TR>
        <TR>
          <TD class=middle><br>
	<!--ѭ����ʼ==============================================================-->
	
	<!-- �����ǽ��з�ҳ�����г�ʼ�� -->
	
	<TABLE class=guestbook cellSpacing=0 cellPadding=0 width="100%" 
            border=0>
           
              <TBODY>
               <c:forEach items="${results}" var="list">
               <input type="hidden" name="user_img" value=""/>
              <TR>
                <TD class=Ftd align=middle width="18%" rowSpan=2>
                  <DIV class=icon><IMG height=80  src="${pageContext.request.contextPath }/upload/" width=80 border=0></DIV>
                  <DIV class=name>�û���</DIV></TD>
                <TD class=Ctd vAlign=top width="82%" height=75>
                  <TABLE style="TABLE-LAYOUT: fixed; WORD-WRAP: break-word" cellSpacing=0 cellPadding=0 width="80%" border=0>
                    <TBODY>
                    <TR>
                      <TD class=content align=left  >
                      		
					  		${list.content1 }
                      
                     <!--  // if(!replay.isEmpty()){	 --> 
                       
                        <FIELDSET name="replaycontent" style="display:none;">
                        <input  type="hidden" name ="replay" value=""/>
						<LEGEND>�ظ�: </LEGEND> 
                       (���� : /����: )
						</FIELDSET>
					  </TD>
					 </TR>
					
					</TBODY>
				</TABLE>
				</TD>
				</TR>
              <TR>
                <TD class=Atd width="82%">
                ʱ�䣺 ${list.addtime }&nbsp;
					</TD>
			  </TR>
			   </c:forEach>
			  </TBODY>
			  
			  </TABLE>
			  

	<!--ѭ������==================================================================-->        
          <br>
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
              <TBODY>
              <TR>
                <TD style="text-align:right">
             <SPAN >��${pbg.currentPage }/ ${pbg.totalPage }ҳ ÿҳ ${pbg.pageSize}�� <Aclass=a01href="${pageContext.request.contextPath }/servlet/findGuestBookAll?currentPage=1">��ҳ</A>
			<A class=a01 href="${pageContext.request.contextPath }/servlet/findGuestBookAll?currentPage=${pbg.currentPage==1?1:pbg.currentPage-1}">��һҳ</A>
			<A class=a01	href="${pageContext.request.contextPath }/servlet/findGuestBookAll?currentPage=${pbg.currentPage==pbg.totalPage?pbg.totalPage:pbg.currentPage+1}">��һҳ</A>
			<A class=a01 href="">ĩҳ</A>
			</SPAN>
			</TD>
                </TR>
                </TBODY>
                </TABLE></TD></TR>
        <TR>
          <TD class=foot>
            <H3 class=L></H3>
            <H3 class=R></H3></TD></TR></TBODY></TABLE>
<TABLE class=dragTable height=28 cellSpacing=0 cellPadding=0 width=100% align=center border=0>
        <TBODY>
        <TR>
          <TD align=left class=head>&nbsp;����Ͷ��</TD></TR>
        <TR>
          <TD class=middle>
<STYLE type=text/css>.selected {
	BORDER-RIGHT: #ff9900 1px solid; BORDER-TOP: #ff9900 1px solid; FILTER: Alpha(opacity=100); BORDER-LEFT: #ff9900 1px solid; BORDER-BOTTOM: #ff9900 1px solid
}
.unselected {
	BORDER-RIGHT: #edf8dd 1px solid; BORDER-TOP: #edf8dd 1px solid; FILTER: Alpha(opacity=50); BORDER-LEFT: #edf8dd 1px solid; BORDER-BOTTOM: #edf8dd 1px solid
}
</STYLE>


<FORM name="form1" action="${pageContext.request.contextPath }/servlet/guestAdd"method="post" id="form1" onSubmit="return false" >
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
              <TBODY>
              <input type="hidden" id="req_msg" value="${req_msg }"/>
              <TR>
                <TD width="24%" style="text-align:right">��&nbsp;&nbsp;&nbsp;&nbsp;��: </TD>
                <TD align=left><INPUT name=nickname id="nickname" maxlength=20 value="${user.username }" readonly> ��ϵEmail: 
                <INPUT name=email id="email1" maxlength=20> QQ: <INPUT size=12 id="qq" name=qq maxlength=11>
                <input type="hidden" name="gid" value="${user.id}" /> 
                <input type="hidden" name="addtime" value="" id="today"/> 
				<script type="text/javascript">
				  function today(){
					var today = new Date();
					var h=today.getFullYear();
					var m=today.getMonth()+1;
					var d=today.getDate();
					return h+"-"+m+"-"+d;
				  
				  }
				  document.getElementById("today").value = today();
				  </script>
              </TD></TR>
             
              <TR>
                <TD width="24%" style="text-align:right">����Ͷ��:</TD>
                <TD align=left><TEXTAREA name=content1 id=content1 size=100 rows=7 cols=80></TEXTAREA> 
                </TD></TR>
              <TR>
                <TD width="24%">&nbsp;</TD>
                <TD align=left><INPUT type="button" value="�� ��" onclick="checkGUEST()" name=Submit> 
            </TD></TR></TBODY></TABLE></FORM></TD></TR>
        <TR>
          <TD >
            <H3></H3>
            <H3></H3></TD></TR></TBODY></TABLE>
</DIV>
	<jsp:include page="../home/foot.jsp" />
</body>
</html>