package org.springframework.mytest.beans.component;

import org.springframework.stereotype.Component;

/**
 * @Author: xufanyun
 * @Data:2023/7/16
 */

@Component("cacheManager")
public class CacheManager {

	public void set(String key, String value) {
		System.out.println("set key: " + key + ", value: " + value);
	}

}
