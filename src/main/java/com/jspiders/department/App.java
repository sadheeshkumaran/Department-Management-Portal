package com.jspiders.department;

import java.util.Scanner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import com.jspiders.department.dao.DepartmentDao;
import com.jspiders.department.dto.Department;


public class App {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Welcome to Department management portal (Beta)");
		System.out.println("=====================================");
		System.out.println("CHOOSE WHAT OPERATION YOU WANT TO DO :");
		System.out.println("1.Insert Data \n2.Find Data \n3.Update Data(Stub) \n4.Delete Data");
		int choice = scn.nextInt();

		switch (choice) {

		case 1:
			while (true) {
				System.out.println("enter department number");
				int departmentNumber = scn.nextInt();
				scn.nextLine();
				System.out.println("enter department name");
				String departmentName = scn.nextLine();
				System.out.println("enter department location");
				String location = scn.nextLine();
					
				DepartmentDao.insertDepartment(departmentNumber, departmentName, location);
				System.out.println("------------------------------------------------");
				System.out.println("employer record created want to add more y/n:");
				String y = scn.next();
				if (y.equalsIgnoreCase("y")) {
					continue;
				} else {
					System.out.println("Thank You !!");
					break;
				}

			}
			break;

		case 2:
			System.out.println("Enter department number");
			int dNum = scn.nextInt();
			DepartmentDao.findDepartment(dNum);
			break;

		case 3:
			System.out.println("Enter department number");
			int dNum2 = scn.nextInt();
			DepartmentDao.updateDepartment(dNum2);
			break;

		case 4:
			System.out.println("Enter department number");
			int dNum3 = scn.nextInt();
			DepartmentDao.deleteDepartment(dNum3);
			break;

		default:
			System.out.println("Enter valid Option....");

		}

	}

}
