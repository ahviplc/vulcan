package com.lc.vulcan.web;

import cn.hutool.core.date.DateUtil;
import cn.hutool.log.StaticLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class VulcanWebApplication {

	public static void main(String[] args) {
		// 隐掉初始写法
		// SpringApplication.run(VulcanWebApplication.class, args);

		// 获取context
		ConfigurableApplicationContext context = SpringApplication.run(VulcanWebApplication.class, args);
		Environment environment = context.getBean(Environment.class);
		// 获取端口和访问路径
		// System.out.println("访问链接：http://localhost:" + environment.getProperty("server.port") + environment.getProperty("server.servlet.context-path"));
		String thisPort = environment.getProperty("server.port");
		StaticLog.info("{},在端口{},服务程序正在运行... 测试链接 => {} | {}", DateUtil.now(), thisPort, "http://localhost:" + thisPort + "/api" + "/ping", "http://127.0.0.1:" + thisPort + "/api" + "/ping");
	}
}
