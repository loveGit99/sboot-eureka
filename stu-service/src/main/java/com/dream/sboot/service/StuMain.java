/*
 * @Project Name: TODO
 * @File Name: StuMain
 * @Package Name: com.dream.sboot.service
 * @Date: 2018/3/1 18:47
 * @Creator: shenxiaoping-549
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.dream.sboot.service;

import com.dream.top.BaseMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import java.net.ServerSocket;

/**
 *
 *
 * @author shenxiaoping-549
 * @date 2018/3/1 18:47
 * @see
 */
//@EnableFeignClients
//@EnableEurekaClient
@SpringBootApplication
public class StuMain extends BaseMain {




	public static void main(String[] args) {
//		new SpringApplicationBuilder(StuMain.class).web(true).run(args);
		startUp(args);

	}

}
