var html = "";
var testId;
var ss;

function checkTime(i) {
	return i - 1;
}
function timer() {
	$(".daojishi").css("display","block");
	ss = checkTime(ss);
	document.getElementById("timer").innerHTML = ss + "秒";
	if(ss==0) {
		alert("答题时间到，系统已自动提交！");
		$("#getATest").trigger("click");
		return;
	} if($("#getATest").val() == "提交试卷") {
		setTimeout("timer()", 1000);
	} 
}

$(document).ready(function() {
	$("#getErrorTest").toggle(function() {

		getErrclick();
		$('#getErrorTest').animate({
			right : '656px'
		}, 2000);
		$("#getATest").css("display","none");
		$("#getErrorTest").val("显示答案");
		$('#type').animate({
			right : '396px'
		}, 2000);
	}, function() {
		$('#getErrorTest').animate({
			right : '396px'
		}, "fast");
		$("#getATest").css("display","block");
		$("#getErrorTest").val("错题重练");
		$('#type').animate({
			right : '596px'
		}, "fast");
	});
		$("#getATest").click(function() {
			html = "<div style='margin:60px;' id='aTest'>";
			if ($("#getATest").val() == "开始考试") {
				ss=60;
				setTimeout("timer()", 3000);
				$.getJSON("test/TestgetATest",function(json) {
										testId = json[0].testId;
										$("#test").slideUp(2000);
										for ( var i = 0; i < json.length; i++) {
											html = html+ "<h4> 试题："+ (i + 1)
																	+ "</h4> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
																	+ json[i].quesContent
																	+ "<br /><br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;你的答案：<input type='checkbox' onclick='changeOther(this)'  name='anstwers' value='是' id='1012"
																	+ i
																	+ 100
																	+ "' >正 确 <input type='checkbox' onclick='changeOther(this)'	name='anstwers' value='否' id='1012"
																	+ i
																	+ 201
																	+ "' >错 误";
										}
										html = html+ "</div><input type='hidden' value='"
													+ testId
													+ "' name='id' />";
										setTimeout("show()",2000);
										$("#getATest").val("提交试卷");
									});
			} else {
				// 表单提交
				// $("form:first").submit();

				// window.location.href="test/TestgetGrade?id="+testId;

				// ajax提交
				var chk_value = [];
				$(':checkbox').each(function(i) {
						if (this.checked) {
							chk_value.push($(this).val());
						}
						// alert(chk_value);
					});
					$.post("test/TestgetGrade?id="+ testId + "&anstwers="+ chk_value,function(text) {

														$("#test").slideUp(2000);
														html = html + text;
														html = html + "</div>";
														setTimeout("show(html)",2000);
														$("#getATest").val("开始考试");
													});
										}
										;
									});

				});

function getErrclick() {

	html = "<div style='margin:60px;' id='aTest'>";
	$.getJSON("test/TestgetErrorQues?id="+ testId,function(json) {
		alert("this");
		testId = json[0].testId;
		$("#test").slideUp(2000);
		for ( var i = 0; i < json.length; i++) {
			html = html+ "<h4> 试题："+ (i + 1)
									+ "</h4> &nbsp;&n	bsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
									+ json[i].quesContent
									+ "<br /><br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;你的答案：<input type='checkbox' onclick='changeOther(this)'  name='anstwers' value='是' id='1012"
									+ i
									+ 100
									+ "' >正 确 <input type='checkbox' onclick='changeOther(this)'	name='anstwers' value='否' id='1012"
									+ i
									+ 201
									+ "' >错 误";
		}
		html = html+ "</div><input type='hidden' value='"
					+ testId
					+ "' name='id' />";
		setTimeout("show()", 2000);
	});
}

function show() {
	// alert(html);
	$("#test").css("border", "1px solid #FFFF00");
	$("#test").html(html);
	$("#test").slideDown(3000);
}

function changeOther(content) {
	if (content.id % 2 == 1) {
		$("#" + (content.id - 101)).attr("checked", false);
	} else {
		$("#" + (content.id - (-101))).attr("checked", false);
	}
};

