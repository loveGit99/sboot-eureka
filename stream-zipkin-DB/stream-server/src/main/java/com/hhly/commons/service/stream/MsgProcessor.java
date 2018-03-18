/*
 * @Project Name: TODO
 * @File Name: CStream
 * @Package Name: com.hhly.commons.service.stream
 * @Date: 2018/3/14 18:49
 * @Creator: shenxiaoping-549
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.commons.service.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * todo
 *
 * @author shenxiaoping-549
 * @date 2018/3/14 18:49
 * @see
 */
@EnableBinding(Sink.class)
public class MsgProcessor {

	@StreamListener(Sink.INPUT)
	public void handler(Object payload) throws Exception{
		Object res = payload;
		if(payload instanceof byte[]){
			res = new String(((byte[])payload),"UTF-8");
		}
		System.err.println(res.toString());
	}

}
