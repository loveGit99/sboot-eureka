/*
 * @Project Name: TODO
 * @File Name: StudentService
 * @Package Name: com.dream.sboot.service.api
 * @Date: 2018/3/1 14:26
 * @Creator: shenxiaoping-549
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.dream.sboot.service.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * notes:
 *    API
 *       1. @FeignClient("服务名称")
 *       2. the parameters of each method must be a prefix annotation @RequestParam or others
 *       3. must special the value of annotation , if not , throw exception on starting
 *
 * @author shenxiaoping-549
 * @date 2018/3/1 14:26
 * @see
 */
@FeignClient("student-service")
public interface StudentService {

	@RequestMapping("/get")
	public Student getStu(@RequestParam("id") Integer id);

	@RequestMapping("/del")
	public boolean delStu(@RequestParam("id") Integer id);

	@RequestMapping("/update")
	public Student update(@RequestParam("student") Student student);

}
