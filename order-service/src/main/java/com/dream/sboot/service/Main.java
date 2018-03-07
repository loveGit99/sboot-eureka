/*
 * @Project Name: TODO
 * @File Name: Main
 * @Package Name: com.dream.sboot.service
 * @Date: 2018/3/3 11:58
 * @Creator: shenxiaoping-549
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.dream.sboot.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * todo
 *
 * @author shenxiaoping-549
 * @date 2018/3/3 11:58
 * @see
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Main {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Main.class).web(true).run(args);
	}

}
