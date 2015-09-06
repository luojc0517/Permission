<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>管理页面</title>

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

<body leftMargin=0 topMargin=0>
	<div class="left"><jsp:include page="Left.jsp"></jsp:include></div>
	<div class="head"><jsp:include page="head.jsp"></jsp:include></div>
	<div class="main">
		<TABLE cellSpacing=1 cellPadding=3 width="95%" align=center border=0>
			<TBODY>
				<TR>
					<TD vAlign=top width="100%">
						<P>
							<BR>
						</P>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE class=tableBorder cellSpacing=1 cellPadding=2 width="95%"
			align=center border=0>
			<TBODY>
				<TR>
					<TH width="100%" height=25 class=tableHeaderText>&nbsp;</TH>
			</TBODY>
		</TABLE>
		<P></P>
		<TABLE class=tableBorder cellSpacing=1 cellPadding=2 width="95%"
			align=center border=0>
			<TBODY>
				<TR>
					<TH width="100%" height=25 class=tableHeaderText>&nbsp;</TH>
				</TR>
			</TBODY>
		</TABLE>
		<SCRIPT language=javascript>
			function jumpto(url) {
				if (url != '') {
					window.open(url);
				}
			}
		</SCRIPT>
	</div>
</body>
</html>
