<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<title>权限管理</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" href="dtree/dtree.css" type="text/css">
<link rel="stylesheet" href="inc/css.css" type="text/css">
<link rel="stylesheet" href="css/main.css" type="text/css">
<link rel="stylesheet" href="css/paiban.css" type="text/css">

</head>

<body>
	<div class="left"><jsp:include page="Left.jsp"></jsp:include></div>
	<div class="head"><jsp:include page="head.jsp"></jsp:include></div>
	<div class="main">
		<div class="title">前位置：管理首页 &gt; 权限管理 &gt;增加权限</div>
		<div class="main_input">

			<div class="content">
				<form name="majorIssueForm" method="post" action="auth/Authadd">
					<table width="200" cellspacing="0" cellpadding="0">
						<tr>
							<th align=center colspan=16 style="height: 23px">添加权限</th>
						</tr>
						<tr bgcolor="#DEE5FA">
							<td colspan="16" align="center" class=txlrow>&nbsp;</td>
						</tr>
						<tr align="right" bgcolor="#F1F2FE">
							<td colspan="4"><input type="image"
								src="images/MIS026_19.gif" /> <input type="image"
								src="images/MIS026_21.gif" /></td>
						</tr>

						<tr>
							<td class="tdbg1">权限名称：</td>
							<td><input type="text" name="auth.authName" value=""
								class="inp1">
							</td>
							<td class="tdbg1">访问路径：</td>
							<td width="31%"><input type="text" name="auth.authUrl"
								value="" class="inp1"></td>
						</tr>
						<tr>
							<td class="tdbg1">所属于节点：</td>
							<td><select name="auth.authParentRoot">
									<s:iterator value="auths">
										<option value="${auth_Id }">${authName }</option>
									</s:iterator>
							</select></td>
							<td class="tdbg1">是否是根节点：</td>
							<td><input type="radio" name="auth.authIsRoot" value="是"
								checked>是 <input type="radio" name="auth.authIsRoot"
								value="否">否</td>
						</tr>
					</table>
				</form>
				<div class="list">
					<table>
						<tr>
							<th align=center colspan=16 style="height: 23px">已存在权限</th>
						</tr>
						<tr bgcolor="#DEE5FA">
							<td colspan="16" align="center" class=txlrow>&nbsp;</td>
						</tr>
						<tr class="title">
							<td width="10%">序号</td>
							<td width="10%">权限名称</td>
							<td width="10%">权限路径</td>
							<td width="10%">所属节点</td>
							<td width="10%">创建时间</td>
							<td width="10%">操作</td>

						</tr>

						<s:iterator value="auths" status="st">
							<tr>
								<td>${st.count }</td>
								<td>${authName }</td>
								<td>${authUrl }</td>
								<td>${authParentRoot }</td>
								<td>${createDate }</td>
								<td><a href="auth/Authget?id=${auth_Id}" title="查看/修改权限"><img
										class="img_modify" src="images/modify1.gif" /> </a> <a
									href="auth/Authdel?id=${auth_Id}" title="删除该权限"><img
										class="img_modify" src="images/delete.gif" /> </a></td>
							</tr>
						</s:iterator>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
