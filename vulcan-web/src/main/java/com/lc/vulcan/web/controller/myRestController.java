package com.lc.vulcan.web.controller;


import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;
import com.lc.vulcan.beans.myAspect.annotation.SysLog;
import com.lc.vulcan.beans.myException.myEntity.ResultBody;
import com.lc.vulcan.common.constants.VulcanConstants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller 控制层
 * <p>
 * 一些共用的接口
 */
@RestController
@RequestMapping(value = "/api")
public class myRestController {
	/**
	 * ping pong 测试接口
	 *
	 * @return
	 */
	@SysLog(value = "我是ping接口切面日志")
	@RequestMapping(value = "/ping", method = {RequestMethod.POST, RequestMethod.GET}, produces = "application/json;charset=utf-8")
	public ResultBody ping() {
		Console.log("{} ping ... pong ...", DateUtil.now());
		// 故意创造一个异常
		// Integer.valueOf("ssss");
		return ResultBody.success(VulcanConstants.PONG);
	}
}

