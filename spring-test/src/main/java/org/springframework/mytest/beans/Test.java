package org.springframework.mytest.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mytest.beans.component.CacheManager;
import org.springframework.mytest.beans.config.SpringConfig;

/**
 * @Author: xufanyun
 * @Data:2023/7/16
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		CacheManager cacheManager = (CacheManager) context.getBean("cacheManager");

		cacheManager.set("test", "Hello World!");
	}
}
