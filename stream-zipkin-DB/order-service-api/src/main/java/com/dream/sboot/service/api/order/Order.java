/*
 * @Project Name: TODO
 * @File Name: Order
 * @Package Name: com.dream.sboot.service.api.order
 * @Date: 2018/3/3 11:47
 * @Creator: shenxiaoping-549
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.dream.sboot.service.api.order;

/**
 * todo
 * @author shenxiaoping-549
 * @date 2018/3/3 11:47
 * @see
 */
public class Order {

	private Long ID;
	private String orderId;

	public Long getID() {
		return ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
}
