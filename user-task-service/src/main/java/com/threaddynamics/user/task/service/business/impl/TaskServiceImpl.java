package com.threaddynamics.user.task.service.business.impl;

import org.springframework.stereotype.Service;

import com.threaddynamics.commons.dto.TaskDto;
import com.threaddynamics.user.task.service.business.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	public TaskDto fetchTaskDetails() {
		System.out.println("*********Task Service Initiated*****");
		return null;
	}

}
