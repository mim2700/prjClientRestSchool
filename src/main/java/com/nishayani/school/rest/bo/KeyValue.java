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
 * File Name			:	KeyValue.java
 * Package Name			:	com.nishayani.school.rest.bo
 * Date of creation		:	02-Jan-2015  10:13:58 pm
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
package com.nishayani.school.rest.bo;

/**
 * @author bhabesh
 *
 */
public class KeyValue
{
	private	String	name;
	private	String	value;
	/**
	 * Getter Method	: getName
	 * @return the name
	 * 
	 * Date				: 02-Jan-2015
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Setter method : setName
	 * @param name the name to set
	 * 
	 * Date          : 02-Jan-2015 11:03:01 pm
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * Getter Method	: getValue
	 * @return the value
	 * 
	 * Date				: 02-Jan-2015
	 */
	public String getValue()
	{
		return value;
	}
	/**
	 * Setter method : setValue
	 * @param value the value to set
	 * 
	 * Date          : 02-Jan-2015 11:03:01 pm
	 */
	public void setValue(String value)
	{
		this.value = value;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "KeyValue [name=" + name + ", value=" + value + "]";
	}
	
	
}
