package com.diorous.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.diorous.model.NhanVien;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String HomeControllerRequest() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("IOContainer.xml");
//		NhanVien nhanVien=(NhanVien) context.getBean("NhanVien");
//		nhanVien.setHotenNV("Nguyễn Hải Đăng");
	
		return "Home";
	}
}
