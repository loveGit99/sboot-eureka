/*
 * @Project Name: TODO
 * @File Name: StudentServiceImpl
 * @Package Name: com.dream.sboot.service.stu
 * @Date: 2018/3/1 18:48
 * @Creator: shenxiaoping-549
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.dream.sboot.service.stu;

import com.dream.sboot.service.api.Student;
import com.dream.sboot.service.api.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author shenxiaoping-549
 * @date 2018/3/1 18:48
 * @see
 */
@RestController
public class StudentServiceImpl implements StudentService {

	private static final Logger LOG = LoggerFactory.getLogger(StudentService.class);

	@Override
	public Student getStu(Integer id) {
		Student stu = new Student();
		stu.setAge(12);
		stu.setID(id);
		stu.setName("JetLi");
		LOG.info("get stu from stu-service, id:{}",id);
		return stu;
	}


	@Override
	public boolean delStu(Integer id) {
		LOG.info("del "+id+" successfully!");
		return true;
	}

	@Override
	public Student update(Student student) {
		System.err.println("original student=>" + student.toString());
		student.setName("New_" + student.getName());
		student.setAge(88);
		LOG.info("update student successfully!");
		return student;
	}
}
