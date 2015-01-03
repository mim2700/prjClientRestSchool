/**
 * Project				:	prjClientRestSchool
 * Organization			:	Sultan Qaboos University | Muscat | Oman
 * Centre				:	Centre for Information System
 * Department			:	Planning & Development
 * 
 * Author				:	Bhabesh
 *
 * FrameWork			:	Spring 3.1.0 (Annotation) Portlet
 * 
 * File Name			:	SchoolServiceDao.java
 * Package Name			:	com.nishayani.school.rest.dao.service
 * Date of creation		:	02-Jan-2015  10:20:04 pm
 * Date of modification :	
 * 
 * Summary				:	
 *
 *
 * Copyright 2015 the original author or authors and Organization.
 *
 * Licensed under the SQU, CIS policy
 * you may not use this file except in compliance with the License.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * 
 */
package com.nishayani.school.rest.dao.service;

import java.util.List;

import com.nishayani.school.rest.bo.KeyValue;

/**
 * @author bhabesh
 *
 */
public interface SchoolServiceDao
{
	/**
	 * 
	 * method name  : getClassNames
	 * @return
	 * SchoolServiceDao
	 * return type  : List<KeyValue>
	 * 
	 * purpose		:
	 *
	 * Date    		:	02-Jan-2015 10:22:05 pm
	 */
	public List<KeyValue> getClassNames();
}
