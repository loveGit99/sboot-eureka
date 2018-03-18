/*
 * @Project Name: TODO
 * @File Name: GlobalConfig
 * @Package Name: com.dream.sboot.service
 * @Date: 2018/3/5 17:45
 * @Creator: shenxiaoping-549
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.dream.sboot.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * todo
 *
 * @author shenxiaoping-549
 * @date 2018/3/5 17:45
 * @see
 */
@ConfigurationProperties(prefix = "htxk.server.port")
public class GlobalConfig {

	private int base = 4000;

	private int maxPort = 6000;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getMaxPort() {
		return maxPort;
	}

	public void setMaxPort(int maxPort) {
		this.maxPort = maxPort;
	}
}
