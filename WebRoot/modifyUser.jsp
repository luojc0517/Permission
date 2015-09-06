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
		<div class="title">系统首页&gt;&gt;用户维护&gt;&gt;修改用户</div>
		<form name="addUserForm" method="post" action="Userupdate">
			<input type="hidden" value="${user.user_Id }" name="user.user_Id">
			<div class="main_input">
				<table>
					<tr>
						<td width="11%" class="tdbg1">用 户 名：</td>
						<td width="31%"><input type="text" name="user.userName"
							value="${user.userName }" class="text"><span> *</span></td>
						<td width="11%" class="tdbg1">真实姓名：</td>
						<td width="31%"><input type="text" name="user.userTrueName"
							value="${user.userTrueName }" class="text"><span>
								*</span></td>
					</tr>
					<tr>
						<td width="11%" class="tdbg1">用户状态：</td>
						<td width="31%"><select name="user.userState">
								<option value="${user.userState }">${user.userState }</option>
								<option value="是">是</option>
								<option value="否">否</option>
						</select> <span> *</span></td>
						<td width="11%" class="tdbg1">密 &nbsp; &nbsp; &nbsp; 码：</td>
						<td width="31%"><input class="text" type="text"
							name="user.password" value="${user.password }" /><span> *</span>
						</td>
					</tr>

					<tr>
						<td colspan="4" align="center"><br /> <input type="submit"
							value="修改" class="btn"> &nbsp;&nbsp;&nbsp;&nbsp; <input
							class="btn" type="button" value="取消" onClick="history.back(1)" /><br />
							<br /></td>
					</tr>

				</table>
			</div>
		</form>

	</div>
</body>
</html>
