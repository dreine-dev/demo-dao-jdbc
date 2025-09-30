package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = new Department();

		System.out.println("\n=== TEST 1: findById =======");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);

		System.out.println("\n=== TEST 2: findAll =======");
		List<Department> list = departmentDao.findAll();
		for (Department dep2 : list) {
			System.out.println(dep2);
		}

		System.out.println("\n=== TEST 3: insert =======");
		department = new Department(null, "Ferramentas");
		departmentDao.insert(department);
		System.out.println("Insert new id = " + department.getId());

		System.out.println("\n=== TEST 4: update =======");
		department = departmentDao.findById(1);
		department.setName("Music");
		departmentDao.update(department);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete complete!");

		sc.close();

	}

}
