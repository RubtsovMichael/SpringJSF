package com.rubtsov.user.bo.impl;

import javax.inject.Named;

import com.rubtsov.user.bo.UserBo;

@Named
public class UserBoImpl implements UserBo {

	public String getMessage() {
		 
		return "JSF 2 + Spring Integration";
 
	}
}
