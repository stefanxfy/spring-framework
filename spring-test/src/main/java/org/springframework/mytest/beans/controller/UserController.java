package org.springframework.mytest.beans.controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mytest.beans.component.CacheManager;
import org.springframework.mytest.beans.service.UserService;
import org.springframework.stereotype.Controller;

/**
 * @Author: xufanyun
 * @Data:2023/7/16
 */

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@Resource
	private CacheManager cacheManager;

}
