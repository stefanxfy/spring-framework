package org.springframework.mytest.beans.service;

import jakarta.annotation.Resource;
import org.springframework.mytest.beans.component.CacheManager;
import org.springframework.stereotype.Service;

/**
 * @Author: xufanyun
 * @Data:2023/7/16
 */
@Service
public class UserServiceImpl implements UserService{

	@Resource
	private CacheManager cacheManager;

	@Override
	public void queryUserInfo() {
		System.out.println("query user info");
	}
}
