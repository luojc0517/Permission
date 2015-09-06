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

<title>添加用户权限</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/authority.js"></script>

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
		<div class="title">系统首页&gt;&gt;管理用户角色&gt;&gt;用户名</div>
		<div id="layout_multiSelect">
			<form name="userRoleUpdateForm" method="post" action="UseraddAuth">
				<input type="hidden" name="id" value="${id }" />${id }
				<table>
					<tr>
						<th align=center colspan=16 style="height: 23px">添加权限</th>
					</tr>
					<tr bgcolor="#DEE5FA">
						<td colspan="16" align="center" class=txlrow>&nbsp;</td>
					</tr>
					<tr>
						<td>所有权限列表</td>
						<td>&nbsp;</td>
						<td>已选择权限列表</td>
					</tr>
					<tr>
						<td width="45%"><select name="allRoleIds" multiple="multiple"
							id="select_left" class="multiSelect_left">
								<s:iterator value="auths" var="auth">
									<c:set value="${0 }" var="i"></c:set>
									<c:set value="${0 }" var="count"></c:set>
									<s:iterator value="user.auths" var="userAuth" status="st">
										<c:set value="${st.count }" var="count"></c:set>
										<c:if test="${auth.auth_Id != userAuth.auth_Id }">
											<c:set value="${i+1 }" var="i"></c:set>
										</c:if>
									</s:iterator>
									<c:if test="${i == count }">
										<option value="${auth.auth_Id }">${auth.authName }</option>
									</c:if>
								</s:iterator>
						</select>
						</td>
						<td width="10%"><input class="btn" type="button"
							value="&gt;&gt;&gt;&gt;" onclick="moveOption('toRight')"><br>
							<br> <br> <br> <br> <input class="btn"
							type="button" value="&lt;&lt;&lt;&lt;"
							onclick="moveOption('toLeft')"></td>
						<td width="45%"><select name="auths" multiple="multiple"
							id="select_right" class="multiSelect_left">
								<s:iterator value="user.auths" var="userAuth">
									<option value="${userAuth.auth_Id }">${userAuth.authName }</option>
								</s:iterator>
						</select></td>
					</tr>
					<tr>
						<td><input type="button" class="btn" value="保存"
							onclick="selectAllCommit();" /></td>

						<td>&nbsp;</td>
						<td><input class="btn" type="button" value="取消"
							onClick="history.back(1)" />
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<s:debug></s:debug>
</body>
</html>
