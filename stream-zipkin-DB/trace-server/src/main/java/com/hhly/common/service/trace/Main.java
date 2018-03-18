/*
 * @Project Name: TODO
 * @File Name: Main
 * @Package Name: com.hhly.common.service.trace
 * @Date: 2018/3/9 14:27
 * @Creator: shenxiaoping-549
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.common.service.trace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

/**
 * trace server by zipkin which the 3rd middleware
 *
 * @author shenxiaoping-549
 * @date 2018/3/9 14:27
 * @see
 */
@SpringBootApplication
@EnableZipkinStreamServer
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class,args);
	}

}
