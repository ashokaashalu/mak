package com.vekomy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/ajax")
public class AjaxController {

    @RequestMapping(value="/print",method=RequestMethod.GET)    
	public @ResponseBody String getrequest()
	{
		System.out.println("from ajax controller");
		return "srikanth";
	}
}
