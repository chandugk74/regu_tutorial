package com.myjavapractice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BasicSerializationExample {
	static final String filepath = "C:\\Users\\91948\\OneDrive\\Desktop\\Java\\emp.ser";

	public static void main(String[] args) throws ClassNotFoundException {
		Employee emp = new Employee();
		emp.setEmp_Name("Chandru");
		emp.setEmpID(123);
		serialize(emp);
		deserialize();
	}

	static void serialize(Employee emp) {

		try {
			FileOutputStream fil = new FileOutputStream(filepath);
			ObjectOutputStream outputstream = new ObjectOutputStream(fil);
			outputstream.writeObject(emp);
			outputstream.close();

		} catch (IOException ex) {
			System.out.println(ex);
		}
			}
	static void deserialize () throws ClassNotFoundException {
		
		try {
			FileInputStream file = new FileInputStream(filepath);
			ObjectInputStream inputStream = new ObjectInputStream(file);
			Employee emp1 = (Employee) inputStream.readObject();
			System.out.println(emp1);
			inputStream.close();
			
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
	}
}
