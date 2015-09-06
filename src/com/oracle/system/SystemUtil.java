package com.oracle.system;

import com.oracle.user.po.User;

public class SystemUtil {

	private static User thisUser;

	public static User getThisUser() {
		return thisUser;
	}

	public static void setThisUser(User thisUser) {
		SystemUtil.thisUser = thisUser;
	}
	
	
}
