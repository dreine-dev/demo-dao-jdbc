package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createdDepartmentDao();
		
		System.out.println("\n=====Teste 1: department insert ====");
		Department newDepartment = new Department(null, "Máquinas");
		departmentDao.insert(newDepartment);
		System.out.println("insert new id: " + newDepartment.getId());
	}

}
