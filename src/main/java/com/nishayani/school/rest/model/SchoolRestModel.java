/**
 * Project				:	prjClientRestSchool
 * Organization			:	Indian School Al Maabela | Muscat | Oman
 * 
 * Author				:	Bhabesh
 *
 * FrameWork			:	Spring 3.1.0 (Annotation) Portlet
 * 
 * File Name			:	SchoolRestModel.java
 * Package Name			:	com.nishayani.school.rest.model
 * Date of creation		:	14-Dec-2014  10:54:09 pm
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
package com.nishayani.school.rest.model;

/**
 * @author bhabesh
 *
 */
public class SchoolRestModel
{
	private String	opType;   // Operation type
	private String	grNumber;
	private	String	schoolNumber;
	private String	schoolName;
	private	String	classId;
	private	String	className;
	
	
	/**
	 * Getter Method	: getOpType
	 * @return the opType
	 * 
	 * Date				: 16-Dec-2014
	 */
	public String getOpType()
	{
		return opType;
	}
	/**
	 * Setter method : setOpType
	 * @param opType the opType to set
	 * 
	 * Date          : 16-Dec-2014 6:41:26 pm
	 */
	public void setOpType(String opType)
	{
		this.opType = opType;
	}
	/**
	 * Getter Method	: getGrNumber
	 * @return the grNumber
	 * 
	 * Date				: 14-Dec-2014
	 */
	public String getGrNumber()
	{
		return grNumber;
	}
	/**
	 * Setter method : setGrNumber
	 * @param grNumber the grNumber to set
	 * 
	 * Date          : 14-Dec-2014 11:12:55 pm
	 */
	public void setGrNumber(String grNumber)
	{
		this.grNumber = grNumber;
	}
	/**
	 * Getter Method	: getSchoolNumber
	 * @return the schoolNumber
	 * 
	 * Date				: 14-Dec-2014
	 */
	public String getSchoolNumber()
	{
		return schoolNumber;
	}
	/**
	 * Setter method : setSchoolNumber
	 * @param schoolNumber the schoolNumber to set
	 * 
	 * Date          : 14-Dec-2014 11:12:55 pm
	 */
	public void setSchoolNumber(String schoolNumber)
	{
		this.schoolNumber = schoolNumber;
	}
	/**
	 * Getter Method	: getSchoolName
	 * @return the schoolName
	 * 
	 * Date				: 14-Dec-2014
	 */
	public String getSchoolName()
	{
		return schoolName;
	}
	/**
	 * Setter method : setSchoolName
	 * @param schoolName the schoolName to set
	 * 
	 * Date          : 14-Dec-2014 11:12:55 pm
	 */
	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;
	}
	/**
	 * Getter Method	: getClassId
	 * @return the classId
	 * 
	 * Date				: 14-Dec-2014
	 */
	public String getClassId()
	{
		return classId;
	}
	/**
	 * Setter method : setClassId
	 * @param classId the classId to set
	 * 
	 * Date          : 14-Dec-2014 11:12:55 pm
	 */
	public void setClassId(String classId)
	{
		this.classId = classId;
	}
	/**
	 * Getter Method	: getClassName
	 * @return the className
	 * 
	 * Date				: 14-Dec-2014
	 */
	public String getClassName()
	{
		return className;
	}
	/**
	 * Setter method : setClassName
	 * @param className the className to set
	 * 
	 * Date          : 14-Dec-2014 11:12:55 pm
	 */
	public void setClassName(String className)
	{
		this.className = className;
	}
	/**
	 * method name  : toString
	 * @return
	 * com.nishayani.school.rest.model.SchoolRestModel
	 * 
	 * purpose		:
	 *
	 * Date    		:	16-Dec-2014 6:41:39 pm
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "SchoolRestModel [opType=" + opType + ", grNumber=" + grNumber
				+ ", schoolNumber=" + schoolNumber + ", schoolName="
				+ schoolName + ", classId=" + classId + ", className="
				+ className + "]";
	}
	
	
}
