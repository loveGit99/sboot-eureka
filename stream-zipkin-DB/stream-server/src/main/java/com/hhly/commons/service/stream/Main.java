/*
 * @Project Name: TODO
 * @File Name: Main
 * @Package Name: com.hhly.commons.service.stream
 * @Date: 2018/3/14 18:48
 * @Creator: shenxiaoping-549
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.commons.service.stream;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * todo
 *
 * @author shenxiaoping-549
 * @date 2018/3/14 18:48
 * @see
 */
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Main.class).run(args);
	}

}
