package cn.e3mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}

	@RequestMapping("/{page1}")
	public String showPages(@PathVariable String page1) {
		return page1;
	}
}
