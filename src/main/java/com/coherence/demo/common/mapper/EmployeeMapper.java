package com.coherence.demo.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.coherence.demo.common.entity.Employee;
import com.coherence.demo.common.entity.EmployeeExample;

public interface EmployeeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Mar 28 22:12:12 EDT 2018
	 */
	long countByExample(EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Mar 28 22:12:12 EDT 2018
	 */
	int deleteByExample(EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Mar 28 22:12:12 EDT 2018
	 */
	int deleteByPrimaryKey(Short id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Mar 28 22:12:12 EDT 2018
	 */
	int insert(Employee record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Mar 28 22:12:12 EDT 2018
	 */
	int insertSelective(Employee record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Mar 28 22:12:12 EDT 2018
	 */
	List<Employee> selectByExample(EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Mar 28 22:12:12 EDT 2018
	 */
	Employee selectByPrimaryKey(Short id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Mar 28 22:12:12 EDT 2018
	 */
	int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Mar 28 22:12:12 EDT 2018
	 */
	int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Mar 28 22:12:12 EDT 2018
	 */
	int updateByPrimaryKeySelective(Employee record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Mar 28 22:12:12 EDT 2018
	 */
	int updateByPrimaryKey(Employee record);
}