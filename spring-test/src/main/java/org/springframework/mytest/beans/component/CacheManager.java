package org.springframework.mytest.beans.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mytest.beans.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @Author: xufanyun
 * @Data:2023/7/16
 */

@Component("cacheManager")
public class CacheManager {

	@Autowired
	private UserService userService;

	public void set(String key, String value) {
		System.out.println("set key: " + key + ", value: " + value);
	}

}
