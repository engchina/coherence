package com.coherence.demo.common.entity;

public class Employee {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column CSDEMO.EMPLOYEE.ID
	 * @mbg.generated  Thu Mar 15 17:47:15 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column CSDEMO.EMPLOYEE.FIRSTNAME
	 * @mbg.generated  Thu Mar 15 17:47:15 CST 2018
	 */
	private String firstname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column CSDEMO.EMPLOYEE.LASTNAME
	 * @mbg.generated  Thu Mar 15 17:47:15 CST 2018
	 */
	private String lastname;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column CSDEMO.EMPLOYEE.ID
	 * @return  the value of CSDEMO.EMPLOYEE.ID
	 * @mbg.generated  Thu Mar 15 17:47:15 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column CSDEMO.EMPLOYEE.ID
	 * @param id  the value for CSDEMO.EMPLOYEE.ID
	 * @mbg.generated  Thu Mar 15 17:47:15 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column CSDEMO.EMPLOYEE.FIRSTNAME
	 * @return  the value of CSDEMO.EMPLOYEE.FIRSTNAME
	 * @mbg.generated  Thu Mar 15 17:47:15 CST 2018
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column CSDEMO.EMPLOYEE.FIRSTNAME
	 * @param firstname  the value for CSDEMO.EMPLOYEE.FIRSTNAME
	 * @mbg.generated  Thu Mar 15 17:47:15 CST 2018
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column CSDEMO.EMPLOYEE.LASTNAME
	 * @return  the value of CSDEMO.EMPLOYEE.LASTNAME
	 * @mbg.generated  Thu Mar 15 17:47:15 CST 2018
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column CSDEMO.EMPLOYEE.LASTNAME
	 * @param lastname  the value for CSDEMO.EMPLOYEE.LASTNAME
	 * @mbg.generated  Thu Mar 15 17:47:15 CST 2018
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}