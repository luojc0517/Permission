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

<title>网站后台登录</title>
<STYLE type="text/css">
<!--
a:link {
	text-decoration: none;
	font-family: AdobeSm;
	color: #000000
}

a:visited {
	text-decoration: none;
	color: #000000
}

A:hover {
	COLOR: green;
	FONT-FAMILY: "宋体,MingLiU";
	TEXT-DECORATION: underline
}

body {
	font-size: 9pt;
	font-family: 宋体, MingLiU, Arial;
	color: #000000
}

TD {
	FONT-SIZE: 9pt;
	FONT-FAMILY: "宋体,MingLiU, Arial";
	color: #000000;
	table-layout: fixed;
	word-break: break-all
}

p {
	FONT-SIZE: 9pt;
	FONT-FAMILY: "宋体,MingLiU, Arial";
	color: #000000
}

input {
	FONT-SIZE: 9pt;
	FONT-FAMILY: "宋体,MingLiU, Arial";
	color: #000000
}

body {
	margin-top: 0;
	margin-bottom: 0;
	margin-left: 0;
	margin-right: 0;
	color: #000000
}

select {
	FONT-SIZE: 9PT;
}

option {
	FONT-SIZE: 9pt;
}

textarea {
	FONT-SIZE: 9pt;
}
-->
</STYLE>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body topmargin="0" leftmargin="0" rightmargin="0" bottommargin="0" marginwidth="0" marginheight="0">

<script Language="JavaScript" Type="text/javascript"><!--
function FrontPage_Form1_Validator(theForm)
{

  if (theForm.user.value == "")
  {
    alert("请在 用户名 域中输入值。");
    theForm.user.focus();
    return (false);
  }

  if (theForm.user.value.length < 2)
  {
    alert("在 用户名 域中，请至少输入 2 个字符。");
    theForm.user.focus();
    return (false);
  }

  if (theForm.user.value.length > 20)
  {
    alert("在 用户名 域中，请最多输入 20 个字符。");
    theForm.user.focus();
    return (false);
  }

  if (theForm.pass.value == "")
  {
    alert("请在 密码 域中输入值。");
    theForm.pass.focus();
    return (false);
  }

  if (theForm.pass.value.length < 5)
  {
    alert("在 密码 域中，请至少输入 5 个字符。");
    theForm.pass.focus();
    return (false);
  }

  if (theForm.pass.value.length > 20)
  {
    alert("在 密码 域中，请最多输入 20 个字符。");
    theForm.pass.focus();
    return (false);
  }

  if (theForm.XuasYzm.value == "")
  {
    alert("请在 验证码 域中输入值。");
    theForm.XuasYzm.focus();
    return (false);
  }

  if (theForm.XuasYzm.value.length < 5)
  {
    alert("在 验证码 域中，请至少输入 5 个字符。");
    theForm.XuasYzm.focus();
    return (false);
  }

  if (theForm.XuasYzm.value.length > 5)
  {
    alert("在 验证码 域中，请最多输入 5 个字符。");
    theForm.XuasYzm.focus();
    return (false);
  }

  var checkOK = "0123456789-";
  var checkStr = theForm.XuasYzm.value;
  var allValid = true;
  var validGroups = true;
  var decPoints = 0;
  var allNum = "";
  for (i = 0;  i < checkStr.length;  i++)
  {
    ch = checkStr.charAt(i);
    for (j = 0;  j < checkOK.length;  j++)
      if (ch == checkOK.charAt(j))
        break;
    if (j == checkOK.length)
    {
      allValid = false;
      break;
    }
    allNum += ch;
  }
  if (!allValid)
  {
    alert("在 验证码 域中，只能输入 数字 字符。");
    theForm.XuasYzm.focus();
    return (false);
  }
  return (true);
}
//--></script>
	<form method="POST" action="Userlogin" target=_top
		onsubmit="return FrontPage_Form1_Validator(this)" name="FrontPage_Form1">
		<div align="center">
			<table border="0" cellpadding="0" cellspacing="0" width="100%"
				height="100%" id="table9">
				<tr>
					<td
						style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
						<div align="center">
							<table border="0" cellpadding="0" cellspacing="0" width="563"
								height="364" id="table10" background="images/admin_login.jpg">
								<tr>
									<td valign="top"
										style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
										<div align="center">
											<div align="center">
												<table border="0" cellpadding="0" cellspacing="0"
													width="100%" id="table11">
													<tr>
														<td width="207" height="130"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
														<td height="130"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
														<td width="37" height="130"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
													</tr>
													<tr>
														<td width="207" height="111"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
														<td height="111"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">

															<table border="0" cellpadding="5" cellspacing="0"
																width="319" id="table12">
																<tr>
																	<td width="114" align="center"
																		style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
																		用户名</td>
																	<td width="205"
																		style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
																		&nbsp;<input type="text" name="user.userName"
																		size="24" maxlength="20"
																		style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000">
																	</td>
																</tr>
																<tr>
																	<td width="114" align="center"
																		style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
																		密 码</td>
																	<td width="205"
																		style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
																		&nbsp;<input type="password" name="user.password"
																		size="24" maxlength="20"
																		style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000">
																	</td>
																</tr>
																<tr>
																	<td width="114" align="center"
																		style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
																		验证码</td>
																	<td width="205"
																		style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
																		&nbsp;<input name="XuasYzm" size="9" maxlength="5"
																		style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000">
																		31495</td>
																</tr>
															</table></td>
														<td width="37" height="111"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
													</tr>
													<tr>
														<td width="207"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
														<td
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
														<td width="37"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
													</tr>
													<tr>
														<td width="207"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
														<td
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
															<p align="center">
																<input type="image" src=images/login001.jpg value="提交"
																	name="B1">&nbsp; <a href="#"
																	onClick="window.opener=null;window.close()"
																	style="text-decoration: none; font-family: AdobeSm; color: #000000">
																	<img border="0" src="images/login002.jpg" width="72"
																	height="21">
																</a>
														</td>
														<td width="37"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
													</tr>
													<tr>
														<td width="207" height="56"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
														<td height="56"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
														<td width="37" height="56"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
													</tr>
													<tr>
														<td width="207"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">&nbsp;
															<font color="#FFBEC6"></font>
														</td>
														<td
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all"></td>
														<td width="37"
															style="font-size: 9pt; font-family: 宋体,MingLiU, Arial; color: #000000; table-layout: fixed; word-break: break-all">
														</td>
													</tr>
												</table>
											</div>
										</div></td>
								</tr>
							</table>
						</div></td>
				</tr>
			</table>
		</div>
	</form>

</body>
</html>
