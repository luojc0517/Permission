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

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


<script type="text/javascript" src="js/jquery-1.4.1.min.js"></script>
<style type="text/css">
.block {
	border: 1px solid red;
	position: absolute;
	right: 10em;
}

.textstyle {
	position: absolute;
	right: 10em;
}
</style>
<script type="text/javascript">
	$(document).ready(function() {
		$("#anniu").toggle(function() {
			$('#caozuo').animate({
				right : '0em'
			}, "fast");
		}, function() {
			$('#caozuo').animate({
				right : '10em'
			}, "fast");
		});
		$("#right").click(function() {
			$(".block").animate({
				left : '+50px'
			}, "slow");
		});

		$("#left").click(function() {
			$(".block").animate({
				left : '-50px'
			}, "slow");
		});
	});
</script>

</head>

<body>
	<button id="left">«</button>
	<button id="right">»</button>
	<div class="block">sas</div>
	<div class="textstyle" id="caozuo">
		<a href="#" id="anniu">飒飒飒飒<img src="jiantou2.png" width="20"
			id="tanchu" />
		</a>
	</div>
</body>
</html>
