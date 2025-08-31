package com.jspiders.department.dao;
import com.jspiders.department.dto.Department;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
public class DepartmentDao {
	public static void insertDepartment(int departmentNumber,String departmentName,String location) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("department");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Department department = new Department();
		department.setDepartmentNumber(departmentNumber);
		department.setDepartmentName(departmentName);
		department.setLocation(location);
		transaction.begin();
		manager.persist(department);
		transaction.commit();
		System.out.println("department record inserted succesfully!!");
	}
	
	public static void findDepartment(int departmentNumber) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("department");
		EntityManager manager = factory.createEntityManager();
		Department department = manager.find(Department.class, departmentNumber);
		System.out.println("DEPTNO\t\tDNAME\t\tLOC");
		System.out.println(
				"----------------------------------------------------");
		System.out.println(department.getDepartmentNumber() + "\t\t" + department.getDepartmentName() + "\t\t" + department.getLocation() );

	}

	public static void updateDepartment(int departmentNumber) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employment");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Department department = manager.find(Department.class, departmentNumber);
		if (department != null) {
			department.setLocation(null);
			transaction.begin();
			manager.persist(department);
			transaction.commit();
			System.out.println("department record updated succesfully!!");
		}

	}

	public static void deleteDepartment(int departmentNumber) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employment");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Department department = manager.find(Department.class, departmentNumber);
		if (department != null) {
			transaction.begin();
			manager.remove(department);
			transaction.commit();
			System.out.println("department record deleted succesfully!!");
		}

	}
}
