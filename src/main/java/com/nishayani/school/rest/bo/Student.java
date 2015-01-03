/**
 * Project				:	prjClientRestSchool
 * Organization			:	Indian School Al Maabela | Muscat | Oman
 * 
 * Author				:	Bhabesh
 *
 * FrameWork			:	Spring 3.1.0 (Annotation) Portlet
 * 
 * File Name			:	Student.java
 * Package Name			:	com.nishayani.school.rest.bo
 * Date of creation		:	27-Dec-2014  9:44:58 pm
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
package com.nishayani.school.rest.bo;

/**
 * @author bhabesh
 *
 */
public class Student
{
	private	String 	grno;
	private String	firstName;
	private	String	middleName;
	private	String	lastName;
	private	String	classAdmission;
	/**
	 * Getter Method	: getGrno
	 * @return the grno
	 * 
	 * Date				: 27-Dec-2014
	 */
	public String getGrno()
	{
		return grno;
	}
	/**
	 * Setter method : setGrno
	 * @param grno the grno to set
	 * 
	 * Date          : 27-Dec-2014 9:45:58 pm
	 */
	public void setGrno(String grno)
	{
		this.grno = grno;
	}
	/**
	 * Getter Method	: getFirstName
	 * @return the firstName
	 * 
	 * Date				: 27-Dec-2014
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * Setter method : setFirstName
	 * @param firstName the firstName to set
	 * 
	 * Date          : 27-Dec-2014 9:45:58 pm
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	/**
	 * Getter Method	: getMiddleName
	 * @return the middleName
	 * 
	 * Date				: 27-Dec-2014
	 */
	public String getMiddleName()
	{
		return middleName;
	}
	/**
	 * Setter method : setMiddleName
	 * @param middleName the middleName to set
	 * 
	 * Date          : 27-Dec-2014 9:45:58 pm
	 */
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	/**
	 * Getter Method	: getLastName
	 * @return the lastName
	 * 
	 * Date				: 27-Dec-2014
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * Setter method : setLastName
	 * @param lastName the lastName to set
	 * 
	 * Date          : 27-Dec-2014 9:45:58 pm
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	/**
	 * Getter Method	: getClassAdmission
	 * @return the classAdmission
	 * 
	 * Date				: 27-Dec-2014
	 */
	public String getClassAdmission()
	{
		return classAdmission;
	}
	/**
	 * Setter method : setClassAdmission
	 * @param classAdmission the classAdmission to set
	 * 
	 * Date          : 27-Dec-2014 9:45:58 pm
	 */
	public void setClassAdmission(String classAdmission)
	{
		this.classAdmission = classAdmission;
	}
	/**
	 * method name  : toString
	 * @return
	 * com.nishayani.school.rest.bo.Student
	 * 
	 * purpose		:
	 *
	 * Date    		:	27-Dec-2014 9:46:07 pm
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Student [grno=" + grno + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName
				+ ", classAdmission=" + classAdmission + "]";
	}
	
	
}
