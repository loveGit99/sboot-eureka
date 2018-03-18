/*
 * @Project Name: TODO
 * @File Name: BaseMain
 * @Package Name: com.dream.sboot.service
 * @Date: 2018/3/7 8:41
 * @Creator: shenxiaoping-549
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.dream.top;

import com.dream.sboot.service.GlobalConfig;
import com.dream.sboot.service.StuMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Component;

import java.net.ServerSocket;

/**
 * todo
 *
 * @author shenxiaoping-549
 * @date 2018/3/7 8:41
 * @see
 */
@EnableFeignClients
@EnableDiscoveryClient
@Component
public class BaseMain implements EmbeddedServletContainerCustomizer {

	@Autowired
	private EurekaInstanceConfigBean instanceConfigBean;

	@Autowired
	private GlobalConfig  cfg;

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		Integer configPort = cfg.getPort();
		if(configPort == null || configPort == 0){
			Integer customPort = getRandPort(cfg.getBasePort(), cfg.getMaxPort());
			container.setPort(customPort);
			try {
				String[] instanceId = instanceConfigBean.getInstanceId().split(":");
				instanceConfigBean.setInstanceId(instanceId[0]+":"+instanceId[1]+":"+customPort);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static Integer getRandPort(int basePort, int maxPort) {
		for (int i = basePort; i < maxPort; i++) {
			ServerSocket serverSocket = null;
			try {
				serverSocket = new ServerSocket(i);
				return i;
			} catch (Exception e) {
			} finally {
				if (serverSocket != null) {
					try {
						serverSocket.close();
					} catch (Exception e) {
						//logger.error("fail to close server socket[{}]", serverSocket.getLocalPort(), e);
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}

	public static void startUp(String[] args){
		new SpringApplicationBuilder(StuMain.class).web(true).run(args);
	}

}
