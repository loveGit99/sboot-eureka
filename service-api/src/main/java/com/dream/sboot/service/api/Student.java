/*
 * @Project Name: TODO
 * @File Name: Student
 * @Package Name: com.dream.sboot.service.api
 * @Date: 2018/3/1 14:26
 * @Creator: shenxiaoping-549
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.dream.sboot.service.api;

import java.io.Serializable;

/**
 * todo
 *
 * @author shenxiaoping-549
 * @date 2018/3/1 14:26
 * @see
 */
public class Student implements Serializable{

	private Integer ID;
	private String name;
	private Integer age;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" + "ID=" + ID + ", name='" + name + '\'' + ", age=" + age + '}';
	}
}
