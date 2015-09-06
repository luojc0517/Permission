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

<title>管理角色信息</title>
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
		<div class="title">新闻中心&gt;&gt;新闻管理&gt;&gt;角色维护</div>

		<form name="addUserForm" method="post" action="role/Roleadd">
			<div class="main_input">
				<table>
					<tr>
						<th align=center colspan=16 style="height: 23px">添加角色</th>
					</tr>
					<tr bgcolor="#DEE5FA">
						<td colspan="16" align="center" class=txlrow>&nbsp;</td>
					</tr>
					<tr>
						<td width="11%" class="tdbg1"></td>
						<td width="11%" class="tdbg1">角色名称：</td>
						<td width="31%"><input type="text" name="role.roleName"
							value="" class="text"><span> *</span>
						</td>
						<td width="11%" class="tdbg1"></td>
					</tr>
					<tr>
						<td width="11%" class="tdbg1"></td>
						<td width="11%" class="tdbg1">角色描述：</td>
						<td width="31%"><textarea name="role.roleContent" cols="50"
								rows="5"></textarea><span> *</span>
						</td>
						<td width="11%" class="tdbg1"></td>
					</tr>

					<tr>
						<td colspan="4" align="center"><br /> <input type="submit"
							value="保存" class="btn"> &nbsp;&nbsp;&nbsp;&nbsp; <input
							class="btn" type="button" value="取消" onClick="history.back(1)" /><br />
							<br />
						</td>
					</tr>

				</table>
			</div>
		</form>
		<div class="list">
			<table>
				<tr>
					<th align=center colspan=16 style="height: 23px">已存在角色</th>
				</tr>
				<tr bgcolor="#DEE5FA">
					<td colspan="16" align="center" class=txlrow>&nbsp;</td>
				</tr>
				<tr class="title">
					<td width="5%">序号</td>
					<td width="10%">角色名称</td>
					<td width="10%">创建人</td>
					<td width="20%">创建时间</td>
					<td width="10%">修改人</td>
					<td width="20%">修改时间</td>
					<td width="10%">操作</td>
				</tr>

				<s:iterator value="roles" status="st" var="role">
					<tr>
						<td>${st.count }</td>
						<td>${roleName }</td>
						<td>${creator }</td>
						<td>${createDate }</td>
						<td>${updater }</td>
						<td>${updateDate }</td>
						<td><s:a href="role/Roleget?id=%{role_Id}" title="修改角色">
								<img class="img_modify" src="images/modify.gif" />
							</s:a> <a href="auth/AuthaddRole?id=${role_Id}" title="查看/修改权限"><img
								class="img_modify" src="images/modify1.gif" /> </a> <a
							href="role/Roledel?id=${role_Id}" title="删除该角色"><img
								class="img_modify" src="images/delete.gif" /> </a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</div>
	</div>
</body>
</html>
