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
				<form name="majorIssueForm" method="post" action="auth/Authupdate">
					<input type="hidden" name="auth.auth_Id" value="${auth.auth_Id }">
					<table width="200" cellspacing="0" cellpadding="0">
						<tr align="right" bgcolor="#F1F2FE">
							<td colspan="4"><input type="image"
								src="images/MIS026_19.gif" /> <input type="image"
								src="images/MIS026_21.gif" /></td>
						</tr>

						<tr>
							<td class="tdbg1">权限名称：</td>
							<td><input type="text" name="auth.authName"
								value="${auth.authName }" class="inp1">
							</td>
							<td class="tdbg1">访问路径：</td>
							<td width="31%"><input type="text" name="auth.authUrl"
								value="${auth.authUrl }" class="inp1"></td>
						</tr>
						<tr>
							<td class="tdbg1">所属于节点：</td>
							<td><select name="auth.authParentRoot">
									<c:if test="${auth.authParentRoot == '1'}">
										<option value="1">权限管理</option>
										<option value="2">新闻管理</option>
									</c:if>
									<c:if test="${auth.authParentRoot == '2'}">
										<option value="2">新闻管理</option>
										<option value="1">权限管理</option>
									</c:if>
							</select></td>
							<td class="tdbg1">是否是根节点：</td>
							<td><c:if test="${auth.authIsRoot == '是'}">
									<input type="radio" name="auth.authIsRoot" value="是" checked>是
									<input type="radio" name="auth.authIsRoot" value="否">否
								</c:if> <c:if test="${auth.authIsRoot == '否'}">
									<input type="radio" name="auth.authIsRoot" value="是">是
									<input type="radio" name="auth.authIsRoot" value="否" checked>否
								</c:if>
							</td>
						</tr>
						<tr>
							<td colspan="4" align="center"><br /> <input type="submit"
								value="保存" class="btn"> &nbsp;&nbsp;&nbsp;&nbsp; <input
								class="btn" type="button" value="取消" onClick="history.back(1)" /><br />
								<br /></td>
						</tr>
					</table>
				</form>

			</div>
		</div>
	</div>
</body>
</html>
