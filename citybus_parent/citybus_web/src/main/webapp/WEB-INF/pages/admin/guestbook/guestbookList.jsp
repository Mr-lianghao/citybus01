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
			 window.location.href="${pageContext.request.contextPath}/servlet/guestbookList?currentPage="+baikuang;
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
	ckcode_msg="";
}

function delNews(){
	var gid =document.getElementById("gid").value;
	if(confirm("ȷ��Ҫɾ���������ݣ�")){
		window.location.href="${pageContext.request.contextPath}/servlet/delGuestbookById?gid="+gid;
	}

}
</script>
	

<BODY oncontextmenu="return false;" onselectstart="return false;" leftMargin=0 
background=/images/MainBg.gif topMargin=0 scroll=yes 
marginheight="0" marginwidth="0">
<TABLE  cellSpacing=0 cellPadding=0 width="100%" border=0>
  <TBODY>
  <tr>
  	<td bgcolor='#afd1f3' style="text-align:center">�����б�</td>
  </tr>
  <TR>
  	<input type="hidden" id="ckcode_msg" value="${ckcode_msg }"/>
    <TD align="left" vAlign=top > <form action="News.shtml?method=DELNEWS" method="post" name="pageform">
<table width='100%' cellspacing='1' cellpadding='3' bgcolor='#afd1f3' class="tablewidth">
     <tr class="head"> 
      <td width="5%" align="center">ID </td>
      <td  align="center">������</td> 
      <td  align="center">��������</td> 
      <td  align="center">qq</td> 
       <td  align="center">����ʱ��</td> 
      <td  align="center">����</td>
      <td  align="center">ѡ��</td>
    </tr>
   <c:forEach items="${pgb.list}" var="list" varStatus="vs"><input type="hidden" id="gid" value="${list.gid }"/>
	<tr  class="trA" onMouseOver="this.className='trB'" onMouseOut="this.className='trA'"> 
      <td width='5%' align="center" style="border-bottom:1px dotted ;">  ${list.gid }</td> 
      <td align="center" bgcolor="#FFFFFF"  style="border-bottom:1px dotted #ccc;">  ${list.nickname }</td> 
      <td align="center" bgcolor="#FFFFFF"  style="border-bottom:1px dotted #ccc;">${list.content1 } </td>
      <td align="center" bgcolor="#FFFFFF"  style="border-bottom:1px dotted #ccc;">${list.qq }</td> 
      <td align="center" bgcolor="#FFFFFF"  style="border-bottom:1px dotted #ccc;">${list.addtime }</td> 
      <td align="center" bgcolor="#FFFFFF"  style="border-bottom:1px dotted #ccc;"><a href="${pageContext.request.contextPath}/servlet/guestBookFindById?id=${list.gid}&addtime=${list.addtime}" >�ظ�</a> </td>
      <td align="center" bgcolor="#FFFFFF"  style="border-bottom:1px dotted #ccc;"><a href="#" onclick="delNews()" >ɾ��</a> </td>
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
					<a href="${pageContext.request.contextPath }/servlet/guestbookList?currentPage=1" ><img src="${pageContext.request.contextPath }/admin/images/first.gif" border="0" /></a>&nbsp;&nbsp;&nbsp;
		<a href="${pageContext.request.contextPath }/servlet/guestbookList?currentPage=${pgb.currentPage==1?1:pgb.currentPage-1}" ><img src="${pageContext.request.contextPath }/admin/images/pre.gif" border="0" /></a>&nbsp;&nbsp;&nbsp;
		 �� ${pgb.count }����¼,��   ${pgb.totalPage } ҳ,��ǰ��  ${pgb.currentPage }ҳ&nbsp;&nbsp;&nbsp;
		<a href="${pageContext.request.contextPath }/servlet/guestbookList?currentPage=${pgb.currentPage==pgb.totalPage?pgb.totalPage:pgb.currentPage+1}" ><img src="${pageContext.request.contextPath }/admin/images/next.gif" border="0" /></a>&nbsp;&nbsp;&nbsp;
		<a href="#" ><img src="${pageContext.request.contextPath }/admin/images/last.gif" border="0" /></a>
	 ��<input name="busjump" type="text" id="baikuang" size="3" />ҳ<a href="#" onClick="ckNum()"><img src="${pageContext.request.contextPath }/admin/images/jump.gif" border="0" /></a>&nbsp;&nbsp;&nbsp;
	 <input type="hidden" id="totalP" value="${pgb.totalPage}"/>
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
