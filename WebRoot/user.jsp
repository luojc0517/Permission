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

<title>创建用户</title>
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
		<div class="title">系统首页&gt;&gt;用户维护&gt;&gt;创建用户</div>
		<form name="addUserForm" method="post" action="Useradd">
			<div class="main_input">
				<table>
					<tr>
						<th align=center colspan=16 style="height: 23px">添加用户</th>
					</tr>
					<tr bgcolor="#DEE5FA">
						<td colspan="16" align="center" class=txlrow>&nbsp;</td>
					</tr>
					<tr>
						<td width="11%" class="tdbg1">用 户 名：</td>
						<td width="31%"><input type="text" name="user.userName"
							value="" class="text"><span> *</span>
						</td>
						<td width="11%" class="tdbg1">真实姓名：</td>
						<td width="31%"><input type="text" name="user.userTrueName"
							value="" class="text"><span> *</span>
						</td>
					</tr>
					<tr>
						<td width="11%" class="tdbg1">密 &nbsp; &nbsp; &nbsp; 码：</td>
						<td width="31%"><input class="text" type="password"
							name="user.password" /><span> *</span>
						</td>
						<td width="11%" class="tdbg1">确认密码：</td>
						<td width="31%"><input class="text" type="password"
							name="repassword" /><span> *</span>
						</td>
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
					<th align=center colspan=16 style="height: 23px">已存在用户</th>
				</tr>
				<tr bgcolor="#DEE5FA">
					<td colspan="16" align="center" class=txlrow>&nbsp;</td>
				</tr>
				<tr class="title">
					<td width="10%">序号</td>
					<td width="10%">用户姓名</td>
					<td width="10%">真实姓名</td>
					<td width="10%">用户状态</td>
					<td width="10%">创建时间</td>
					<td width="10%">操作</td>

				</tr>

				<s:iterator value="users" status="st" var="user">
					<tr>
						<td>${st.count }</td>
						<td>${user.userName }</td>
						<td>${user.userTrueName }</td>
						<td>${user.userState }</td>
						<td>${user.createDate }</td>
						<td><a href="Userget?id=${user_Id}" title="修改用户">
								<img class="img_modify" src="images/modify.gif" />
							</a> <a href="role/RoleaddUser?id=${user_Id}" title="查看/修改角色"><img
								class="img_modify" src="images/modify2.gif" /> </a> <a
							href="auth/AuthaddUser?id=${user_Id}" title="查看/修改权限"><img class="img_modify"
								src="images/modify1.gif" /> </a> <a href="Userdel?id=${user_Id}"
							title="删除该用户"><img class="img_modify" src="images/delete.gif" />
						</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</div>
	</div>
</body>
</html>
