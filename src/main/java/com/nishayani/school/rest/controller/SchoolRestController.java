/**
 * Project				:	prjClientRestSchool
 * Organization			:	Indian School Al Maabela | Muscat | Oman
 * 
 * Author				:	Bhabesh
 *
 * FrameWork			:	Spring 3.1.0 (Annotation) Portlet
 * 
 * File Name			:	SchoolRestController.java
 * Package Name			:	com.nishayani.school.rest.controller
 * Date of creation		:	11-Dec-2014  8:22:23 pm
 * Date of modification :	
 * 
 * Summary				:	
 *
 *
 * Copyright 2014 the original author or authors and Organization.
 *
 * Licensed under the Nishayani policy
 * you may not use this file except in compliance with the License.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * 
 */
package com.nishayani.school.rest.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nishayani.school.rest.dao.service.SchoolServiceDao;
import com.nishayani.school.rest.model.SchoolRestModel;

/**
 * @author bhabesh
 *
 */
@Controller
public class SchoolRestController
{
	@Autowired
	SchoolServiceDao	schoolServiceDao;
	
	@RequestMapping("/")
	public String welcome(Model model, Locale locale)
	{
		model.addAttribute("msg", "This is test");
		
		return "welcome";
	}

	@RequestMapping(value="/boardConnect",method=RequestMethod.GET	)
	public String boardConnect(Model model)
	{
		
		model.addAttribute("schoolRestModel", new SchoolRestModel());
		model.addAttribute("classNames",schoolServiceDao.getClassNames());
		return "boardConnect";
	}
}
