<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>查看栏目</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="inc/css.css" type="text/css" />
<script type="text/javascript">
	//全选
	function checkAll(name) {
		var names = document.getElementsByName(name);
		var len = names.length;
		if (len > 0) {
			var i = 0;
			for (i = 0; i < len; i++)
				names[i].checked = true;

		}
	}

	//全不选
	function checkAllNo(name) {
		var names = document.getElementsByName(name);
		var len = names.length;
		if (len > 0) {
			var i = 0;
			for (i = 0; i < len; i++)
				names[i].checked = false;
		}
	}

	//反选
	function reserveCheck(name) {
		var names = document.getElementsByName(name);
		var len = names.length;
		if (len > 0) {
			var i = 0;
			for (i = 0; i < len; i++) {
				if (names[i].checked)
					names[i].checked = false;
				else
					names[i].checked = true;

			}
		}

	}
</script>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="dtree/dtree.css" type="text/css">
<link rel="stylesheet" href="inc/css.css" type="text/css">
<link rel="stylesheet" href="css/main.css" type="text/css">
<link rel="stylesheet" href="css/paiban.css" type="text/css">
<link href="css/style.css" rel="stylesheet" type="text/css" />

</head>

<body leftMargin=0 topMargin=0>
	<div class="left"><jsp:include page="Left.jsp"></jsp:include></div>
	<div class="head"><jsp:include page="head.jsp"></jsp:include></div>
	<div class="main">
		<div class="title">新闻中心&gt;&gt;新闻栏目管理&gt;&gt;查看栏目</div>
		<form name="form1" method="post" action="categ/Categdels">
			<table width="1052" border=0 align=center cellpadding=2 cellspacing=1
				bordercolor="#799AE1" class=tableBorder>
				<tbody>
					<tr>
						<th align=center colspan=16 style="height: 23px">查看栏目</th>
					</tr>
					<tr bgcolor="#DEE5FA">
						<td colspan="16" align="center" class=txlrow>&nbsp;</td>
					</tr>
					<tr align="center" bgcolor="#799AE1">
						<td width="6%" align="center" class="txlHeaderBackgroundAlternate">序号</td>
						<td width="20%" align="center" class=txlHeaderBackgroundAlternate>栏目名称</td>
						<td width="9%" align="center" class=txlHeaderBackgroundAlternate>创建者</td>
						<td align="center" class=txlHeaderBackgroundAlternate>创建时间</td>
						<td width="7%" align="center" class=txlHeaderBackgroundAlternate>修改人</td>
						<td width="23%" align="center" class=txlHeaderBackgroundAlternate>修改时间</td>
						<td width="6%" align="center" class=txlHeaderBackgroundAlternate>操作</td>
						<td width="4%" align="center" class=txlHeaderBackgroundAlternate>选定</td>
					</tr>

					<s:iterator value="categs" status="st">
						<tr bgcolor="#DEE5FA">
							<td align="center" class="txlrow">${st.count }</td>
							<td align=center class=txlrow>${categName }</td>
							<td align=center class=txlrow>${creator }</td>
							<td align=center bgcolor="#DEE5FA" class=txlrow>${createDate
								}</td>
							<td width="8%" align=center class=txlrow>${updater }</td>
							<td align=center class=txlrow>${update }</td>
							<td align=center class=txlrow>
								<a href="categ/Categget?id=${categ_Id}" title="查看/修改栏目"><img
								class="img_modify" src="images/modify1.gif" /> </a> 
								<a href="categ/Categdel?id=${categ_Id}" title="删除该栏目"><img
									class="img_modify" src="images/delete.gif" /> </a>
							</td>
							<td align=center class=txlrow><input type="checkbox"
								name="selectid" value="${categ_Id}"></td>
						</tr>
					</s:iterator>
					<tr bgcolor="#DEE5FA">
						<td colspan="16" align=right bgcolor="#DEE5FA" class=txlrow>
							<span class="tablebody2"> <input type="button" value="全选"
								id="ckall" onClick="checkAll('selectid')" /> </span> <span
							class="tablebody2"> <input type="button" value="反选"
								id="ckReserve" onClick="reserveCheck('selectid','ckReserve')" />
						</span> <span class="tablebody2"> <input type="button" value="清空"
								name="selectButton" onClick="checkAllNo('selectid')" /> </span> <input
							type="submit" name="ok" value="删除" class="but"></td>
					</tr>
					<tr bgcolor="#DEE5FA">
						<td colspan=16 align=center class=txlrow></td>
					</tr>
				</tbody>
			</table>
		</FORM>
	</div>
</body>
</html>
