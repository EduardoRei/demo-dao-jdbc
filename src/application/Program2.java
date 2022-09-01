package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println(" === TEST 1: Department findById ====");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		
		System.out.println("\n === TEST 2: Department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department department2 : list) {
			System.out.println(department2);
		}
		
		System.out.println("\n === TEST 3: Department Update ====");
		department = departmentDao.findById(3);
		department.setName("Furniture");
		departmentDao.update(department);
		System.out.println("Update Completed! ");
		
		System.out.println("\n === TEST 4: Department Insert ====");
		Department newDepartment = new Department(null, "Acessories");
		departmentDao.insert(newDepartment);
		System.out.println("New Department inserted, id = " + newDepartment.getId());
		
	
		
		System.out.println("\n === TEST 5: Department Delete ====");
		departmentDao.deleteById(7);
		System.out.println("Departmente deleted!");
		
	}

}
