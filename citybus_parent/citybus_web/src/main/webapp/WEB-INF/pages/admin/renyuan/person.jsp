<%@ page language="java" import="java.util.*"  contentType="text/html;charset=gb2312"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<HTML><HEAD><TITLE>��̨������</TITLE>
<LINK href="${pageContext.request.contextPath}/images/Admin_Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath}/images/style.css" type=text/css rel=stylesheet>
<SCRIPT language=JavaScript src="${pageContext.request.contextPath}/images/Common.js"></SCRIPT>
<STYLE type=text/css>
BODY {
	MARGIN-LEFT: 0px; BACKGROUND-COLOR: #ffffff
}
.STYLE1 {color: #ECE9D8}
</STYLE>
</HEAD>
<script  language="javascript" >

function ckNum(){
		var baikuang = document.getElementById("baikuang").value;
		var totalPage = document.getElementById("totalP").value;
		//alert(baikuang.value);
		 if(!isNaN(baikuang)){
			//alert("�����ֵ���������ͣ�");
			if(baikuang>totalPage){
				alert("���ܳ�����ҳ����");
			}else if(baikuang<0){
				alert("������Ϸ�ֵ");
			}else{
			 window.location.href="${pageContext.request.contextPath}/servlet/findNewsAll?currentPage="+baikuang;
			}
		}else{
			alert("����������");
		}
 
}


window.onload = function(){
	var ckcode_msg =document.getElementById("ckcode_msg").value;
	if(ckcode_msg!=""){
		alert(ckcode_msg);
	}
	
	
}

function delPerson(id){
	if(confirm("ȷ��Ҫɾ���������ݣ�")){
		window.location.href="${pageContext.request.contextPath}/servlet/delUserById?id="+id;
	}

}
</script>
	

<BODY oncontextmenu="return false;" onselectstart="return false;" leftMargin=0 
 topMargin=0 scroll=yes 
marginheight="0" marginwidth="0">
<TABLE  cellSpacing=0 cellPadding=0 width="100%" border=0>
  <TBODY>
  <tr>
  	<td bgcolor='#afd1f3' style="text-align:center"> ��Ա�б�</td>
  </tr>
  <TR>
  	<input type="hidden" id="ckcode_msg" value="${ckcode_msg }"/>
    <TD align="left" vAlign=top > <form action="" method="post" name="pageform">
<table width='100%' cellspacing='1' cellpadding='3' bgcolor='#afd1f3' class="tablewidth">
     <tr class="head"> 
      <td width="5%" align="center">ID </td>
      <td  align="center">�û���</td> 
      <td  align="center">ע��ʱ��</td> 
      <td  align="center">��½����</td>
      <td  align="center">�ϴε�½ʱ��</td>
      <td  align="center">ɾ��</td>
    </tr>
   <c:forEach items="${pbp.user }" var="user" varStatus="vs"><input type="hidden" id="id" value="${user.id }"/>
	<tr  class="trA" onMouseOver="this.className='trB'" onMouseOut="this.className='trA'"> 
      <td width='5%' align="center" style="border-bottom:1px dotted ;"> ${user.id }  </td> 
      <td align="center" bgcolor="#FFFFFF"  style="border-bottom:1px dotted #ccc;">${user.username } </td>
      <td align="center" bgcolor="#FFFFFF"  style="border-bottom:1px dotted #ccc;">${user.regtime }</td> 
      <td name="nums" align="center" bgcolor="#FFFFFF"  style="border-bottom:1px dotted #ccc;" value="${user.nums }"> ${user.nums }</td> 
      <td name="lasttime" align="center" bgcolor="#FFFFFF"  style="border-bottom:1px dotted #ccc;" value="${user.lasttime }">${user.lasttime } </td>
      <td align="center" bgcolor="#FFFFFF"  style="border-bottom:1px dotted #ccc;"><a href="#" onclick="delPerson('${user.id}')" >ɾ��</a> </td>
    </tr>
	</c:forEach>
	 
	 </TABLE></form>
	</td>
	</tr>
	<tr bgcolor='#FFFFFF'>
	<td colspan='10' align='right'>
	<TABLE width="100%" border=0 align="right" cellPadding=0 cellSpacing=0>
     <TBODY>
     <TR align="right" >
	 <TD >
	 <form action="" method="post" name="form3">	
	 <input type="hidden" name="pageCount" value="" /><!--//���ڸ�����javascript��ֵ-->
	 <input type="hidden" name="page" value="" /><!--//���ڸ�����javascript��ֵ-->         
					<a href="${pageContext.request.contextPath }/servlet/findPersonsAll?currentPage=1" ><img src="${pageContext.request.contextPath }/admin/images/first.gif" border="0" /></a>&nbsp;&nbsp;&nbsp;
		<a href="${pageContext.request.contextPath }/servlet/findPersonAll?currentPage=${pbp.currentPage==1?1:pbp.currentPage-1}" ><img src="${pageContext.request.contextPath }/admin/images/pre.gif" border="0" /></a>&nbsp;&nbsp;&nbsp;
		 �� ${pbp.count }����¼,��   ${pbp.totalPage } ҳ,��ǰ��  ${pbp.currentPage }ҳ&nbsp;&nbsp;&nbsp;
		<a href="${pageContext.request.contextPath }/servlet/findPersonAll?currentPage=${pbp.currentPage==pbp.totalPage?pbp.totalPage:pbp.currentPage+1}" ><img src="${pageContext.request.contextPath }/admin/images/next.gif" border="0" /></a>&nbsp;&nbsp;&nbsp;
		<a href="#" ><img src="${pageContext.request.contextPath }/admin/images/last.gif" border="0" /></a>
	 ��<input name="busjump" type="text" id="baikuang" size="3" />ҳ<a href="#" onClick="ckNum()"><img src="${pageContext.request.contextPath }/admin/images/jump.gif" border="0" /></a>&nbsp;&nbsp;&nbsp;
	 <input type="hidden" id="totalP" value="${pbp.totalPage}"/>
	 </form>
           </TD>
           </TR>
</table>
   </TD>
	</TR> 
  </TBODY>
</TABLE>
</BODY>

</HTML>
