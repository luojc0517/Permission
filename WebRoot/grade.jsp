<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

<title>考 试</title>
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
<script type="text/javascript" src="js/jquery-1.10.1.js"></script>
<script type="text/javascript" src="js/testJs.js"></script>
<style type="text/css">
.test {
	margin-top: 60px;
	margin-left: 230px;
	width: 750px;
	display: block;
}
</style>

</head>

<body>
	<div class="left"><jsp:include page="Left.jsp"></jsp:include></div>
	<div class="head"><jsp:include page="head.jsp"></jsp:include></div>
	<div class="main">
		<div class="title">系统首页&gt;&gt;考试管理&gt;&gt;考试</div>
		<form action="test/TestgetGrade" id="testForm" method="post">
			<div class="main_input">
				<input type="text" value="sasa" name="ss" id="ss" />
				<input type="text" value="225" name="id" id="ss" />
				<table>
					<tr>
						<th align=center colspan=16 style="height: 23px">考 === 试</th>
					</tr>
					<tr bgcolor="#DEE5FA">
						<td colspan="16" align="center" class=txlrow>&nbsp;</td>
					</tr>
					<tr>
						<td width="30%" colspan="7" class="tdbg1"></td>
						<td width="10%" class="tdbg1">请选择试题类型：</td>
						<td width="10%"><select name=""><option>类型一</option>
						</select></td>
						<td width="10%"><input type="button" id="getATest"
							value="开始考试" /></td>
						<td width="10%"><input type="button" id="getErrorTest"
							value="错题重练" /></td>
						<td width="30%" colspan="6" class="tdbg1"></td>
					</tr>
				</table>
			</div>
			<div id="test" class="test">${ss }</div>
		</form>
	</div>
</body>
</html>
