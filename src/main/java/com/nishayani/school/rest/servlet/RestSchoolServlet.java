/**
 * Project				:	prjClientRestSchool
 * Organization			:	Indian School Al Maabela | Muscat | Oman
 * 
 * Author				:	Bhabesh
 *
 * FrameWork			:	Spring 3.1.0 (Annotation) Portlet
 * 
 * File Name			:	RestSchoolServlet.java
 * Package Name			:	com.nishayani.school.rest.servlet
 * Date of creation		:	28-Dec-2014  5:41:35 am
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
package com.nishayani.school.rest.servlet;

import java.io.IOException;
import java.lang.annotation.Target;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import com.nishayani.school.rest.utility.UtilProperty;

/**
 * @author bhabesh
 *
 */
@Component("restServletSchool")
public class RestSchoolServlet implements HttpRequestHandler
{

	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String 	paramOptype	=	request.getParameter("opType");
		String	paramVal	=	request.getParameter("val");
		String	webUrl		=	null;
		
		
		if(paramOptype.equals("2"))
		{
			webUrl = UtilProperty.getMessage("prop.school.url.rest.board.class", null);
		}
		if(paramOptype.equals("1"))
		{
			webUrl = UtilProperty.getMessage("prop.school.url.rest.board.grno", null);
		}

		
		
		Client		client		=	ClientBuilder.newClient();
		
		WebTarget	webTarget	=	client.target(webUrl).path(paramVal);
		response.getWriter().write(webTarget.request().get(String.class));;
		
	}

	
}
