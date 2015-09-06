function changeTab(msg1, msg2, msg3) {
	obj1 = document.getElementById(msg1);
	obj2 = document.getElementById(msg2);
	obj3 = document.getElementById(msg3);
	
	
	obj1.style.display="block";
	obj2.style.display="none";
	obj3.style.display="none";
}

function checkform() {alert(ok);
	var fm = document.getElementById("form1");
	var humanCode = fm.humanCode.value;
	var humanName = fm.humanName.value;
	var humanBirthday = fm.humanBirthday.value;
	var birthday = /^[\d]{4}-[\d]{2}-[\d]{2}$/g;	
	var humanSex = fm.humanSex;
	var sexFlag = true;
	for(var i = 0; i < humanSex.length; i++ ) {
		if(humanSex[i].checked)
			sexFlag = false;
	}
	
	var deptId = fm.deptId;
	var deptFlag = true;
	if(!deptId.options[0].selected)
		deptFlag = false;
	
	
	var humanMajorId = fm.humanMajorId;
	var majorFlag = true;
	if(!humanMajorId.options[0].selected)
		majorFlag = false;
	
	if(null == humanCode || humanCode.length < 1) {
		alert("请输入员工编号!");
		return;
	}else if(isNaN(humanCode)){
		alert("请输入合法的员工编号");
		return;
	}else if(null == humanName || humanName.length < 1){
		alert("请输入员工姓名!");
		return;
	}else if(null == humanBirthday || humanBirthday.length < 1){
		alert("请输入员工出生日期");
		return;
	}else if(!birthday.test(humanBirthday)){
		alert("生日日期的格式不正确，如('1988-06-06')");
		return;
	}else if(sexFlag){
		alert("您必须选择性别");
		return;
	}else if(deptFlag){
		alert("请选择部门");
		return;
	}else if(majorFlag){
		alert("请选择职位");
		return;
	}else {
		fm.submit();
	}
}

function resetform() {
	var fm = document.getElementById("form1");
	fm.reset();
}

function showTable(id) {
	var obj = document.getElementById(id);
	if(obj.style.display == "none"){
		obj.style.display = "block";
	}
	else
		obj.style.display = "none";
}
