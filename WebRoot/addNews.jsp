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

<title>添加新闻</title>
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
		<div class="title">新闻中心&gt;&gt;新闻管理&gt;&gt;增加新闻</div>
		<form name="addUserForm" method="post" action="news/Newsadd">
			<div class="main_input">
				<table>
					<tr>
						<th align=center colspan=16 style="height: 23px">添加新闻</th>
					</tr>
					<tr bgcolor="#DEE5FA">
						<td colspan="16" align="center" class=txlrow>&nbsp;</td>
					</tr>
					<tr>
						<td width="11%" class="tdbg1">新闻标题：</td>
						<td width="31%"><input type="text" name="news.newsTitle"
							value="" class="text"><span> *</span></td>
						<td width="11%" class="tdbg1">所属栏目：</td>
						<td width="31%"><select name="news.category">
								<s:iterator value="categs" var="categ">
									<option value="${categ.categ_Id }">${categ.categName }</option>
								</s:iterator>
						</select><span> *</span></td>
					</tr>
					<tr>
						<td width="11%" class="tdbg1">新闻内容：</td>
						<td colspan="3"><textarea rows="10" cols="150"
								name="news.newsContent"></textarea><span> *</span></td>

					</tr>

					<tr>
						<td colspan="4" align="center"><br /> <input type="submit"
							value="保存" class="btn"> &nbsp;&nbsp;&nbsp;&nbsp; <input
							class="btn" type="button" value="取消" onClick="history.back(1)" /><br />
							<br /></td>
					</tr>

				</table>
			</div>
		</form>
	</div>
</body>
</html>
