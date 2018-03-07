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
import org.springframework.stereotype.Component;

/**
 * todo
 *
 * @author shenxiaoping-549
 * @date 2018/3/5 17:45
 * @see
 */
@Component
@ConfigurationProperties(prefix = "server")
public class GlobalConfig {

	private Integer port;

	private int basePort = 4000;

	private int maxPort = 6000;

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public int getBasePort() {
		return basePort;
	}

	public void setBasePort(int basePort) {
		this.basePort = basePort;
	}

	public int getMaxPort() {
		return maxPort;
	}

	public void setMaxPort(int maxPort) {
		this.maxPort = maxPort;
	}
}
