package com.myjavapractice.serialization;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

public class Employee implements Serializable {

//	public static void main(String[] args) {
	private int EmpID;
	private String Emp_Name;
	public static final String ORG_NAME = "TCS";
	public static final long SerialversionUUID = 25L;
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getEmp_Name() {
		return Emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}
	public static String getOrgName() {
		return ORG_NAME;
	}
	public static long getSerialversionuuid() {
		return SerialversionUUID;
	}
	@Override
	public String toString() {
		return "Employee [EmpID=" + EmpID + ", Emp_Name=" + Emp_Name + ", getEmpID()=" + getEmpID() + ", getEmp_Name()="
				+ getEmp_Name() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}