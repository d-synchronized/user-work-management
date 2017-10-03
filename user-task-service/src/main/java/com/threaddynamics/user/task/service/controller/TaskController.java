package com.threaddynamics.user.task.service.controller;

import static com.threaddynamics.commons.api.constant.ApiConstant.API_BASE_URI;
import static com.threaddynamics.commons.api.constant.ApiConstant.API_VERSION;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.threaddynamics.commons.dto.TaskDto;
import com.threaddynamics.user.task.service.business.TaskService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(API_BASE_URI + API_VERSION + "/task")
@Api(value = "Task Resource Endpoints")
public class TaskController {
	
	@Autowired
	private TaskService taskService;

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, path = "/{taskId}")
	public TaskDto fetchTaskDetails(@PathVariable("taskId") final Long taskId) {
		final TaskDto taskDto = taskService.fetchTaskDetails();
		if(taskDto == null){
			return null;
		}
		return taskDto;
	}

}
