package cn.jiyun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

import cn.jiyun.pojo.Emp;
import cn.jiyun.service.EmpService;

@RestController
@RequestMapping("emp")
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@RequestMapping("findPage")
	@ResponseBody
	public PageInfo<Emp> findPage(){
		
	}
}
