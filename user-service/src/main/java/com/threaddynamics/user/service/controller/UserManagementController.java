package com.threaddynamics.user.service.controller;

import static com.threaddynamics.commons.api.constant.ApiConstant.API_VERSION;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.threaddynamics.commons.api.constant.ApiConstant;
import com.threaddynamics.commons.dto.UserDto;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(ApiConstant.API_BASE_URI + API_VERSION + "/userService")
@Api(value = "User Resource Endpoints")
public class UserManagementController {
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, path = "/getUserByUserId/{userId}")
	public UserDto fetchUserDetails(@PathVariable("userId") final Long userId) {
		UserDto user=new UserDto();
		user.setDepartment("FS");
		user.setFirstName("Rajul");
		user.setLastName("Shukla");
		user.setUserId(600800L);
		user.setEmailAddress("rajul.shukla@incedoinc.com");
		return user;
	}
}
