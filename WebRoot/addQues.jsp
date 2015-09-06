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

<title>添加试题</title>
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
		<div class="title">系统首页&gt;&gt;考试管理&gt;&gt;添加试题</div>
		<form name="addUserForm" method="post" action="ques/Quesadd">
			<div class="main_input" id="first">
				<table>
					<tr>
						<th align=center colspan=16 style="height: 23px">添加试题</th>
					</tr>
					<tr bgcolor="#DEE5FA">
						<td colspan="16" align="center" class=txlrow>&nbsp;</td>
					</tr>
					<tr>
						<td width="21%" class="tdbg1">试  &nbsp; &nbsp; &nbsp; 题：</td>
						<td width="31%" colspan="3"><textarea name="ques.quesContent" rows="4" cols="150"
							></textarea><span> *</span>
						</td>
					</tr>
					<tr>
						<td width="21%" class="tdbg1">试题答案：</td>
						<td width="31%"><input type="text" name="ques.quesAnstwer"
							value="" class="text"><span> *</span>
						</td>
						<td width="21%" class="tdbg1">试题类型：</td>
						<td width="31%"><select name="ques.quesType"><option value="1">类型一</option></select><span> *</span>
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
			<div class="main_input" id="second">
				<!-- 批量添加 -->
			</div>
		</form>
		
	</div>
</body>
</html>
